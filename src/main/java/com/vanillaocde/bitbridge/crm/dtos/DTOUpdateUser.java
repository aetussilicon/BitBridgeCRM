package com.vanillaocde.bitbridge.crm.dtos;

public record DTOUpdateUser(
    String email,
    String password,
    String company_phone
) {
}