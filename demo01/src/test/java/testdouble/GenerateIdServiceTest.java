package testdouble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateIdServiceTest {

    /*
    Good Unit Testing (FIRST)
        - Fast
        - Isolated/Independent (Not OK)
        - Repeat (Not Ok)
     */

    @Test
    @DisplayName("ID = XYZ7")
    public void case01() {
        GenerateIdService service = new GenerateIdService();
        String id = service.get();
        assertEquals("XYZ7", id);
    }

}