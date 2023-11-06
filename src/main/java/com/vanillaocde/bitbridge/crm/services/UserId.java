package com.vanillaocde.bitbridge.crm.services;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Random;

@Embeddable
public class UserId implements Serializable {

    private String gsid;
    public String generatedId () {

        Random rand = new Random();
        int rand1 = rand.nextInt(8);
        String prefix = "UN";
        String id = prefix + rand1;
        return id;
    }

    public UserId (String gsid) {
        this.gsid = generatedId();
    }
}
