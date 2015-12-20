import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Date;

public class Server {

	public static PipedInputStream pisSB, pisSA;
    public static PipedOutputStream posSB, posSA;
    private ClientB client1;
    private ClientA client2;
    private DataInputStream dsA,dsB;
    private DataOutputStream douA,douB;
	
	public Server(){

		pisSA = new PipedInputStream();
		posSA = new PipedOutputStream();
		pisSB = new PipedInputStream();
		posSB = new PipedOutputStream();
	
		dsB = new DataInputStream(pisSB);
		douB = new DataOutputStream(posSB);
		dsA = new DataInputStream(pisSA);
		douA = new DataOutputStream(posSA);
		
		client1 = new ClientB();
		client2 = new ClientA();
		
		try{
			
			posSA.connect(client2.pisA);
			client2.posA.connect(pisSA);
			
			posSB.connect(client1.pisB);
			client1.posB.connect(pisSB);
			
		}catch(Exception e){e.printStackTrace();}
		
		Piping();
		
	}
	
	public void Piping(){
		
		try{
			
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					
					while(true){
						
						try{
							
							douA.writeUTF(dsB.readUTF());
							
						}catch(Exception e){}
						
					}
					
				}
				
			});
			thread.start();
			
		}catch(Exception e){}
		
		try{
			
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					
					while(true){
						
						try{
							
							douB.writeUTF(dsA.readUTF());
							
						}catch(Exception e){}
						
					}
					
				}
				
			});
			thread.start();
			
		}catch(Exception e){}
		
	}
	
}
