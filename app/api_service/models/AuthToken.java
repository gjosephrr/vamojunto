package api_service.models;

import java.time.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by js on 20/05/16.
 */
public class AuthToken {

    private String userToken = null;
    LocalDateTime expirationTimestamp = null;

    public String getToken(){
        return userToken;
    }

    public boolean hasExpired(){
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.isAfter(expirationTimestamp);
    }

    public boolean generateToken(String info){

        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return false;
        }

        if(m != null) {
            m.update(info.getBytes(),0,info.length());
            BigInteger i = new BigInteger(1, m.digest());
            this.userToken = String.format("%1$032x", i);
        }

        expirationTimestamp = LocalDateTime.now().plusHours(24);

        return true;

    }
}
