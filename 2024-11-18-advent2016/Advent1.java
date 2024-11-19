import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent1 {

    public static int calculateDistance(String filename) {
        int x = 0, y = 0; 
        int direction = 0; 

        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                
                if (!line.isEmpty()) {
                    
                    String[] instructions = line.split(", ");
                    for (String instruction : instructions) {
                        char turn = instruction.charAt(0); 
                        int steps = Integer.parseInt(instruction.substring(1)); 

                        
                        if (turn == 'R') {
                            direction = (direction + 1) % 4;
                        } else if (turn == 'L') {
                            direction = (direction + 3) % 4;
                        }

                        
                        switch (direction) {
                            case 0: y += steps; break; // North
                            case 1: x += steps; break; // East
                            case 2: y -= steps; break; // South
                            case 3: x -= steps; break; // West
                        }
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

       
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        String filename = "input2.txt"; // Input file containing the directions
        System.out.println("Distance to Easter Bunny HQ: " + calculateDistance(filename));
    }
}