package com.westee.sales.realm;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * 在这个实现中，我们使用了 Auth0 开发的 Java JWT 库，它提供了生成和验证 JWT 的方法。
 * sign 方法使用 HMAC-SHA256 算法将用户名和密钥结合生成一个 token，verify 方法在验证 token 时需要使用相同的密钥。
 * <p>
 * getUsername 方法获取 JWT 中的用户名，它首先使用 JWT.decode 方法将 token 解码，然后调用 getSubject 方法获取用户名。
 * <p>
 * 需要注意的是，这个实现是一个简单的示例，不包含其他各种选项和错误处理。在实际应用中，需要根据具体需求进行调整和完善。
 */

public class JWTUtil {
    private static final long EXPIRATION_TIME = 30L * 24 * 60 * 60 * 1000; // 30天
    private static final String ISSUER = "my_issuer"; // JWT签发者
    private static final String secret = "my_secret"; //JWT密钥
    private static final String MY_TYPE = "my-token-type"; //JWT密钥

    public static String sign(String username, LoginType type) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                .withIssuer(ISSUER)
                .withSubject(username)
                .withClaim(MY_TYPE, type.getType())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(algorithm);
    }

    public static void verify(String token) throws JWTVerificationException {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer(ISSUER)
                .build();
        verifier.verify(token);
    }

    public static String getUsername(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getSubject();
    }

    public static String getTokenType(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaim(MY_TYPE).asString();
    }

}
