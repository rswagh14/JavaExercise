package com.myexercise.pkg.inheritance;

/**
 * Created by Rahul on 11/9/2016.
 */
public class Bird {

    private int weight;
    private int flyingspeed;
    private boolean ismigrated;

    public String Name;

    protected float price;

    boolean isflying;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFlyingspeed() {
        return flyingspeed;
    }

    public void setFlyingspeed(int flyingspeed) {
        this.flyingspeed = flyingspeed;
    }

    public boolean ismigrated() {
        return ismigrated;
    }

    public void setIsmigrated(boolean ismigrated) {
        this.ismigrated = ismigrated;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isflying() {
        return isflying;
    }

    public void setIsflying(boolean isflying) {
        this.isflying = isflying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", flyingspeed=" + flyingspeed +
                ", ismigrated=" + ismigrated +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                ", isflying=" + isflying +
                '}';
    }
}
