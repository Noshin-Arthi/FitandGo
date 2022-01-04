package com.example.fitandgo_470.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;
    private String name;
    private String area;
    private String district;
    private int appointment;
    private int chamber;
    @OneToMany(mappedBy = "hospital")
    private List<Nutritionist> nutritionists;

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Nutritionist> getNutritionists() {
        return nutritionists;
    }

    public void setNutritionists(List<Nutritionist> nutritionists) {
        this.nutritionists = nutritionists;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    public int getChamber() {
        return chamber;
    }

    public void setChamber(int chamber) {
        this.chamber = chamber;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "HospitalId=" + hospitalId +
                ", Name='" + name + '\'' +
                ", Area='" + area + '\'' +
                ", District='" + district + '\'' +
                ", Appointment=" + appointment +
                ", Chamber=" + chamber +
                ", Nutritionists=" + nutritionists +
                '}';
    }
}