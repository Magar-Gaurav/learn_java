// Object
// public class Noob
// {
//     String first_Name ="Gaurav";
//     String last_Name ="Magar";
//     int age = 19;
// public static void main(String[] args){
//     Noob printNum = new Noob();
//     System.out.println("Name : "+printNum.first_Name+" "+printNum.last_Name+". You are "+printNum.age+" years old.");
// }
// }


// // calling public method with object
// public class Noob {
//     public void callMe(){
//         System.out.println("This is the output!");
//     }
//     public static void main(String[] args) {
//         Noob obj = new Noob();
        
//         obj.callMe();
//     }
// }

// //Another example of accessing public method with object

// public class Noob{
//     public void noob(){
//         System.out.println("This car is going at its maximum speed.");
//     }
//     public void maxSpeed(int speed){
//         System.out.println("The maximum speed is "+speed+"km/hr.");
//     }
//     public static void main(String[] args){
//         Noob objs = new Noob();
//         objs.noob();
//         objs.maxSpeed(400);
//     }
// }

// // Java Constructors
// public class Noob{
//     int x;
//     public Noob(){
//         x = 10;
//     }
//     public static void main(String[] args){
//         Noob objs = new Noob();
//         System.out.println("x = "+objs.x);
//     }
// }

//encapsulation=> use of get and set

// public class Noob{
//     private String Name;
//     public String printName(String Name){
//         this.Name = Name;
//         return  Name;
//     }
//     public static void main(String[] args) {
//         Noob objs = new Noob();
//         System.out.println(objs.printName("Gaurav"));
//     }
// }
//              OR
// public class Noob {
//     private String Name;

//     public void setName(String Name){
//         this.Name = Name;
//     }
//     public String getName(){
//         return this.Name;
//     }
//     public static void main(String[] args) {
//         Noob objs = new Noob();
//         objs.setName("Gaurav Magar");
//         System.out.println(objs.getName());
//     }
// }

// // JAVA inner classes
// public class Noob{
//     class outerCLass{
//         String name;
//         class innerClass{
//             public String myinnerClass(){
//             return name;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Noob objs = new Noob();
//         outerCLass objt = objs.new outerCLass();
//         objt.name ="Gaurav Magar";
//         outerCLass.innerClass obj = objt.new innerClass();
//         System.out.println(obj.myinnerClass());
//     }
// }

// // JAVA enums
// enum Range{
//     Small,
//     Medium,
//     Large
// }
// public class Noob{
//     public static void main(String[] args) {
//      Range rang = Range.Large;
     
//      switch(rang){
//         case Small: 
//             System.out.println("Small ranged");
//             break;
//         case Medium:
//             System.out.println("Medium ranged");
//             break;
//         case Large:
//             System.out.println("Large ranged");
//             break;
//      }
//     }
// }

//      JAVA Date and Time
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Noob {
    public static void main(String[] args) {
        LocalDateTime objs = LocalDateTime.now();
        System.out.println(objs);
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = objs.format(formatted);
        System.out.println("After formatting : "+formattedDate);
    }
}