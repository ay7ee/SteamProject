package com.company.SteamStructure;

import com.company.Observer.Observer;
import com.company.Singleton.UserCounter;

import java.util.List;

public class SteamUsers implements Observer {

    private String name;
    private int subfee;
    private boolean sub;

    public SteamUsers(String name){
        this.name = name;
        this.subfee = 0;
        sub = false;
        UserCounter.getUserCounter().increase();
    }

    public void addsubfee(){
        subfee++;
        if(subfee == 1){
            sub = true;
        }
    }

    public void showobserver(){
        System.out.println("Welcome to our game store, " + name + " you payed for temporary subscription, here are the activities that you are allowed from now ");
    }

    public void getSubscription() {
        if (sub) {
            System.out.println("User can get a subscription for VIP options");
        } else {
            System.out.println("Customer can't get a subscription");
        }
    }






    @Override
    public void handleEvent(List<String> subscription) {
        System.out.println("Welcome to the game store, " + name + "\n we've got new games in the Steam" +
                subscription + "\n===============================================" );
    }
}
