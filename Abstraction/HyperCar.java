package Abstraction;

import Abstraction.FlyingCar;

public abstract class HyperCar implements FlyingCar {

    public void motorEngine(){
        System.out.println(" This Abstraction.Car engine runs with Gasoline");

    }

    public abstract void electricEngine();

}


