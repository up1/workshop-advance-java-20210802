package com.example.workshopdip;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateIdService {

    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }

}
