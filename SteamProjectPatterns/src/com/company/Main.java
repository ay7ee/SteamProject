package com.company;

import com.company.SteamStructure.*;
import com.company.Strategy.*;
import com.company.Adapter.*;
import com.company.Decorator.*;
import com.company.Singleton.*;
import com.company.Factory.*;


public class Main {

    public static void main(String[] args) {

        SteamOrders storders = new SteamOrders();
        storders.addGame("Cs:go");
        storders.addGame("Red Dead Redemption 2");
        storders.addGame("Left4Dead 2");
        storders.addGame("The Forest");
        storders.addGame("Call of duty");
        storders.addGame("Far cry");
        System.out.println("................................................");
        OrderCounter.getOrderCounter().showCounter();

        System.out.println("................................................");




        Factory factory = new FactoryGames();
        Games type1 = factory.createAdventure();
        Games type2 = factory.createShooter();
        Games type3 = factory.createSurvival();
        type1.type();
        type2.type();
        type3.type();
        System.out.println("..............................................");

        SteamUsers cus1 = new SteamUsers("Dias");
        SteamUsers cus2 = new SteamUsers("Arsen");
        SteamUsers cus3 = new SteamUsers("Beiberys");

        cus1.showobserver();
        cus1.addsubfee();
        cus1.getSubscription();

        VIP vip = new VIP();
        User user = new User();
        SimpleUser VIPpromo =  new VIPAdapter(vip);
        System.out.println("VIP customers can:");
        vip.discount50();
        vip.ContestChance();


        //System.out.println("Simple customers can:");
        //user.Purchase();
        //System.out.println("Our temporary subscribers who get the promo:");
        //VIPpromo.Purchase();





        System.out.println("..................................................");


        storders.addObserver(cus1);
        storders.addObserver(cus2);
        storders.notifyObservers();




        UserCounter.getUserCounter().showCounter();

        System.out.println("..................................................");

        PaymentType paymentType = new PaymentType();

        paymentType.setPayment(new VISA(25000, "Zhusan", "25-12-13", "4173419847108470"));
        paymentType.executePayment();
        paymentType.paymentDetails();

        paymentType.setPayment(new DebitCard(200000.00, "Kaspi","23-12-12", "25330908770320" ));
        paymentType.executePayment();
        paymentType.paymentDetails();


/*
        VIP vip = new VIP();
        User user = new User();
        SimpleUser VIPpromo =  new VIPAdapter(vip);
        System.out.println("VIP customers can:");
        vip.discount50();
        System.out.println("Simple customers can:");
        customer.Purchase();
        System.out.println("Our temporary subscribers who get the promo:");
        VIPpromo.Purchase();
        */

    }
}