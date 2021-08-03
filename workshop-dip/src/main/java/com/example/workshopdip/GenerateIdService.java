package com.example.workshopdip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateIdService {

    @Autowired
    private Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }

}
