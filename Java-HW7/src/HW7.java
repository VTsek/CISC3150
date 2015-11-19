import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HW7 {

	//Static Variables because they need to be shared among static methods
	public static PrintWriter output_to_file;
	
	public static File main_file = new File("dir_tree.txt");;
		
	public static void main(String[] args) {
		
		int level = 0;
	
		try {
			output_to_file = new PrintWriter(main_file);
			
			//Using default directory D:\
			File get_dir = new File("D:\\");
			
			//Calls recursive function
			search(get_dir, level);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			output_to_file.close();
			System.out.println("Done");
		}
	}
	
	public static void search(File fileSys, int level) {
		//Get Directory of files into fileArr
		File[] fileArr = fileSys.listFiles();
		
		
		for (int i = 0; i < fileArr.length; i++) {
			
			//Folders passed through this if statement
			//If they are a directory and not hidden, run the for loop
			if (fileArr[i].isDirectory() && !(fileArr[i].isHidden())) {
				for (int j = 0; j < level; j++) {
					output_to_file.print("\t");
					output_to_file.flush();
				}
				//Get name of folder and print to the file
				output_to_file.print(fileArr[i].getName());
				output_to_file.println();
				output_to_file.flush();
				
				//Recursive statement call to keep printing the folders 
				//in D:/ directory
				search(fileArr[i], level + 1);
			}
		}
	}
}
