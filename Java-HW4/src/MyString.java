/* MyString.java
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
 
public class MyString{
 
        private final char [] chars;
 
        public MyString(char[] chars){
               
                this.chars = chars;
        }
 
        public char charAt(int index){
                return chars[index];
        }
 
        public int length(){
                return chars.length;
        }
 
        public MyString subString(int begin, int end){
                       
                char [] newArray = new char[end - begin];
               
                int j = 0;
               
                for(int i=begin; i < end ; i++){
                        newArray[j] = this.chars[i];
                        j++;
                }
                j =0;
               
                MyString subStr = new MyString(newArray);
       
                return subStr;
        }
 
        public MyString toLowerCase(){
                for(int i = 0;i< chars.length;i++){
                        this.chars[i] = Character.toLowerCase(chars[i]);
                }
                return new MyString(chars);
        }
 
        public MyString toUpperCase(){
                for(int i = 0;i< chars.length;i++){
                        this.chars[i] = Character.toUpperCase(chars[i]);
                }
                return new MyString(chars);
        }
 
        public boolean equals(MyString s) {
                for (int i=0; i<s.length(); i++) {
                        if (this.charAt(i) != s.charAt(i)) {
                                return false;
                        }
                }
                return true;
        }
 
        public MyString getMyString() {
                return new MyString(chars);
        }
 
        public String toString() {
                return new String(chars);
        }
 
        public static MyString valueOf(int num){ //convert int to string
                //String convertStrToInt = "" + num;
                //String.valueOf(number);
                //Integer.toString(number);
                if (num >= 10) {
                        System.out.println("Passed integer has to be a single digit to be stored as a char! ");
                        throw new IndexOutOfBoundsException();
                }
               
                char digitChar = Integer.toString(num).charAt(0);
 
                //return new MyString(Integer.toString(num).toCharArray());
 
                char[] singleChar = new char[1];
               
                singleChar[0] = digitChar;
               
       
                MyString value = new MyString(singleChar);
                /*
                        char[] copy = new char[1];
                        copy[0]=0;
                        return new MyString(copy);
                 */
                return value;
        }
 
 
 
}