package com.myexercise.pkg.ExceptionHandling;

import java.io.IOException;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Primer {

    public void trycatch() {
        try {
            int i = 10 / 0;   // this would generate Runtime Exception,throw arithmetic exception
        }
         catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Executed......");
    }


    public void throwsKeyword(){

        try {
            calculate(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void calculate(int num1, int num2) throws RuntimeException,Exception
    {
        int num = num1/num2;
    }


}
