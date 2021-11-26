package com.company.SteamStructure;

import com.company.Decorator.*;
import com.company.Observer.Observed;
import com.company.Observer.Observer;
import com.company.Strategy.*;
import com.company.Adapter.*;
import com.company.Factory.*;
import com.company.Singleton.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SteamOrders implements Observed {

    private int del;
    Order order;
    Payment payment;
    SimpleUser simpuser;
    FactoryGames fack;
    private Scanner scan = new Scanner(System.in);


    public  SteamOrders(){
        this.del = 0;
        fack = new FactoryGames();
        OrderCounter.getOrderCounter().increase();
    }

   /* public void setGames(int i){
        if (i == 1){
            fack = new Left4Dead2(fack);
        }
        else if (i == 2){
            fack = new RDR2(fack);
        }
        else if (i == 3){
            fack = new TheForest(fack);
        }
    }*/

    public void setPayment(int i){
        if(i == 1){
            int n = scan.nextInt();
            String row1 = scan.nextLine();
            String row2 = scan.nextLine();
            String row3 = scan.nextLine();
            payment = new DebitCard(n,row1,row2,row3);
        }
        else if (i == 2){
            int n = scan.nextInt();
            String row1 = scan.nextLine();
            String row2 = scan.nextLine();
            String row3 = scan.nextLine();
            payment = new VISA(n,row1,row2,row3);
        }
    }


    public void getDescription(){
        System.out.println(order.getDescription());
    }
    public void getPrice(){
        System.out.println(order.getPrice());
    }

    public void addGame(String game)  {
        this.games.add(game);
        notifyObservers();
    }

    public void setGame(String game) {
        this.games.remove(game);
        notifyObservers();
    }

    List<String> games = new ArrayList<String>();
    List<Observer> users = new ArrayList<Observer>();

    public void order() {
        System.out.println("You've got a new order");
    }



    @Override
    public void addObserver(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: users){
            observer.handleEvent(this.games);
        }

    }
}


