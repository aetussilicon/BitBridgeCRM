package com.vanillaocde.bitbridge.crm.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DTORegUser(

        @NotBlank
        String name,

        @NotBlank
        String surName,

        @Email
        String email,

        @NotBlank
        String password,

        @NotBlank
        String companyPhone
) {
}
