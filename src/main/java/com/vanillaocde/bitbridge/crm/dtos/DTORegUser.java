package com.vanillaocde.bitbridge.crm.dtos;

import com.vanillaocde.bitbridge.crm.services.UsernameGenerator;
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
        String password,

        String username
) {
        public String setUsername() {
                UsernameGenerator generator = new UsernameGenerator();
                return generator.generatedUsername(this);
        }
}
