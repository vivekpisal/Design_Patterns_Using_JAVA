package Structural.Bridge.Account;

import Structural.Bridge.Account.AbstractAccount;
import Structural.Bridge.Loan.Loan;

public class CurrentAccount extends AbstractAccount {
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
