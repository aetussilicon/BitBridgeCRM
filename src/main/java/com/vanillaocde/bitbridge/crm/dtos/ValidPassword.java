package com.vanillaocde.bitbridge.crm.dtos;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.passay.PasswordValidator;

import ch.qos.logback.core.subst.Token.Type;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    
    String message() default "Invalid Password";
    Class<?>[ ]groups() default {};
    Class<? extends Payload>[] paylod() default {}; 
}
