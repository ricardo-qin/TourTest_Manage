package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encoderPassWord(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String str="lisi";
        String pwd=encoderPassWord(str);
        System.out.println(pwd);
    }
}
