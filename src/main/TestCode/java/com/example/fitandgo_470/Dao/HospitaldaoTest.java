package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Hospital;
import com.example.fitandgo_470.Model.Nutritionist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class HospitaldaoTest {
    @Mock
    Hospitaldao hospitaldao;
    Hospital hospital;


    @BeforeEach
    void setUp() {
        hospital = new Hospital("Al Helal", "Mirpur", "Dhaka", 1, 12);
    }

    @AfterEach
    void tearDown() {
        hospital = null;
    }
    @Test
    void testsavehospital(){
        Hospital hospital1 = hospitaldao.save(hospital);
        verify(hospitaldao).save(hospital);
    }
    @Test
    void testdeletehospital(){
        hospitaldao.delete(hospital);
        Hospital hospital1 = hospitaldao.getById(hospital.getHospitalId());
        assertNull(hospital1);
    }
    @Test
    void testgetByIDhospital(){
        when(hospitaldao.findById(1))
                .thenReturn(Optional.empty());
    }
    @Test
    void testgetAllhospital(){
        List<Hospital> hospitalList = hospitaldao.findAll();
        assertNotNull(hospitalList);
    }

}