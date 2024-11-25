import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
    
    public static String getLeastFrequentMessage(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            
            String firstLine = scanner.nextLine();
            int length = firstLine.length();
            int[][] frequencies = new int[length][26];  
            
           
            updateFrequencies(firstLine, frequencies);
            
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                updateFrequencies(line, frequencies);
            }
            scanner.close();
            
            
            return buildLeastFrequentMessage(frequencies, length);
        } catch (FileNotFoundException e) {
            return "File not found: " + e.getMessage();
        }
    }
    
  
    private static void updateFrequencies(String line, int[][] frequencies) {
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            frequencies[i][c - 'a']++;
        }
    }
    
   
    private static String buildLeastFrequentMessage(int[][] frequencies, int length) {
        String message = "";
        for (int i = 0; i < length; i++) {
            int minCount = 1000;  
            char leastFrequentChar = 'a';

            for (int j = 0; j < 26; j++) {
                if (frequencies[i][j] > 0 && frequencies[i][j] < minCount) {
                    minCount = frequencies[i][j];
                    leastFrequentChar = (char) (j + 'a');
                }
            }
            message += leastFrequentChar;
        }
        return message;
    }
    
    public static void main(String[] args) {
        String file = "inputday6.txt"; 
        String leastFrequentMessage = getLeastFrequentMessage(file);
        System.out.println("Corrected Message: " + leastFrequentMessage);
    }
}
