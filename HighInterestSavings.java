public class HighInterestSavings extends SavingsAccount{

    private static final double  MINIMUM_BALANCE = 2500.00;

    private static final double  INTEREST_RATE = 0.05;

    protected double minimumBalance;

    HighInterestSavings(String name, int accountNumber, double balance){
        super (name,accountNumber,balance);
        minimumBalance = MINIMUM_BALANCE;
    }

    HighInterestSavings(String name, int accountNumber, double balance, double interestRate, double minimumBalance){
        super (name,accountNumber,balance,interestRate);
        this.minimumBalance =minimumBalance;
    }
    public double getMinimumBalance(){
        return minimumBalance;
    }
    public boolean verifyMinimumBalance(double amount){
        return (Balance - amount )> minimumBalance;
    }

    public boolean verifyMinimumBalance(){
        return Balance > minimumBalance;
    }

    public void withdraw(double amount){
        Balance = verifyMinimumBalance() && verifyMinimumBalance(amount)? Balance - amount : Balance;
        if(amount >= 1000) postInterest();
    }

    public String toString(){
        return super.toString() + "\nMINIMUM BALANCE: " + minimumBalance + "\n";
    }
}
