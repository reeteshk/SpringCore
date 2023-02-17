package com.springcore.lifeycycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    public Samosa(double price) {

        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("inside the init function");
    }
    public void destroy(){
        System.out.println("inside the destroy function");
    }
}
