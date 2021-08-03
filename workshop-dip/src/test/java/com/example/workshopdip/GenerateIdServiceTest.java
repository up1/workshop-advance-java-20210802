package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
public class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService generateIdService;

    @MockBean
    private Random random;

    @Test
    @DisplayName("เริ่มต้นทดสอบกับ spring boot test")
    public void case01(){
        // Arrange
        when(random.nextInt(anyInt())).thenReturn(7); // Stub
        // Act
        String id = generateIdService.get();
        // Assert
        assertEquals("XYZ7", id);
    }

}