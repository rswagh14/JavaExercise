package com.myexercise.pkg.classesandobjects;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Car {

    private int speed;
    private String name;

    public Car()
    {
        speed = 0;
        name = "BMW";
    }

    public void increaseSpeed()
    {
        speed++;
    }

    public void showcarinfo()
    {
        System.out.println("\n Name :" +name+"\n Speed :" +speed);
    }

}
