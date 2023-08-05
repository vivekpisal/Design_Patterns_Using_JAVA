package Structural.Bridge.Loan;

public class CarLoan implements Loan{

    @Override
    public float getInterest() {
        return 8.80f;
    }
}
