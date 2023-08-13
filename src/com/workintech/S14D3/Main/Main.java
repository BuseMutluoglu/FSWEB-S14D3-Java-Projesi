package com.workintech.S14D3.Main;

import com.workintech.S14D3.Car.Car;
import com.workintech.S14D3.Car.Ford;
import com.workintech.S14D3.Car.Holden;
import com.workintech.S14D3.Car.Mitsubishi;
import com.workintech.S14D3.CarSkeleton.CarSkeleton;
import com.workintech.S14D3.CarSkeleton.GasPoweredCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        CarSkeleton carSkeleton=new CarSkeleton("Volvo","dütdüt");
        carSkeleton.startEngine();

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        CarSkeleton carSkeleton1= new GasPoweredCar("Şahin","Kro54", 75,2);
        carSkeleton1.drive();
        System.out.println(carSkeleton1);

    }
}