package com.vanillaocde.bitbridge.crm.services;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;

import java.util.Random;

public class UsernameGenerator {

    public String generatedUsername(DTORegUser data) {

        String firstName = data.name();
        String lastName = data.sur_name();

        if (firstName != null && lastName != null && firstName.length() >= 3 && lastName.length() >= 3 ) {
            String subFirstName = firstName.substring(0, 3);
            String subLastName = lastName.substring(0, 3);

            Random random = new Random();
            int randInt = random.nextInt(1000, 9999);

            String generatedUsername = (subFirstName + subLastName + randInt).toUpperCase();

            return generatedUsername;
        }

        return "Could not create username";
    }
}
