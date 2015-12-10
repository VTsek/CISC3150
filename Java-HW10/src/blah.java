import java.util.Scanner;

public class blah {
	
	protected static String cmd;
	
	static Process p;
	
	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner(System.in);
			
			String userIn = in.next();
			
			if (userIn.endsWith("&")) {
				cmd = userIn.substring(0, userIn.length() - 1);
			}
			
			ProcessBuilder pb = new ProcessBuilder(cmd);
			
			if (userIn.endsWith("&")) {
				pb.start();
			} else {
				p = pb.start();
				p.waitFor();
				System.out.println(p.exitValue());
			}
			
			
			

	}
}
