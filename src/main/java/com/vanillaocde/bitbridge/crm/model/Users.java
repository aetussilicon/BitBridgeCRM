package com.vanillaocde.bitbridge.crm.model;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.services.UserId;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Table (name = "users")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "gsid")
@Setter
public class Users {

    @Id
    @GenericGenerator(name = "gsid", strategy = "com.vanillaocde.bitbridge.crm.services.UserId")
    @GeneratedValue(generator = "gsid")
    @Column(name = "gsid")
    private String gsid;
    private String name;
    private String surName;
    private String email;
    private String password;

    public Users(DTORegUser data) {
        this.name = data.name();
        this.surName = data.sur_name();
        this.email = data.email();
        this.password = data.password();
    }
}
