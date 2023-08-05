package Structural.Account;

import Structural.Loan.Loan;

public class SavingsAccount extends AbstractAccount{
    public SavingsAccount(String name, Loan loan,String bankName){
        super.setAccountType("Savings");
        super.setName(name);
        super.setLoan(loan);
        super.setBankName(bankName);
    }

    public float getInterest(){
        return super.getLoan().getInterest();
    }
}
