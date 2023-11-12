package com.vanillaocde.bitbridge.crm.services;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;

public class PasswordValidatorService extends IllegalArgumentException{
    
    public String validatePasswordMethod(DTORegUser data) throws IllegalArgumentException {

        String passwd = data.password();

        if (passwd.length() < 8) {
            throw new IllegalArgumentException("Invalid Password: Password must be at least 8 characters long") ;
        } 

        if (!passwd.matches(".*[a-z].*") || !passwd.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Invalid Password: Password must contain uppercase and lowercasr characters");
        }
        
        if (!passwd.matches(".*[!@#$%^&*()-+=].*")) {
            throw new IllegalArgumentException("Invalid Password: Password must contain at least one special character.");
        }

        return "Password Ok";
    }

}
