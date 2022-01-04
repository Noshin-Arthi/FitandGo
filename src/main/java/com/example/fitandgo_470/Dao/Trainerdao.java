package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Trainer;
import com.example.fitandgo_470.Model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Trainerdao extends JpaRepository<Trainer,Integer> {
}
