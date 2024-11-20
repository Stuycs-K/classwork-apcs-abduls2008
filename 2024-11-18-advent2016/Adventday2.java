import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Adventday2 {



  public static String key(String filename){
	  int row=1; // [1][1] is 5
	  int colm=1;
    int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    String code = "";
    try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char dir = line.charAt(i);
                    if (dir == 'U' && row > 0) {
                        row = row - 1;
                    } else if (dir == 'D' && row < 2) {
                        row = row + 1;
                    } else if (dir == 'L' && colm > 0) {
                        colm = colm - 1;
                    } else if (dir == 'R' && colm < 2) {
                        colm = colm + 1;
                    }
                }
              
                code = code + keypad[row][colm];
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return code;
    }
	public static void main(String[] args) {
        
        String filename = "inputday2.txt";
        System.out.println("Bathroom code: " + key(filename));
    }
}
	


  







