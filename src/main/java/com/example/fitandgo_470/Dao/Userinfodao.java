package com.example.fitandgo_470.Dao;

import com.example.fitandgo_470.Model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userinfodao extends JpaRepository<Userinfo,Integer> {


}