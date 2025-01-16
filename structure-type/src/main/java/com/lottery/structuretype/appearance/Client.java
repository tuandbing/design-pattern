package com.lottery.structuretype.appearance;

public class Client {

    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();

        Customer customer = new Customer("Ann McKinsey");
        Boolean eligable = mortgage.IsEligible(customer, 1000);

        System.out.println(customer.getName() + " has been " + (eligable ? "Approved" : "Rejected"));
    }
}
