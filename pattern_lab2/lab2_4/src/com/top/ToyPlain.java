package com.top;

public class ToyPlain implements Toy {
    private double price;
    private String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void fly(){
        System.out.println("ToyPlain is flying - ");
    }
}
