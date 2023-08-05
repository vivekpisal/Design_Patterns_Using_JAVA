package Structural.Account;

import Structural.Loan.Loan;

public class CurrentAccount extends AbstractAccount{
    public CurrentAccount(String name, Loan loan, String bankName){
        super.setAccountType("Current");
        super.setName(name);
        super.setLoan(loan);
        super.setBankName(bankName);
    }

    public float getInterest(){
        return super.getLoan().getInterest();
    }
}
