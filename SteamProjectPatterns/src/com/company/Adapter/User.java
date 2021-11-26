package com.company.Adapter;

public class User implements SimpleUser {
    @Override
    public void Purchase() {
        System.out.println("Simple User purchases games by fixed stand price");

    }
}
