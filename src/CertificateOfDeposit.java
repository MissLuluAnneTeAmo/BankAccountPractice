public class CertificateOfDeposit extends BankAccount {

    private static final double INTEREST_RATE = 0.05;
    private static final int NUMBER_OF_MATURITY_MONTHS = 6;
    private double interestRate;
    private int maturityMonths;
    private int currentCDMonth;

    public CertificateOfDeposit(String name, int accountNumber, double balance ){
        super(name, accountNumber, balance);
    }
    public CertificateOfDeposit(String name, int accountNumber, double balance, double interestRate, int maturityMonths, int currentCDMonth){
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.maturityMonths = maturityMonths;
        this.currentCDMonth = currentCDMonth;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getMaturityMonths() {
        return maturityMonths;
    }

    public void setMaturityMonths(int maturityMonths) {
        this.maturityMonths = maturityMonths;
    }

    public int getCurrentCDMonth() {
        return currentCDMonth;
    }

    public void setCurrentCDMonth(int currentCDMonth) {
        this.currentCDMonth = currentCDMonth;
    }

    public void postInterest(){
        super.Balance *= (1d + interestRate);
    }

    public void withdraw(double amount){

        super.withdraw(amount);
        currentCDMonth++;
    }

    public void withdraw(){

        if (currentCDMonth == maturityMonths){
            Balance -= Balance;
        }
    }

    @Override
    public void createMonthlyStatement() {

        System.out.println(this);
    }

    public String toString(){
        return "\nINTEREST RATE: " + interestRate +
                "\nCURRENT CERTIFICATE OF DEPOSIT THIS MONTH: " + currentCDMonth;
    }
}
