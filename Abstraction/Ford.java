package Abstraction;

import Abstraction.Car;

public class Ford extends HyperCar implements Car {


    public void bodyShape() {

        System.out.println(" Abstraction.Ford Body Shape has done");
    }

    public void engineStart() {
        System.out.println(" Abstraction.Ford Engine Started");
    }

    public void engineStop() {
        System.out.println(" Abstraction.Ford Engine Stopped");
    }


    public void electricEngine() {
        System.out.println(" Abstraction.Ford car Engine runs with Lithium Ion Battery");

    }


    public void colorOfCar () {
        System.out.println(" Abstraction.Ford car have any type of Color" );
    }


    public void flyingTech() {
        System.out.println(" Abstraction.Ford  using AroPlane Technology for" );

    }
}




