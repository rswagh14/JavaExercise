package com.myexercise.pkg.Interface;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Mobile implements Typelistener
{

        public void checkType() {
            System.out.println("Interface");

        }

        public void dial(String num)
        {
            System.out.println("Dialing "+num);
        }


}
