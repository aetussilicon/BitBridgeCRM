package com.vanillaocde.bitbridge.crm.model;

import com.vanillaocde.bitbridge.crm.dtos.DTORegCompany;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Table (name = "companies")
@Entity (name = "company")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "gsid")
public class Company {

    @Id
    @GenericGenerator(name = "gsid", strategy = "com.vanillaocde.bitbridge.crm.services.IdGeneratorService")
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

    public Company(DTORegCompany data) {
        this.razaoSocial = data.razao_social();
        this.cnpj = data.cnpj();
        this.industry = data.industry();
        this.address = data.address();
        this.city = data.city();
        this.postalCode = data.postal_code();
        this.country = data.country();
        this.website = data.website();
        this.channel = data.channel();
    }
}
