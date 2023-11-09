package com.vanillaocde.bitbridge.crm.services;

import com.vanillaocde.bitbridge.crm.model.Company;
import com.vanillaocde.bitbridge.crm.model.Users;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;


public class IdGeneratorService implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String entityType = determineEntityTypr(object);
        String prefix;

        switch (entityType) {
            case "DTORegUser":
                prefix = "UN";
                break;
            case "DTORegCompany":
                prefix = "EP";
                break;
            default:
                return new IllegalArgumentException("A entidade " + entityType + "é desconhecida");

        }
        //String prefix = "UN";
        Random random = new Random();
        int randomNumber = random.nextInt(10000000, 99999999);

        return prefix + randomNumber;
    }

    private String determineEntityTypr(Object object) {
        if (object instanceof Users) {
            return "DTORegUser";
        } else if (object instanceof Company) {
            return "DTORegCompany";
        }

        throw new IllegalArgumentException("Entidade desconhecida");
    }

}
