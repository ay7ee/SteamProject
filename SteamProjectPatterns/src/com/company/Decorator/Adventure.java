package com.company.Decorator;

public class Adventure extends OrderGamesDecorator{
    public Adventure(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "Adventure";
    }

    public double getPrice(){
        return this.order.getPrice() + 26000.00;
    }
}
