import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ClientA {

	private Socket connection;
	public BufferedReader br;
	public PrintStream ps;
	private Scanner scan;
	
	public ClientA(String ip){
		
		try{
			
			connection = new Socket(ip, 1996);
			streams();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private void streams(){
		
		try{
			
			br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			ps = new PrintStream(connection.getOutputStream());
			
			startChatting();
			
			
		}catch(Exception e){}
		
	}
	
	private void startChatting(){
		
		try{
			
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					
					while(true){
						
						try{
							
							String text = br.readLine().toString();
							Date date = new Date();
							System.out.println("At "+date.toString()+" Client A Recieved: "+text);
							
						}catch(Exception e){}
						
					}
					
				}
				
			});
			thread.start();
			
		}catch(Exception e){}
		
		try{
			
			scan = new Scanner(System.in);
			
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					
					while(true){
						
						try{
							String text = scan.nextLine();
							Date date = new Date();
							System.out.println("At "+date.toString()+" Client A Said: "+text);
							ps.println(text);
							ps.flush();
						}catch(Exception e){}
						
					}
					
				}
				
			});
			thread.start();
			
		}catch(Exception e){}

	}
	
}
