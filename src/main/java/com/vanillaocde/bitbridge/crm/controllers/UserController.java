package com.vanillaocde.bitbridge.crm.controllers;

import  com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.dtos.DTOUpdateUser;
import com.vanillaocde.bitbridge.crm.model.Users;
import com.vanillaocde.bitbridge.crm.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserController {

    @Autowired
    UserRepository repository;

    //Register new User
    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity regUser(@RequestBody @Valid DTORegUser data){
        repository.save(new Users(data));
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateUser(@ResponseBody @Valid DTOUpdateUser data) {
        if (!repository.existsById(data.gsid)) {
            return ResponseEntity.notFound().build();
        }

        Users existingUsers = repository.findById(data.gsid).orElse(null);
        if (existingUsers != null) {
            repository.save(existingUsers);
            return ResponseEntity.ok(existingUsers);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}
