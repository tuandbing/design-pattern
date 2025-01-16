package com.lottery.structuretype.appearance;

public class Bank {
    public Boolean HasSufficientSavings(Customer c, int amount)   {
        System.out.println("Check bank for " + c.getName() + "'s savings");
        return amount < 10000;
    }
}
