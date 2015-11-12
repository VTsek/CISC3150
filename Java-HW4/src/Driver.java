/* Driver.java
 *
 * Vitaliy Tsekhanskiy
 * CISC3150 - HW4
 * 10/14/2015
 *
 * Create your own version of the String class. Call it MyString. This class
 * should be immutable. Make sure to encapsulate your data properly. Provide
 * an implementation for the following methods:
 
 * public MyString(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString substring(int begin, int end);
 * public MyString toLowerCase();
 * public MyString toUpperCase();
 * public boolean equals(MyString s);
 * public MyString getMyString();
 * public String toString();   
 * public static MyString valueOf(int i);
 
 * Do not use any function from the String class. The only time you're
 * allowed to use the String class is in the toString() method. Even then,
 * you may only use the String's constructor, but not the methods.
 * Make sure to provide a driver class, too, and show the output.
 */
 
public class Driver {
 
        public static void main(String[] args) {
 
                MyString string1 = new MyString(new char[]{'J', 'A', 'V', 'A'});
                MyString string2 = new MyString(new char[]{'J', 'A', 'V', 'A'});
                MyString string3 = new MyString(new char[]{'C', 'O', 'O', 'K', 'I', 'E', 'S'});
                MyString string4 = new MyString(new char[]{'c', 'o', 'o', 'k', 'i', 'e', 's'});
                MyString string5 = new MyString(new char[]{'m', 'o', 'n', 'e', 'y'});
                                               
                System.out.println(string1.equals(string2));
                System.out.println(string1.charAt(3));
                System.out.println(string2.length());
                System.out.println(string3.subString(2, 4));
                System.out.println(string4.toLowerCase());
                System.out.println(string4.toUpperCase());
                System.out.println(string2.getMyString());
                System.out.println(string5.toString());
                System.out.println(MyString.valueOf(7));
               
                        }
 
        }