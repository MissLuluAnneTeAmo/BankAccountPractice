public class HighInterestChecking extends NoServiceChargeChecking{

    private static final double INTEREST_RATE = 0.0;
    private static final double MIN_BALANCE = 5000;

    public HighInterestChecking(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    public HighInterestChecking(String name, int accountNumber, double balance, double interestRate, double minimumBalance) {
        super(name, accountNumber, balance, minimumBalance,interestRate);
    }

    @Override
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate( double interestRate){

        this.interestRate = interestRate;
    }

    public void postInterest(){
        super.Balance *= (1d + interestRate);
    }

    @Override
    public void createMonthlyStatement() {
        super.createMonthlyStatement();
        System.out.println(this);
    }
    public String toString(){
        return super.toString();
    }
}
