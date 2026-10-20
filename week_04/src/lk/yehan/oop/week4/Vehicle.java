package lk.yehan.oop.week4;

public class Vehicle {
    private String vehicleId;
    private String make;
    private String model;
    private int topSpeed;
    private int capacity;


    public Vehicle() {
    }
    public Vehicle(String vehicleId, String make, String model, int topSpeed, int capacity){
        super();
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
    }

    // getters
    public String getVehicleId(){
        return vehicleId;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getTopSpeed(){
        return topSpeed;
    }

    public int getCapacity(){
        return capacity;
    }

    // setters
    public void setVehicleId(String vehicleId){
        this.vehicleId = vehicleId;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }


}