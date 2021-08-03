package testdouble;

import java.util.Random;

public class GenerateIdService {
    // Dependency
    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get(Object name) {
        int number = random.nextInt(10);
//        random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }

}
