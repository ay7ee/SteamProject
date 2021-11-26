package com.company.Adapter;

public class VIP implements VIPUser{
    @Override
    public void discount50() {
        System.out.println("-50% from price");
    }


    @Override
    public void ContestChance() {
        System.out.println("You got the chance to participate in the contest where you probably will win 2 games");
    }
}
