package com.vanillaocde.bitbridge.crm.dtos;

import jakarta.validation.ConstraintValidator;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String>{
    
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
    }
}
