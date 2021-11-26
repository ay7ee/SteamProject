package com.company.Decorator;

public class Survival extends OrderGamesDecorator{
    public Survival(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "Survival";
    }

    public double getPrice(){
        return this.order.getPrice() + 9000.00;
    }
}
