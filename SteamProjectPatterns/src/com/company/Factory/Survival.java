package com.company.Factory;

public class Survival extends FactoryGames implements Games{
    @Override
    public void type() {
        System.out.println("Survival is a game where you survive");
    }
}
