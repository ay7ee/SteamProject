package com.company.Decorator;

public class Shooter extends OrderGamesDecorator{
    public Shooter(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "Shooter";
    }

    public double getPrice(){
        return this.order.getPrice() + 4300.00;
    }
}
