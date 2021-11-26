package com.company.Factory;

public class Shooter extends FactoryGames implements Games{
    @Override
    public void type() {
        System.out.println("Shooter is a game where you shoot");
    }
}
