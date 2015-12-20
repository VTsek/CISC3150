import java.util.*;

public class calculator 
{

static boolean _state =true;

public static void main (String[] args)
{
	int j=0,k=0;
	double[] arraydouble=new double[15];
	char[] arrayop=new char[13];
	System.out.println("Please enter your calculation");
    Scanner keyboard = new Scanner(System.in); //////// getting input from the user
    String expression=keyboard.nextLine();      ////////// getting the whole expression
    String[] digit=expression.split(" ");        //// split all the inputs from the operators
double result = 0, previous=0;
double operand1 = 0;
double operand2 = 0;
String operator = "";
char op = ' ';

	for(int i=0;i<digit.length;i++){   ////// Loop to transfer operators to operator array and integer to integer array
	if(digit[i].charAt(0)=='+' || digit[i].charAt(0)=='-' || digit[i].charAt(0)=='*' || digit[i].charAt(0)=='/'){
		arrayop[k]=digit[i].charAt(0);
		k++;
	}	
	else
	{
		arraydouble[j]=Double.parseDouble(digit[i]); ////////// store operend to double array
		j++;
	}
	}
	result=arraydouble[0];
	for(int i=0,y=1,z=0;i<k;i++){
		try{
op = arrayop[z];
z++;
operand2 = arraydouble[y];
y++;
}
catch(InputMismatchException ex) // This will check for illegal inputs
{
    System.out.println("Enter just numbers"); //Will print error message
}
try{ 

switch (op)
{

case '+': //////// case to get addition of the operands
	previous=result;
	result = result + operand2;
System.out.println("Answer: " + previous + ' ' + op + ' ' + operand2 + " = " + result );
break;

case '-': //////// case to get subtraction of the operands
	previous=result;
	result = result - operand2;
System.out.println("Answer: " + previous + ' ' + op + ' ' + operand2 + " = " + result );
break;

case '*': //////// case to get multiplication of the operands
	previous=result;
	result = result * operand2;
System.out.println("Answer: " + previous + ' ' + op + ' ' + operand2 + " = " + result );
break;

case '/'://////// case to get division of the operands
	previous=result;
	result = result/operand2;
System.out.println("Answer: " + previous + ' ' + op + ' ' + operand2 + " = " + result );
break;
default: 
System.out.println("Enter an appropriate operator");
break;
}

}
catch(ArithmeticException e){
System.out.println("Cannot divide by zero ");
}
	}
}
}