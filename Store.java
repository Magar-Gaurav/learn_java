//Java API to make user store data
import java.util.Scanner;
public class Store {
    public static void main(String[] args){
        //declaring scanner name scan
        Scanner scan = new Scanner(System.in);
        //asking user how many data do they want to store
        System.out.println("Enter the number of student whose name you want to store: ");
        int num = scan.nextInt();
        scan.nextLine();
        //declaring the array
        String[] student_name = new String[num];
        //asking the user to enter the names
        System.out.println("Enter the name of the students:\n");
        for(int i = 0; i < num; i++){
            //taking input
            System.out.println("Enter the name of student number "+(i+1));
            student_name[i] = scan.nextLine();
        }
        //printing all the data stored by the user
        System.out.println("\nPrinting all the names: \n");
        for(int i = 0; i < num; i++){
            //printing
            System.out.println("Student "+(i+1)+": "+student_name[i]);
        }
        //closing the scanner
        scan.close();
    }
}
