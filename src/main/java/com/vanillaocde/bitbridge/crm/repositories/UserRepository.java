package com.vanillaocde.bitbridge.crm.repositories;

import com.vanillaocde.bitbridge.crm.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
