package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Hospital;
import com.example.fitandgo_470.Model.Nutritionist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Nutritionistdao  extends JpaRepository<Nutritionist,Integer> {
}
