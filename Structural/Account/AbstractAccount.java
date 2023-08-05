package Structural.Account;

import Structural.Loan.Loan;

public abstract class AbstractAccount {
    private String name;
    private String accountType;
    private String bankName;

    private Loan loan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", loan=" + loan +
                '}';
    }
}
