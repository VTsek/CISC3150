import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Date;
import java.util.Scanner;

public class ClientA {

	public static PipedInputStream pisA;
    public static PipedOutputStream posA;
    private DataInputStream ds;
    private DataOutputStream dou;
    private Scanner scan;
	
	public ClientA(){
		
		pisA = new PipedInputStream();
		posA = new PipedOutputStream();
		
		ds = new DataInputStream(pisA);
		dou = new DataOutputStream(posA);
		
		startChatting();
		
	}
	
	private void startChatting(){
		
		try{
			
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					
					while(true){
						
						try{
							
							String cText = ds.readUTF();
							Date date = new Date();
							System.out.println("At "+date.toString()+" Client B Recieved: "+cText);
							
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
					
						try{
							
							String[] messages = {"Hi","Ohhh..","How are you?","Fine","What's up"};
							
							for(int i = 0; i < messages.length; i++){
								
								String text = messages[i];
								Date date = new Date();
								System.out.println("At "+date.toString()+" Client B Said: "+text);
								dou.writeUTF(text);
								
								Thread.sleep(500);
								
							}
							
						}catch(Exception e){}
						
				}
				
			});
			thread.start();
			
		}catch(Exception e){}

	}
	
}
