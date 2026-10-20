package lk.yehan.oop.week4;

import javax.swing.*;
import java.lang.classfile.instruction.DiscontinuedInstruction;

public class Car extends Vehicle{
    private int doors;
    private String transmission;

    public Car(String vehicleId,
               String make,
               String model,
               int topSpeed,
               int capacity,
               int doors,
               String transmission){
        super(vehicleId, make, model,topSpeed,capacity);
        this.doors = doors;
        this.transmission = transmission;
    }

    //getters
    public int getDoors(){
        return doors;
    }

    public String getTransmission(){
        return transmission;
    }

    // setters
    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
}

