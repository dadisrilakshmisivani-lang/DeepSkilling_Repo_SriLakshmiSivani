package SpringWebProject.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // Secret key used to sign the JWT
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Token valid for 10 minutes
    private final long EXPIRATION_TIME = 1000 * 60 * 10;

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key)
                .compact();
    }
}