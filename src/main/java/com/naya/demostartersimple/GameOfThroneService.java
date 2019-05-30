package com.naya.demostartersimple;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class GameOfThroneService {

    @Autowired
    private Faker faker;

    public String getPersonName() {
        return faker.gameOfThrones().character();
    }
}
