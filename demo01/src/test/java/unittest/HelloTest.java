package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("ทำการทดสอบกับ database (I = Isolate/Independent)")
    public void case02() {
        Hello hello = new Hello();
        hello.userDB = new UserDB(){
            @Override
            public String getNameById(int id) {
                return "somkiat";
            }
        };
        String name = hello.workWithDb(1);
        assertEquals("somkiat", name);
    }

    @Test
    @DisplayName("นี่คือ case แรกของการเขียนนะ")
    public void case01() {
        // Arrange == Given == Pre condition
        Hello hello = new Hello();
        // Act  == When == Action == Call target method
        String actualResult = hello.hi("somkiat");
        // Assert == Validate with expected result
        assertEquals("Hello, somkiat", actualResult);
    }

}