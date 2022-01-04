package com.example.fitandgo_470.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private long transactionType;
    private String amount;
    private int gymId;
    private int hospitalId;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(long transactionType) {
        this.transactionType = transactionType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "UserID=" + userID +
                ", TransactionType='" + transactionType + '\'' +
                ", Amount=" + amount +
                ", GymId=" + gymId +
                ", HospitalId=" + hospitalId +
                '}';
    }
}
