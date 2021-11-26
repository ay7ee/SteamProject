package com.company.Factory;

public class Adventure extends FactoryGames implements Games{
    @Override
    public void type() {
        System.out.println("Adventure is very interesting");
    }
}
