public abstract class BankAccount{


    protected int AccountNumber;
    protected String Name;
    protected double Balance;
    protected Person account_holder;

    public BankAccount (String name, int accountNumber, double balance){
        Name = name;
        AccountNumber = accountNumber;
        Balance = balance;
        account_holder = new Person(name);

    }
    public BankAccount (){
        Name = "";
        AccountNumber = 0;
        Balance = 0;
        account_holder = new Person();

    }



    public int getAccountNumber(){
        return AccountNumber;
    }
    public double getBalance(){
        return Balance;
    }
    public void setName(String name){
        Name = name;
    }
    public void withdraw(double amount){
        if (Balance >= amount)
            Balance -= amount;
    }
    public void deposit(double amount){
        Balance += amount;
    }
    public abstract void createMonthlyStatement();

    public String toString(){
        return "NAME: "+ Name + "\nACCOUNT NUMBER: " + AccountNumber +
                "\nREMAINING BALANCE: " + Balance + account_holder.toString();
    }
}
