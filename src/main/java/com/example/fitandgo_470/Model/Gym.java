package com.example.fitandgo_470.Model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gymId;
    private String name;
    private String area;
    private String district;
    private int seat;
    private int duration;
    @OneToMany(mappedBy = "gym")
    private List<Trainer> trainers;

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
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

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "GymId=" + gymId +
                ", Name='" + name + '\'' +
                ", Area='" + area + '\'' +
                ", District='" + district + '\'' +
                ", Seat=" + seat +
                ", Duration=" + duration +
                ", Trainers=" + trainers +
                '}';
    }

}
