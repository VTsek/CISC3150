public class Question4 {
 
public static void main(String[] args){
label: for (;;) { //forever
    for (;;) { //forever
        if (5 == 5) { //true
            break label ;
        }
    }
}
System.out.println("I am free of the loop!");
 
}
 
}
 
// OUTPUT
/********
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.
 
C:\Users\V>cd Desktop
 
C:\Users\V\Desktop>javac Question4.java
 
C:\Users\V\Desktop>java Question4
I am free of the loop!
 
C:\Users\V\Desktop>
*********/