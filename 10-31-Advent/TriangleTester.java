import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
 
 
 public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

   
    public static int countTrianglesA(String filename) {
        int validCount = 0;
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                int a = lineScanner.nextInt();
                int b = lineScanner.nextInt();
                int c = lineScanner.nextInt();
                if (isValidTriangle(a, b, c)) {
                    validCount++;
                }
                lineScanner.close();
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
                int[][] side = new int[3][3];
				for (int i=0; i<3; i++){
					if (fileScanner.hasNextLine()){
						Scanner lineScanner = new Scanner(fileScanner.nextLine());
						side[i][0] = lineScanner.nextInt();
						side[i][1] = lineScanner.nextInt();
						side[i][2] = lineScanner.nextInt();
						 lineScanner.close();
					}
                }
				for (int colm = 0; colm <3; colm++){
					int a = side[0][colm], b = side[1][colm], c = side[2][colm];
                    if (isValidTriangle(a, b, c)) {
                        validCount++;
				
                
            }
				
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