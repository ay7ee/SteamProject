package com.company.Decorator;

public class Commission implements Order {
    @Override
    public String getDescription() {
        return "This price is always included for the delivery";
    }

    @Override
    public double getPrice() {
        return 2000.00;
    }
}
