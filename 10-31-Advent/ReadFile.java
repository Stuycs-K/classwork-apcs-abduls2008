import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile {

  public static void main(String[] args) {
	//2 Opening a file requires a try/catch
	try {
  	File file = new File("ReadFile.java");//1
  	Scanner input = new Scanner(file);
  	int lineNumber = 0; //counter
            while (input.hasNextLine()) {
            String line = input.nextLine();
                
           if (lineNumber % 2 == 0) { //Even lines
           System.out.println(line);
                }

            lineNumber++; 
            }
  	input.close();//releases the file from your program

	} catch (FileNotFoundException ex) {
  	//File not found what should you do?
  	System.out.println("File not found");
  	return; //you can return from a void function just don't put a value.
	}
  }
}


