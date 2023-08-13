package com.workintech.S14D3.Car;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        setEngine(true);
        setWheels(4);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //ramdekiler eşitse this bu sınıf o gelen değer.
        if (o == null || getClass() != o.getClass()) return false;
        return ((Car) o).cylinders ==this.cylinders &&
                ((Car) o).name.equals(this.name);
        /*Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);*/
    }


    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        builder.append("engine=" + engine + "\n");
        builder.append(", cylinders=" + cylinders + "\n");
        return builder.toString();
    }
   public String startEngine(){
       System.out.println("Class Name: " + getClass().getSimpleName());
       return  " The car's engine is starting";
   }
   public String accelerate(){
       System.out.println("Class Name: " + getClass().getSimpleName());
       return " The car is accelerating";
   }
   public String  brake(){
       System.out.println("Class Name: " + getClass().getSimpleName());
       return  " The car is braking.";
   }

}
