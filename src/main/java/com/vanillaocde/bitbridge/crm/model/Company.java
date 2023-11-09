package com.vanillaocde.bitbridge.crm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Table (name = "companies")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "gsid")
public class Company {

    @Id
    @GenericGenerator(name = "gsid", strategy = "com.vanillaocde.bitbridge.crm.services.UserId")
    @GeneratedValue(generator = "gsid")
    @Column(name = "gsid")
    private String gsid;
    private String razaoSocial;
    private String cnpj;
    private String industry;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String website;
    private String channel;
}
