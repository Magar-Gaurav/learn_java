//     // Asking for the user to enter the names
// import java.util.*;

// public class learn{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         ArrayList<String> name = new ArrayList<>();
//         System.out.println("enter the name of students:");       
//         for(int i= 0; i<5;i++){
//             System.out.println("Student "+(i+1)+" Name: ");
//             name.add(scan.nextLine());
//         }
//         System.out.println("Printing the name of students:\n");
//         for(int i = 0; i< 5; i++){
//             System.out.println("Student "+(i+1)+": "+name.get(i));
//         }
//         scan.close();
//     }
// }

//     // Putting the name by self

import java.util.ArrayList;
import java.util.Arrays;

public class learn {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>(Arrays.asList(
            "Gaurav","Gourav","Saurav"
        ));

        System.out.println("Printing the name of the students:\n");
        for(int i = 0; i < name.size(); i++ ){
            System.out.println("Student "+ (i+1)+": "+name.get(i));
        }
    }
}
