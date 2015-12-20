import java.util.Scanner;

public class Chess {

	private int numberOfQueens, possible = 1;
	private Scanner scan;
	private int[] position;
	private boolean place = true;
	
	public Chess(){
		
		scan = new Scanner(System.in);
				
		System.out.print("Enter Number of Queens: ");
		numberOfQueens = scan.nextInt();
		
		position = new int[numberOfQueens];
		
		Placing(0);
		
	}
	
	private void Placing(int row){
		
		for (int i = 0; i < numberOfQueens; i++) {
            
			for (int j = 0; j < row ; j++) {
				
	            if (position[j] == i || (j - row) == (position[j] - i) ||(j - row) == (i - position[j])){
	            	
	                place = false;
	            
	            }
	        
			}
			
			if (place) {
				
                position[row] = i;
            
                if (row == numberOfQueens - 1) {
                
                	Print();
                
                } else {
                
                	Placing(row + 1);
                
                }
                
            }else{
            	
            	place = true;
            	
            }
        
		}
		
	}
	
	private void Print() {
        
		System.out.println("Possible Placement "+possible);
		possible++;
		
		for(int i = 0; i < numberOfQueens; i++){

			for(int j = 0; j < numberOfQueens; j++){
				
				if(position[i] == j){
					
					System.out.print(" Q ");
					
				}else{
					
					System.out.print(" * ");
					
				}
				
			}
			
			System.out.print("\n");
			
		}
		
		System.out.print("\n");

    }
	
}
