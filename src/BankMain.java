/**
 * @author Lulu anne
 */
public class BankMain {
    public static void main(String[] args) {

        BankAccount acc;
        System.out.println("\nAccount Holder Details: " + "\n");

        HighInterestSavings h1 = new  HighInterestSavings("UII", 99999,9000,.05,1000);
        h1.account_holder.setPerson("Dwesil", "-500", "k", "3/17", "bayot");
        h1.withdraw(1999);
        h1.createMonthlyStatement();

        }
    }


