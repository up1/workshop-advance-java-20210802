package testdouble;

import java.util.Random;

public class GenerateIdService {

    public String get() {
        Random random = new Random(); // Dependency
        int number = random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }

}
