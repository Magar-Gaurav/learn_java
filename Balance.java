import java.util.*;
public class Balance {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            float balance = (float) 10000.0;
            // float amt_withdraw;
            float amt_deposit = 0;
            System.out.println("Enter what you want to do Withdraw or Deposit");
            String choice = scan.nextLine();
            if(choice.equals("Withdraw")){
                System.out.println("Enter the amount you want to withdraw:");
                float amt_withdraw = scan.nextInt();
                if(amt_withdraw <= balance && amt_withdraw > 0){
                    System.out.println("You have successfully withdrawn Rs."+amt_withdraw);
                    float curr_balance = balance - amt_withdraw;
                    System.out.println("Your current balance is "+ curr_balance);
                    return;
                } else{
                    System.out.println("Sorry your balance doesnot match your requirement.");
                    return;
                }
            }
            else if(choice.equals("Deposit")){
                System.out.println("Enter the amount you want to deposit: ");
                amt_deposit = scan.nextInt();
                if(amt_deposit >= 100){
                    System.out.println("You have successfully deposited Rs."+ amt_deposit);
                    float tot_balance = balance + amt_deposit;
                    System.out.println("Your current balance is Rs."+tot_balance);
                    return;
                }
                else{
                    System.out.println("You cannot deposit the value less than Rs.100");
                    return;
                }
            }
            else{
                System.out.println("Please enter a valid option!!!");
            }
            scan.close();
        }
}
