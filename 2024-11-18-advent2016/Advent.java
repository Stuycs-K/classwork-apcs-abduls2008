import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent {


 public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }


   

    // Part A: Count triangles row by row
    public static int countTrianglesA(String filename) {
        int validCount = 0;
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (!line.isEmpty()) {
                    Scanner lineScanner = new Scanner(line);
                    if (lineScanner.hasNextInt()) {
                        int a = lineScanner.nextInt();
                        int b = lineScanner.nextInt();
                        int c = lineScanner.nextInt();
                        if (isValidTriangle(a, b, c)) {
                            validCount++;
                        }
                    } else {
                        System.out.println("Skipping line: " + line);
                    }
                    lineScanner.close();
                } else {
                    System.out.println("skipping emty line");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return validCount;
    }

public static int countTrianglesB(String filename) {
    int validCount = 0;
    try {
        Scanner fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextLine()) {
            int[][] sides = new int[3][3];
            int filledRows = 0;

            for (int i = 0; i < 3; i++) {
                if (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    Scanner lineScanner = new Scanner(line);

                    
                    if (lineScanner.hasNextInt()) {
                        sides[i][0] = lineScanner.nextInt();
                        if (lineScanner.hasNextInt()) sides[i][1] = lineScanner.nextInt();
                        if (lineScanner.hasNextInt()) sides[i][2] = lineScanner.nextInt();
                        filledRows++;
                    } else {
                        System.out.println("Skipping line " + line);
                    }

                    lineScanner.close();
                }
            }

            
            if (filledRows == 3) {
                for (int col = 0; col < 3; col++) {
                    int a = sides[0][col], b = sides[1][col], c = sides[2][col];
                    if (isValidTriangle(a, b, c)) {
                        validCount++;
                    }
                }
            } else {
                System.out.println("Skipping line");
            }
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
    }
    return validCount;
}

 public static void main(String[] args) {

        System.out.println("Valid triangles(part a):" + countTrianglesA("inputTri.txt"));
		System.out.println("Valid triangles(part b):" + countTrianglesB("inputTri.txt"));

    }
}
