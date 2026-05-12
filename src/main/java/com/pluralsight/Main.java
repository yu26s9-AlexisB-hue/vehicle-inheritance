package com.pluralsight;

public class Main {
    public static void main(){

        //creating the moped
        Moped m = new Moped("Gray and White",3,2,1,2.3,true,2.5);

        //Creating the car
        Car Lexus = new Car("Blue",6,25,4, 4, false,true);

        //semi truck
        SemiTruck s = new SemiTruck("Red and Black",30,50,5,3000,6,true);

        //Hovercraft
        Hovercraft h = new Hovercraft("Pink",7,6,4,13,"water",true);

    }
}
