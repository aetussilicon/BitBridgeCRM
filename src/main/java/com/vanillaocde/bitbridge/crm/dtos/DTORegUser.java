package com.vanillaocde.bitbridge.crm.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DTORegUser(

        @NotBlank
        String name,

        @NotBlank
        String sur_name,

        @Email
        @NotBlank
        String email,

        @NotBlank
        String password
) {
}
