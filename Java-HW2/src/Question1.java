import java.util.*;
 
public class Question1 {
 
public static void main(String[] args){
int tall;
 
Scanner sc = new Scanner(System.in);
 
tall = sc.nextInt(); //store user input into tall
 
for(int i=1; i<=tall;i++){
               
       
        for (int j=1;j<=tall-i;j++){
                System.out.print("   ");
                }
         for (int left=1;left<=i;left++){
                System.out.print(" "+left+" ");
                }
                   for(int right=i-1; right>=1; right--) {
                        System.out.print(" "+right+" ");
                }
                               
                System.out.println();
 
}
sc.close();
}

}
 
//OUTPUT
/*******
 
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.
 
C:\Users\V>cd Desktop
 
C:\Users\V\Desktop>Javac Question1.java
 
C:\Users\V\Desktop>java Question1
4
          1
       1  2  1
    1  2  3  2  1
 1  2  3  4  3  2  1
 
C:\Users\V\Desktop>
*******/