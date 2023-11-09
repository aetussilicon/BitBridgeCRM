package com.vanillaocde.bitbridge.crm.repositories;

import com.vanillaocde.bitbridge.crm.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
