import java.util.*;
 
 
public class Question3 {
 
public static void main(String[] args){
 
String s;
Scanner sc = new Scanner(System.in);
 
s = sc.nextLine();
 
//Source: https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
String reverse = new StringBuffer(s).reverse().toString();
 
 
if (s.equals(reverse))
        System.out.println("String is a palindrone");
 
sc.close();
}
 
}
 
// OUTPUT
/********
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.
 
C:\Users\V>cd Desktop
 
C:\Users\V\Desktop>javac Question3.java
 
C:\Users\V\Desktop>java Question3
lolol
String is a palindrone
 
C:\Users\V\Desktop>
********/