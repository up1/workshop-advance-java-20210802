package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService generateIdService;

//    @MockBean
//    private Random random;

    @Test
    @DisplayName("เริ่มต้นทดสอบกับ spring boot test")
    public void case01(){
        String id = generateIdService.get();
        assertEquals("XYZ7", id);
    }

}