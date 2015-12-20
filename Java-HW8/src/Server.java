import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket server;
	private Socket connection;
	private BufferedReader[] br = new BufferedReader[2];
	private PrintStream[] ps = new PrintStream[2];
	
	public Server(){
		
		startServer();
		
	}
	
	public void startServer(){
		
		try{
			
			Thread thread = new Thread(){
				
				@Override
				public void run(){
					
					try{
						
						server = new ServerSocket(1996);
						
						connection = server.accept();
						streams(0);
						System.out.println("First Client is connected..");
						connection = server.accept();
						streams(1);
						System.out.println("Second Client is connected..");
						
					}catch(Exception e){e.printStackTrace();}
					
				}
				
			};
			thread.start();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void streams(int index){
		
		try{
			
			br[index] = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			ps[index] = new PrintStream(connection.getOutputStream());
			
			startProcessing(index);
			
		}catch(Exception e){}
		
	}
	
	public void startProcessing(int index){
		
		try{
			
			if(index == 0){
				
				Thread thread1 = new Thread(new Runnable(){

					@Override
					public void run() {
						
						while(true){
							
							try{
								
								String message = br[0].readLine().toString();
								ps[1].println(message);
								ps[1].flush();
								
							}catch(Exception e){
								
							}
							
						}
						
					}
					
				});
				
				thread1.start();
				
			}else{
				
				Thread thread2 = new Thread(new Runnable(){

					@Override
					public void run() {
						
						while(true){
							
							try{
								
								String message = br[1].readLine().toString();
								ps[0].println(message);
								ps[0].flush();
								
							}catch(Exception e){
								
							}
							
						}
						
					}
					
				});
				thread2.start();
				
			}

		}catch(Exception e){
		
		}
		
	}
	
}
