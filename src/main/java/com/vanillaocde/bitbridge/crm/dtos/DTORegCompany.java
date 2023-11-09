package com.vanillaocde.bitbridge.crm.dtos;

import jakarta.validation.constraints.NotBlank;

public record DTORegCompany (

        @NotBlank
        String razao_social,

        @NotBlank
        String cnpj,

        @NotBlank
        String industry,

        @NotBlank
        String address,

        @NotBlank
        String city,

        @NotBlank
        String postal_code,

        @NotBlank
        String country,
        String website,

        @NotBlank
        String channel
) {
}
