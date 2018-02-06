package Main;

import CommissionCalculation.CommissionCalc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        while (b){
            Scanner sc  = new Scanner(System.in);
            String transaction ;
            try {
                System.out.println("Enter transaction sum:");
                transaction = sc.nextLine();
// I simulate the situation -when  I got the string like this:  "72.22 UAH"
                transaction = transaction + " UAH";
                System.out.println("the original string- "+transaction);
// parse the String
                String [] str= transaction.split(" ");
                CommissionCalc commissionCalc= new CommissionCalc();
                String commission = commissionCalc.commissionCslc(str[0]);
                System.out.println("Your commission is: "+ commission);

            } catch (NumberFormatException ex) {
                System.out.println("Wrong format, please enter correct sum - like this: 72.22");
            } catch (NullPointerException e) {
                System.out.println("Enter please sum transaction");
            }
        }
    }
}
