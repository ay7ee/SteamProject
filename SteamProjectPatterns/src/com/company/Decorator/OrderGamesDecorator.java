package com.company.Decorator;

abstract class OrderGamesDecorator {
    protected Order order;
    public OrderGamesDecorator(Order newOrder) {
        this.order = newOrder;
    }

    public String getDescription() {
        return this.order.getDescription();
    }


    public double getPrice() {
        return this.order.getPrice();
    }
}
