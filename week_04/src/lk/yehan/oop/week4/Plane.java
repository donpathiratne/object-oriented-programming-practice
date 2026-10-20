package lk.yehan.oop.week4;

public class Plane extends Vehicle{
    private double minSpan;
    private double minRunAway;

    public Plane(String vehicleId,
                 String make,
                 String model,
                 int topSpeed,
                 int capacity,
                 double minSpan,
                 double minRunAway){
        super(vehicleId, make, model, topSpeed, capacity);
        this.minRunAway = minRunAway;
        this.minSpan = minSpan;
    }

    // getters
    public double getMinSpan(){
        return minSpan;
    }

    public double getMinRunAway(){
        return minRunAway;
    }

    // setters
    public void setMinSpan(double minSpan){
        this.minSpan = minSpan;
    }

    public void setMinRunAway(double minRunAway){
        this.minRunAway = minRunAway;
    }
}