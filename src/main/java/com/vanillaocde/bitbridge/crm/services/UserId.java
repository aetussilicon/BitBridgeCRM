package com.vanillaocde.bitbridge.crm.services;

import com.vanillaocde.bitbridge.crm.dtos.DTORegCompany;
import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;


public class UserId implements IdentifierGenerator {

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
                try {
                    throw new IllegalAccessException("Tipo de entidade desconhecida:" + entityType);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
        //String prefix = "UN";
        Random random = new Random();
        int randomNumber = random.nextInt(10000000, 99999999);

        return prefix + randomNumber;
    }

    private String determineEntityTypr(Object object) {
        if (object instanceof DTORegUser) {
            return "DTORegUser";
        } else if (object instanceof DTORegCompany) {
            return "DTORegCompany";
        }

        throw new IllegalArgumentException("Entidade desconhecida");
    }

}
