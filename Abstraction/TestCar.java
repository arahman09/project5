package Abstraction;

import Abstraction.*;

public class TestCar {



    public static void main (String [] args) {

        Car myFirstCar = new Ford();
        myFirstCar.bodyShape();
        myFirstCar.engineStart();
        myFirstCar.engineStop();


        System.out.println();

        Car myNewCar = new BMW();
        myNewCar.bodyShape();
        myNewCar.engineStart();
        myNewCar.engineStop();



        System.out.println();


        HyperCar myHyperCar = new Ford();
        myHyperCar.motorEngine();
        myHyperCar.electricEngine();

        System.out.println();

        myHyperCar = new BMW();
        myHyperCar.electricEngine();


        System.out.println();

        Ford fusion = new Ford();
        fusion.colorOfCar();
        BMW series3= new BMW();
        series3.colorOfCar();

        System.out.println();

        fusion.flyingTech();
        series3.flyingTech();
        FlyingCar.flyingHeight();

    }

}
