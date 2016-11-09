package com.myexercise.pkg;

import com.myexercise.pkg.ExceptionHandling.Primer;
import com.myexercise.pkg.InnerClasses.Outer;
import com.myexercise.pkg.Interface.Mobile;
import com.myexercise.pkg.Interface.TypeListenerthree;
import com.myexercise.pkg.classesandobjects.Car;
import com.myexercise.pkg.inheritance.Bird;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Main {

    public static void classesandobjects()
    {
        System.out.println("Classes and Objects ");
        Car car = new Car();
        car.increaseSpeed();
        car.showcarinfo();
    }

    public static void inheritance()
    {
        Bird bird = new Bird();
        bird.setFlyingspeed(10);
        bird.setWeight(20);
        bird.setIsmigrated(true);
        bird.setName("Parrot");
        bird.setPrice(100);
        bird.setIsflying(true);

        System.out.println(bird.toString());
    }

    public static void interfaces(){

        Mobile mobile = new Mobile();
        mobile.dial("35434565467");
        mobile.checkType();
    }


    public static void exceptionHandling(){

        Primer primer = new Primer();
        primer.trycatch();
       primer.throwsKeyword();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public static void innerClasses(){

        Outer outerObj = new Outer();
        outerObj.accessInner();
        Outer.SimpleInner simpleInner = outerObj.new SimpleInner();
        simpleInner.accessOuter();

        Outer.StaticInner staticInner = new Outer.StaticInner();


    }

    public static void main(String[] args)
    {
        System.out.println("\n Executing Module One \n");
        classesandobjects();
        inheritance();
        interfaces();
        exceptionHandling();
        innerClasses();

    }





}
