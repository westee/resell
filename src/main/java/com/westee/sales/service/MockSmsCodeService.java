package com.westee.sales.service;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.PullSmsSendStatusRequest;
import com.tencentcloudapi.sms.v20210111.models.PullSmsSendStatusResponse;
import com.tencentcloudapi.sms.v20210111.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20210111.models.SendSmsResponse;
import com.westee.sales.config.TencentSmsConfig;
import com.westee.sales.generate.SmsCodeExample;
import com.westee.sales.generate.SmsCodeMapper;
import com.westee.sales.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 文档地址
 * <a href="https://cloud.tencent.com/document/product/382/43194#.E6.8B.89.E5.8F.96.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81">腾讯短信文档地址</a>
 */
@Service
public class MockSmsCodeService implements SmsCodeService {

    private SmsCodeMapper smsCodeMapper;

    /* 必要步骤：
     * 实例化一个认证对象，入参需要传入腾讯云账户密钥对secretId，secretKey。
     * 这里采用的是从环境变量读取的方式，需要在环境变量中先设置这两个值。
     * 您也可以直接在代码中写死密钥对，但是小心不要将代码复制、上传或者分享给他人，
     * 以免泄露密钥对危及您的财产安全。
     * SecretId、SecretKey 查询: https://console.cloud.tencent.com/cam/capi */
    Credential cred = new Credential(TencentSmsConfig.getSecretId(), TencentSmsConfig.getSecretKey());

    @Autowired
    public MockSmsCodeService(SmsCodeMapper smsCodeMapper) {
        this.smsCodeMapper = smsCodeMapper;
    }

    public HttpProfile getHttpProfile() {
        // 实例化一个http选项，可选，没有特殊需求可以跳过
        HttpProfile httpProfile = new HttpProfile();
        /* SDK默认使用POST方法。
         * 如果您一定要使用GET方法，可以在这里设置。GET方法无法处理一些较大的请求 */
        httpProfile.setReqMethod("POST");
        /* SDK有默认的超时时间，非必要请不要进行调整
         * 如有需要请在代码中查阅以获取最新的默认值 */
        httpProfile.setConnTimeout(60);
        /* 指定接入地域域名，默认就近地域接入域名为 sms.tencentcloudapi.com ，也支持指定地域域名访问，例如广州地域的域名为 sms.ap-guangzhou.tencentcloudapi.com */
        httpProfile.setEndpoint("sms.tencentcloudapi.com");
        return httpProfile;
    }

    ClientProfile getClientProfile(HttpProfile httpProfile) {
        ClientProfile clientProfile = new ClientProfile();
        /* SDK默认用TC3-HMAC-SHA256进行签名
         * 非必要请不要修改这个字段 */
        clientProfile.setSignMethod("HmacSHA256");
        clientProfile.setHttpProfile(httpProfile);
        return clientProfile;
    }

    @Override
    public String sendCode(String tel) {
        try {
            String code = Utils.generateRandomCode(6);
            HttpProfile httpProfile = getHttpProfile();

            /* 非必要步骤:
             * 实例化一个客户端配置对象，可以指定超时时间等配置 */
            ClientProfile clientProfile = getClientProfile(httpProfile);
            /* 实例化要请求产品(以sms为例)的client对象
             * 第二个参数是地域信息，可以直接填写字符串ap-guangzhou，支持的地域列表参考 https://cloud.tencent.com/document/api/382/52071#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8 */
            SmsClient client = new SmsClient(cred, AP_REGION.AP_Beijing.ap, clientProfile);

            SendSmsRequest req = new SendSmsRequest();

            /* 短信应用ID: 短信SdkAppId在 [短信控制台] 添加应用后生成的实际SdkAppId，示例如1400006666 */
            // 应用 ID 可前往 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage) 查看
            req.setSmsSdkAppId(TencentSmsConfig.getSdkAppId());

            /* 短信签名内容: 使用 UTF-8 编码，必须填写已审核通过的签名 */
            // 签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看
            String signName = "腾讯云";
            req.setSignName(signName);

            /* 模板 ID: 必须填写已审核通过的模板 ID */
            // 模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看
            req.setTemplateId(TencentSmsConfig.getTemplateId());

            /* 模板参数: 模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致，若无模板参数，则设置为空 */
            String[] templateParamSet = {"1234", code};
            req.setTemplateParamSet(templateParamSet);

            /* 下发手机号码，采用 E.164 标准，+[国家或地区码][手机号]
             * 示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号，最多不要超过200个手机号 */
            String[] phoneNumberSet = {"+86" + tel};
            req.setPhoneNumberSet(phoneNumberSet);

            /* 用户的 session 内容（无需要可忽略）: 可以携带用户侧 ID 等上下文信息，server 会原样返回 */
            String sessionContext = "";
            req.setSessionContext(sessionContext);

            /* 短信码号扩展号（无需要可忽略）: 默认未开通，如需开通请联系 [腾讯云短信小助手] */
            String extendCode = "";
            req.setExtendCode(extendCode);

            /* 通过 client 对象调用 SendSms 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的 res 是一个 SendSmsResponse 类的实例，与请求对象对应 */
            SendSmsResponse res = client.SendSms(req);

            // 输出json格式的字符串回包
            System.out.println(SendSmsResponse.toJsonString(res));
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }

        return "000000";
    }

    @Override
    public boolean getCodeStatus(String tel, String code) {
        try {
            HttpProfile httpProfile = getHttpProfile();

            /* 非必要步骤:
             * 实例化一个客户端配置对象，可以指定超时时间等配置 */
            ClientProfile clientProfile = getClientProfile(httpProfile);

            /* 实例化要请求产品(以sms为例)的client对象
             * 第二个参数是地域信息，可以直接填写字符串ap-guangzhou，支持的地域列表参考 https://cloud.tencent.com/document/api/382/52071#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8 */
            SmsClient client = new SmsClient(cred, "ap-guangzhou", clientProfile);

            PullSmsSendStatusRequest req = new PullSmsSendStatusRequest();

            /* 短信应用ID: 短信SdkAppId在 [短信控制台] 添加应用后生成的实际SdkAppId，示例如1400006666 */
            req.setSmsSdkAppId(TencentSmsConfig.getSdkAppId());

            // 设置拉取最大条数，最多100条
            Long limit = 5L;
            req.setLimit(limit);

            /* 通过 client 对象调用 PullSmsSendStatus 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的 res 是一个 PullSmsSendStatusResponse 类的实例，与请求对象对应 */
            PullSmsSendStatusResponse res = client.PullSmsSendStatus(req);

            // 输出json格式的字符串回包
            System.out.println(PullSmsSendStatusResponse.toJsonString(res));
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void getSmsCodeFrequency(String tel) {
        // 创建一个 Example 对象
        SmsCodeExample example = new SmsCodeExample();
        // 创建一个 Criteria 对象
        SmsCodeExample.Criteria criteria = example.createCriteria();
        // 设置查询条件：未使用的 code，创建时间在五分钟内
        criteria.andUsedEqualTo(false);
        criteria.andCreatedAtBetween(LocalDateTime.now().minusMinutes(5), LocalDateTime.now());
        // 调用 countByExample 方法，返回符合条件的记录数量
        long count = smsCodeMapper.countByExample(example);
    }

    enum AP_REGION {
        AP_Guangzhou("ap-guangzhou"), AP_Nanjing("ap-nanjing"), AP_Beijing("ap-beijing");

        final String ap;

        AP_REGION(String s) {
            ap = s;
        }
    }
}
