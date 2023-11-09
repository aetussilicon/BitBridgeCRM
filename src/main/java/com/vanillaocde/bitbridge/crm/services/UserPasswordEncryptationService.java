//package com.vanillaocde.bitbridge.crm.services;
//
//import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class UserPasswordEncryptationService {
//
//    public String encryptPassword(DTORegUser data) {
//        String passwdToEncrypt = data.password();
//
//        String encyptedPassword = new BCryptPasswordEncoder().encode(passwdToEncrypt);
//
//        return encyptedPassword;
//    }

//    public static void main(String[] args) {
//        DTORegUser test = new DTORegUser(
//                "John",
//                "Keneddy",
//                "john@test.com",
//                "john123",
//                "",
//                "5511111111111");
//
//        UserPasswordEncryptationService userPasswordEncryptationService = new UserPasswordEncryptationService();
//
//        System.out.println(userPasswordEncryptationService.encryptPassword(test));
//
//    }
//}
