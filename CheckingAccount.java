public abstract class CheckingAccount extends BankAccount {

    public CheckingAccount(String name, int accountNumber, double balance) {
        super (name, accountNumber,balance);


    }
    public abstract void writeChecking(double w);

    @Override
    public void createMonthlyStatement() {

        System.out.println(this);
    }
}
