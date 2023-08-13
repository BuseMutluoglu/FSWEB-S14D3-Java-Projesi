package com.workintech.S14D3.CarSkeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Motor Çalıştırıldı");
    }
    public void drive(){
        runEngine();
        System.out.println("Driving");
    }
    protected void runEngine(){
        System.out.println("Motor çalıştır.");
    }
}
