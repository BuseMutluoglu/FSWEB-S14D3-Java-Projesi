package com.workintech.S14D3.CarSkeleton;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
      StringBuilder builder=new StringBuilder();
      builder.append("Name: " + getName() + "\n");
      builder.append("Description: " + getDescription() + "\n");
      builder.append("Cylinders: " + cylinders + "\n");
      builder.append("avgKmPerLitre: " +avgKmPerLitre + "\n");
      return builder.toString();
    }
}
