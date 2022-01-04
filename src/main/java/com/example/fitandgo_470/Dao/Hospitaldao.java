package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Gym;
import com.example.fitandgo_470.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hospitaldao extends JpaRepository<Hospital,Integer> {
}
