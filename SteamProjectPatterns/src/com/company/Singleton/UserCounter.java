package com.company.Singleton;

public class UserCounter {
    private static UserCounter userCounter;
    private static int count = 0;

    public static synchronized UserCounter getUserCounter() {
        if (userCounter == null)
            userCounter = new UserCounter();
        return userCounter;
    }

    private UserCounter() {

    }

    public void increase() {
        count ++;
    }
    public void decrease() {
        count --;
    }
    public void showCounter() {
        System.out.println("The amount of users" + count  );
    }
}
