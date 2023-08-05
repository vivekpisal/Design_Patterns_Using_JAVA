package Structural;

import Creational.Factory.Car;
import Structural.Account.SavingsAccount;
import Structural.Loan.CarLoan;

public class Client {
    public static void main(String []args){
        SavingsAccount account = new SavingsAccount("vivek",new CarLoan(),"SBI");
        System.out.println("Interest Rate :-" + account.getInterest());
        System.out.println(account);
    }
}
