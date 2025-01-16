package com.lottery.structuretype.appearance;

public class Credit {
    public Boolean HasGoodCredit(Customer c)    {
        System.out.println("Check credit for " + c.getName() + "'s credit");
        return true;
    }
}
