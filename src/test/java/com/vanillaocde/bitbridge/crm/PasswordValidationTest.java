package com.vanillaocde.bitbridge.crm;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.services.PasswordValidatorService;

public class PasswordValidationTest {
    public static void main(String[] args) {
        DTORegUser user = new DTORegUser(
            "Pedro", 
            "Alcântara", 
            "pedro.alcantara@bitbridge.com", 
            "Pass01%o6", 
            "", 
            "5511111111111");

        PasswordValidatorService validator = new PasswordValidatorService();

        System.out.println(validator.validatePasswordMethod(user));
    }
}
