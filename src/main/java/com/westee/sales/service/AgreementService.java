package com.westee.sales.service;

import cn.dev33.satoken.exception.NotRoleException;
import cn.dev33.satoken.stp.StpUtil;
import com.github.pagehelper.PageHelper;
import com.westee.sales.entity.PageResponse;
import com.westee.sales.exceptions.HttpException;
import com.westee.sales.generate.Agreement;
import com.westee.sales.generate.AgreementExample;
import com.westee.sales.generate.AgreementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgreementService {

    AgreementMapper agreementMapper;

    @Autowired
    public AgreementService(AgreementMapper agreementMapper) {
        this.agreementMapper = agreementMapper;
    }

    public PageResponse<Agreement> getAgreementList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Agreement> agreements = agreementMapper.selectByExampleWithBLOBs(new AgreementExample());
        return PageResponse.pageData(pageNum, pageSize, agreements.size(), agreements);
    }

    public Agreement createAgreement(Agreement agreement) {
        checkAdminRole();

        LocalDateTime now = LocalDateTime.now();
        agreement.setCreatedAt(now);
        agreement.setUpdatedAt(now);
        agreementMapper.insert(agreement);
        return agreement;
    }

    public Agreement getAgreementById(long agreementId) {
        return agreementMapper.selectByPrimaryKey(agreementId);
    }

    public Agreement updateAgreement(Agreement agreement) {
        checkAdminRole();

        LocalDateTime now = LocalDateTime.now();
        agreement.setUpdatedAt(now);
        agreementMapper.updateByPrimaryKey(agreement);
        return agreement;
    }

    public void deleteAgreement(Long agreementId) {
        checkAdminRole();

        agreementMapper.deleteByPrimaryKey(agreementId);
    }

    private void checkAdminRole() {
        try {
            StpUtil.checkRole("admin");
        } catch (NotRoleException e) {
            throw HttpException.notAuthorized("没有权限");
        }
    }
}
