package com.vanillaocde.bitbridge.crm.controllers;

import com.vanillaocde.bitbridge.crm.dtos.DTORegCompany;
import com.vanillaocde.bitbridge.crm.model.Company;
import com.vanillaocde.bitbridge.crm.repositories.CompanyRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("companies")
public class CompanyController {

    @Autowired
    CompanyRepository repository;

    @PostMapping
    public void regCompany(@RequestBody @Valid DTORegCompany data) {
        repository.save(new Company(data));

    }
}
