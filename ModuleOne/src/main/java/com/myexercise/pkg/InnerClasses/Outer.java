package com.myexercise.pkg.InnerClasses;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Outer {

    private int outerInt = 10;

    public class SimpleInner{   //depend on object

        private int innerInt = 40;
        public void accessOuter(){
            outerInt = 10;
        }
    }

    public static class StaticInner{ // depend on class

    }

    public void accessInner(){

        //innerInt = 50;   not accessible

        final class LocalInner{     //can be access only in accessInnerMethod.  No chile class will be there.
            LocalInner localInner = new LocalInner();
        }
    }

}
