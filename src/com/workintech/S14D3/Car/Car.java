package com.workintech.S14D3.Car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
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
