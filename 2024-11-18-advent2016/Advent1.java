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
	  public static int part2(String filename) {
        int x = 0, y = 0;
        int direction = 0;
        int[][] visitedLocations = new int[10000][2];
        int visitedCount = 1;
        visitedLocations[0][0] = x;
        visitedLocations[0][1] = y;

        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (!line.isEmpty()) {
                    String[] instructions = line.split(", ");
                    for (int i = 0; i < instructions.length; i++) {
                        String instruction = instructions[i];
                        char turn = instruction.charAt(0);
                        int steps = Integer.parseInt(instruction.substring(1));

                        if (turn == 'R') {
                            direction = (direction + 1) % 4;
                        } else if (turn == 'L') {
                            direction = (direction + 3) % 4;
                        }

                        for (int j = 0; j < steps; j++) {
                            if (direction == 0) {
                                y++;
                            } else if (direction == 1) {
                                x++;
                            } else if (direction == 2) {
                                y--;
                            } else if (direction == 3) {
                                x--;
                            }

                            boolean visited = false;
                            for (int k = 0; k < visitedCount; k++) {
                                if (visitedLocations[k][0] == x && visitedLocations[k][1] == y) {
                                    visited = true;
                                    break;
                                }
                            }

                            if (visited) {
                                return Math.abs(x) + Math.abs(y);
                            }

                            visitedLocations[visitedCount][0] = x;
                            visitedLocations[visitedCount][1] = y;
                            visitedCount++;
                        }
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return -1;
    }

   public static void main(String[] args) {
        String filename = "input2.txt"; 
        System.out.println("Distance to Easter Bunny HQ: " + calculateDistance(filename));
        System.out.println("part2: " + part2(filename));
		
    }
}
