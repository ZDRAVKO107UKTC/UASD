import java.util.Scanner;

public class nominalsDivision {

    public static void main(String[] args) {
        int [] nominals = {50, 20, 10, 5};
        double amount = 0.00;
        int currCount = 0;
        int totalCount = 0;
        int idx = 0;

        System.out.println("Please, input the amount to convert [BGN]: ");
        amount = new Scanner(System.in).nextDouble();

        amount = amount * 100;
        System.out.println("Amount is: " + amount);

        while (amount > 0){

            for (int curnom : nominals){
                currCount  = (int) (amount / curnom);
                totalCount = totalCount + currCount;
                System.out.println("Colins of nominal: " + curnom + " used: " + currCount);

                amount = amount % curnom;
                System.out.println("Amount remaining after current iteration: " + currCount);

            }

            if (amount > 0){
                System.out.println("No enough nominals to present the amount!");
                System.out.println("Total coin used: " + totalCount);
                System.out.println("Amount remaining [cents]: " + amount);
                break;
            }

        }

    }

}
