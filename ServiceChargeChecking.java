public class ServiceChargeChecking extends CheckingAccount {

    private static final double ACCOUNT_SERVICE_CHARGE = 10.00;
    private static final int MAXIMUM_NUM_OF_CHECKS = 5;
    private static final double SERVICE_CHARGE_EXCESS_NUM_OF_CHECKS = 5;

    protected double serviceChargeAccount;
    protected double serviceChargeCheck;
    protected int numberOfChecksWritten;

    public ServiceChargeChecking(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void writeChecking(double w) {

    }

    public ServiceChargeChecking(String name, int accountNumber, double balance, double serviceChargeAccount, double serviceChargeCheck){
        super (name, accountNumber,balance);
        this.serviceChargeAccount = serviceChargeAccount;
        this.serviceChargeCheck = serviceChargeCheck;
    }

    public double getServiceChargeAccount() {
        return serviceChargeAccount;
    }

    public void setServiceChargeAccount(double serviceChargeAccount) {
        this.serviceChargeAccount = serviceChargeAccount;
    }

    public double getServiceChargeCheck() {
        return serviceChargeCheck;
    }

    public void setServiceChargeCheck(double serviceChargeCheck) {
        this.serviceChargeCheck = serviceChargeCheck;
    }

    public int getNumberOfChecksWritten() {
        return numberOfChecksWritten;
    }

    public void setNumberOfChecksWritten(int numberOfChecksWritten) {
        this.numberOfChecksWritten = numberOfChecksWritten;
    }

    public void postServiceCharge(){

        System.out.println("\nPOST SERVICE CHARGE: " + serviceChargeCheck);
    }

    @Override
    public void createMonthlyStatement() {

        System.out.println(this);
    }

    public String toString() {
        return "SERVICE CHARGE ACCOUNT: " + serviceChargeAccount +
                "\nSERVICE CHARGE CHECK: " + serviceChargeCheck;
    }

}
