package unittest;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Override by method
class UserDBWithSuccess implements UserDB {
    @Override
    public String getNameById(int id) {
        return "somkiat";
    }
}

class HelloTest {

    @Test
    @DisplayName("ทำการทดสอบกับ database (I = Isolate/Independent)")
    public void case02() {
        // Dependency Injection (DI)
        UserDB  userDB = new UserDBWithSuccess();
        Hello hello = new Hello(userDB); // 1. Constructor Injection
        hello.userDB = new UserDBWithSuccess();  // 2. Field/property/setter Injection
        String name = hello.workWithDb(userDB, 1); // Method Injection
        assertEquals("somkiat", name);
    }

    @Test
    @DisplayName("เกิด exception เมื่อค้นหาผู้ใช้งาน id=2 ไม่เจอ")
    public void case03() {
        Hello hello = new Hello();
        hello.userDB = id -> {
            throw new UserNotFoundException("Id=" + id + " not found");
        };
        // Junit 5 + Exception
        Exception exception = assertThrows(UserNotFoundException.class, () ->
                hello.workWithDb(2));
        assertEquals("Id=2 not found", exception.getMessage());
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