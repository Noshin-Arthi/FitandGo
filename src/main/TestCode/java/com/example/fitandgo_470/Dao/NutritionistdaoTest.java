package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Nutritionist;
import com.example.fitandgo_470.Model.Trainer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class NutritionistdaoTest {
    @Mock
    Nutritionistdao nutritionistdao;
    Nutritionist nutritionist;

    @BeforeEach
    void setUp() {
        nutritionist = new Nutritionist("Dr.Harun", "012392226363", "harun@gmail.com", "FCPS, MBBS");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testsavenutritionist(){
        Nutritionist nutritionist1 = nutritionistdao.save(nutritionist);
        verify(nutritionistdao).save(nutritionist);
    }

    @Test
    void testdeletenutritionist(){
        nutritionistdao.delete(nutritionist);
        Nutritionist nutritionist1 = nutritionistdao.getById(nutritionist.getNutritionistId());
        assertNull(nutritionist1);
    }
    @Test
    void testgetByIDnutritionist(){
        when(nutritionistdao.findById(1))
                .thenReturn(Optional.empty());
    }
    @Test
    void testgetAllnutritionist(){
        List<Nutritionist> nutritionistList = nutritionistdao.findAll();
        assertNotNull(nutritionistList);
    }
}