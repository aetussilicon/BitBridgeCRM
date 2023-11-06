package com.vanillaocde.bitbridge.crm.model;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.services.UserId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "users")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "gsid")
public class Users {

    @EmbeddedId
    private UserId gsid;
    private String name;
    private String surName;
    private String email;
    private String password;
    private String companyPhone;

    public Users(DTORegUser data) {
        this.name = data.name();
        this.surName = data.surName();
        this.email = data.email();
        this.password = data.password();
        this.companyPhone = data.companyPhone();
    }
}
