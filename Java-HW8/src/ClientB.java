import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Date;
import java.util.Scanner;

public class ClientB {

	public static PipedInputStream pisB;
    public static PipedOutputStream posB;
    private DataInputStream ds;
    private DataOutputStream dou;
    private Scanner scan;
	
	public ClientB(){
		
		pisB = new PipedInputStream();
		posB = new PipedOutputStream();
		
		ds = new DataInputStream(pisB);
		dou = new DataOutputStream(posB);
		
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
							
							String[] messages = {"Hey","Ahh","What is going..","Fine","Nothing.."};
							
							for(int i = 0; i < messages.length; i++){
							
								String text = messages[i];
								Date date = new Date();
								System.out.println("At "+date.toString()+" Client B Said: "+text);							
								dou.writeUTF(text);
								
								Thread.sleep(2000);
							
							}
						}catch(Exception e){}
						
					}
					
				
			});
			thread.start();
			
		}catch(Exception e){}

	}
}
