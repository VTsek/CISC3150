import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
                int [] a=new int[12];
 
                        System.out.println("Enter 12 numbers: ");
 
                for(int i=0 ;i<12;i++)
                {
                        Scanner input =new Scanner(System.in);
                        a[i]=input.nextInt();
 
                }
 
double aa= Math.sqrt(Math.pow(a[1]-a[0], 2)+Math.pow(a[7]-a[6], 2));
double bb= Math.sqrt(Math.pow(a[3]-a[2], 2)+Math.pow(a[9]-a[8], 2));
double cc= Math.sqrt(Math.pow(a[5]-a[4], 2)+Math.pow(a[11]-a[10], 2));
if(aa+bb>cc || aa+cc>bb || bb+aa>cc || bb+cc>aa || cc+aa>bb ||cc+bb>aa){
             System.out.println("This is a real triangle");
         }else {
             System.out.println("This is a fake triangle");
                         
 
}
//input.close();
}
 
}