import java.util.Scanner;
 
 
 
public class AreaCircle {
 
       
 
        public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in); // creates scanner for user input to be read
 
       
 
        System.out.print("Enter in a value for the radius: "); // prompt
 
       
 
                while (true){
 
          double radius = sc.nextInt(); // uses scanner to assign user input to radius
 
          double area = (Math.PI) * Math.pow(radius, 2); // Area = Pi * r * r
 
          System.out.println("The value of the area is " + area);
 
          System.out.print("Enter in a value for the radius: "); // prompt
          sc.close();
      }
 
 

   }
 
}