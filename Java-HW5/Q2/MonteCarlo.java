import java.util.Random;
import static java.lang.System.out;

public class MonteCarlo {
	
	// Random Variable
	private static Random rnd = new Random();
	private static double x = 0.0, y = 0.0, sum = 0.0;
	
	// Long Variables
	private static long in_arc = 0l;
	private static final long MaxN = 1000000l;
	
	//Double Variables
	private static double PI_result = 0l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("This code got overwritten while learning how to push from Eclipse to Github, I'm working on recovery and uploading it");
		
		// Generates MaxN random points onto the circle
		for (long i = 0l; i < MaxN; i += 1l) {
			// 
			x = rnd.nextDouble();
			y = rnd.nextDouble();
			
			sum = Math.pow(x, 2) + Math.pow(y, 2);
			
			
			if (sum <= 1.0) {
				in_arc += 1l;
			} // End of IF
		} //End of FOR
		
		PI_result = (double) (in_arc * 4) / MaxN;
		
		out.println(PI_result);
		
	} // End of Main

} // End of Class
