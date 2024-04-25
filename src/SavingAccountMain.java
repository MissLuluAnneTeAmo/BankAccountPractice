public class SavingAccountMain {

    public static void main (String [] args) {


        HighInterestSavings h1 = new  HighInterestSavings("t", 6788,70000,1000,1000);
        HighInterestSavings h2 = new  HighInterestSavings("p",99999,70000,1000,1000);

        System.out.println(h1);
        System.out.println(h2);

        h1.withdraw(1999);
        h2.withdraw(1999);

        System.out.println(h1);
        System.out.println(h2);

        h1.createMonthlyStatement();
        h1.createMonthlyStatement();

        System.out.println(h1);
        System.out.println(h2);


    }
}
