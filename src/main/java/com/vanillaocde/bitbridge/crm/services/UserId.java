package com.vanillaocde.bitbridge.crm.services;

import jakarta.persistence.Embeddable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;


public class UserId implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {

       String prefix = "UN";
       Random random = new Random();
       int randomNumber = random.nextInt(011111111, 99999999);
       String generatedId = prefix + randomNumber;

        return generatedId;
    }
}
