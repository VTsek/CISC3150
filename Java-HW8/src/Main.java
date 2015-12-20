import java.net.InetAddress;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(""
				+ "Enter 1 to start Server\n"
				+ "Enter 2 for Client A\n"
				+ "Enter 3 for Client B\n\n"
				+ "Yours option: ");
		int option = scan.nextInt();
		
		if(option == 1){
			
			Server server = new Server();
			String ipAddress = null;
			
			try{
				
				ipAddress = InetAddress.getLocalHost().getHostAddress();
				
			}catch(Exception e){}
			
			System.out.println("Server is running..\n"
					+ "Use this ip to connect Clients\n"
					+ "IP: "+ipAddress+"\n"
					+ "Keep running this program, and again start the other instance of that program to join as client A or client B");
			
		}else if(option == 2 || option == 3){
			
			System.out.print("Enter IP Address: ");
			String ipAddress = scan.next();
			
			if(option == 2){
				ClientA clientA = new ClientA(ipAddress);
				System.out.println("Client A Successfully connected with Server.");
			}else{
				ClientB clientB = new ClientB(ipAddress);
				System.out.println("Client B Successfully connected with Server.");
			}
			
		}
		
	}
	
}
