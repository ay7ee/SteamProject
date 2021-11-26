package com.company.Singleton;

public class OrderCounter {
    private static OrderCounter orderCounter;
    private static int count = 0;

    public static synchronized OrderCounter getOrderCounter() {
        if (orderCounter == null)
            orderCounter = new OrderCounter();
        return orderCounter;
    }

    private OrderCounter() {

    }

    public void increase() {
        count ++;
    }
    public void decrease() {
        count --;
    }
    public void showCounter() {
        System.out.println("The number of orders" + count);
    }
}
