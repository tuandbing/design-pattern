package com.lottery.structuretype.appearance;

public class Mortgage {
    private Bank bank = new Bank();
    private Credit credit = new Credit();
    private Loan loan = new Loan();

    public Boolean IsEligible(Customer c, int amount) {
        return bank.HasSufficientSavings(c, amount) &&
               credit.HasGoodCredit(c) &&
               loan.HasNoBadLoans(c);
    }


}
