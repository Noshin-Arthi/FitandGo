package com.example.fitandgo_470.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Nutritionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nutritionistId;
    private String name;
    private String phoneNumber;
    private String email;
    private String degree;
    private String startConsultation;
    private String endConsultation;
    @ManyToOne
    private Hospital hospital;

    public int getNutritionistId() {
        return nutritionistId;
    }

    public void setNutritionistId(int nutritionistId) {
        this.nutritionistId = nutritionistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStartConsultation() {
        return startConsultation;
    }

    public void setStartConsultation(String startConsultation) {
        this.startConsultation = startConsultation;
    }

    public String getEndConsultation() {
        return endConsultation;
    }

    public void setEndConsultation(String endConsultation) {
        this.endConsultation = endConsultation;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}