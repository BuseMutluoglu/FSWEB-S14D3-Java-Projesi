package com.workintech.S14D3.CarSkeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String  startEngine(){
        System.out.println("Clsas Name: " + getClass().getSimpleName());
        return getName() + " starting engine";
    }
    public String drive(){
        runEngine(this); //drive ı kim cağırıyorsa this odur. instanceın kendisi
        return getName() + " is driving...";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            //((GasPoweredCar)carSkeleton)
            System.out.println("The car engine is starting with gas");
        } else if (carSkeleton instanceof HybridCar) {
            System.out.println("The car engine is starting with boyh gas and hybrid");
        } else if (carSkeleton instanceof ElectricCar) {
            ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with Electric");
        }  else {
            System.out.println("Car type is not valid.");
        }
    }

    @Override
    public String toString() {
    StringBuilder builder=new StringBuilder();
    builder.append("Name: " + name + "\n");
    builder.append("Description: " + description +"\n");
    return builder.toString();
    }
}
