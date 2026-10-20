package lk.yehan.oop.week4;

public class Boat extends Vehicle{
    private String hullMaterial;
    private int minDepth;

    public Boat(String vehicleId,
                String make,
                String model,
                int topSpeed,
                int capacity,
                String hullMaterial,
                int minDepth){
        super(vehicleId, make, model, topSpeed, capacity);
        this.hullMaterial = hullMaterial;
        this.minDepth = minDepth;
    }

    // getters
    public String getHullMaterial(){
        return hullMaterial;
    }

    public int getMinDepth(){
        return minDepth;
    }

    //setters
    public void setHullMaterial(String hullMaterial){
        this.hullMaterial = hullMaterial;
    }

    public void setMinDepth(int minDepth){
        this.minDepth = minDepth;
    }

}

