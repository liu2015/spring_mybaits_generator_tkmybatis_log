package com.example.demo.util.shiro;

import com.example.demo.entity.UserT;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper  {

    private RandomNumberGenerator randomNumberGenerator=new SecureRandomNumberGenerator();
    public static final String md5="md5";
    public static final int hash=2;

    public void encryptPassword(UserT userT){

        userT.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword= new SimpleHash(md5,userT.getPassword(), ByteSource.Util.bytes(userT.getCredentialsSalt()),hash).toHex();

        userT.setPassword(newPassword);
    }


}
