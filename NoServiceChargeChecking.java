public abstract class NoServiceChargeChecking extends CheckingAccount {

    private static final double MIN_BALANCE = 1000.00;
    private static final double INTEREST_RATE = 0.02;
    protected double minimumBalance;
    protected double interestRate;

    public NoServiceChargeChecking(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public NoServiceChargeChecking(String name, int accountNumber, double balance, double minimumBalance, double interestRate) {
        super(name, accountNumber, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public boolean verifyMinimumBalance(double amount) {

        return (Balance - amount) > minimumBalance;
    }

    @Override
    public void createMonthlyStatement() {
        System.out.println(this);
    }
    public void withdraw(double amount){

        super.withdraw(amount);
    }
    @Override
    public void writeChecking(double w) {
    }
    public String toString() {
        return super.toString() + "\nMINIMUM BALANCE: " + minimumBalance
                + "\nINTEREST RATE: " + interestRate;
    }

    public abstract double getInterestRate();
}
