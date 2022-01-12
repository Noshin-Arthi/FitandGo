package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Gym;
import com.example.fitandgo_470.Model.Hospital;
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
class GymdaoTest {
    @Mock
    Gymdao gymdao;
    Gym gym;
    @BeforeEach
    void setUp() {
        gym = new Gym("Ladies Gym", "Dhanmondi","Dhaka", 10, 2);

    }

    @AfterEach
    void tearDown() {
        gym = null;
    }

    @Test
    void testsavegym(){
        Gym gym1 = gymdao.save(gym);
        verify(gymdao).save(gym);
    }

    @Test
    void testdeletegym(){
        gymdao.delete(gym);
        Gym gym1 = gymdao.getById(gym.getGymId());
        assertNull(gym1);
    }
    @Test
    void testgetByIDgym(){
        when(gymdao.findById(1))
                .thenReturn(Optional.empty());
    }
    @Test
    void testgetAllgym(){
        List<Gym> gymList = gymdao.findAll();
        assertNotNull(gymList);
    }
    @Test
    void testcheckseatstatus(){
        gymdao.findBySeat(gym.getGymId());
        verify(gymdao).findBySeat(gym.getGymId());
    }

}