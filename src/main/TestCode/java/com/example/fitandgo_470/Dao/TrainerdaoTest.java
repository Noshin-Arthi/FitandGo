package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Gym;
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
class TrainerdaoTest {
    @Mock
    Trainerdao trainerdao;
    Trainer trainer;

    @BeforeEach
    void setUp() {
       trainer = new Trainer("John Wick", "01793939939","john@gmail.com", "5 Years");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testsavetrainer(){
        Trainer trainer1 = trainerdao.save(trainer);
        verify(trainerdao).save(trainer);
    }

    @Test
    void testdeletetrainer(){
        trainerdao.delete(trainer);
        Trainer trainer1 = trainerdao.getById(trainer.getTrainerId());
        assertNull(trainer1);
    }
    @Test
    void testgetByIDtrainer(){
        when(trainerdao.findById(1))
                .thenReturn(Optional.empty());
    }
    @Test
    void testgetAlltrainer(){
        List<Trainer> trainerList = trainerdao.findAll();
        assertNotNull(trainerList);
    }
}