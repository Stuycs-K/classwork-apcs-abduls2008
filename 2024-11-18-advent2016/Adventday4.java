import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Adventday4 {

    public static int calculate(String fileName) {
        int sum = 0;

        try {
            File inputFile = new File(fileName);
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("-");
                String name = "";

              
                for (int i = 0; i < parts.length - 1; i++) {
                    name += parts[i];
                }

                String lastPart = parts[parts.length - 1];
                int openBracket = lastPart.indexOf('[');
                int closeBracket = lastPart.indexOf(']');

                if (openBracket != -1 && closeBracket != -1) {
                    int sectorId = Integer.parseInt(lastPart.substring(0, openBracket));
                    String checksum = lastPart.substring(openBracket + 1, closeBracket);

                    
                    if (isValidRoom(name, checksum)) {
                        sum += sectorId;
                    }
                } else {
                    
                    System.out.println("error: " + line);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return sum;
    }

    public static boolean isValidRoom(String name, String checksum) {
        int[] letcount = new int[26];

        
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                letcount[c - 'a']++;
            }
        }

        
        char[] newsort = new char[26];
        int sortedIndex = 0;

        for (int freq = 100; freq > 0; freq--) {
            for (int i = 0; i < 26; i++) {
                if (letcount[i] == freq) {
                    newsort[sortedIndex++] = (char) (i + 'a');
                }
            }
        }

       
        for (int i = 0; i < checksum.length(); i++) {
            if (checksum.charAt(i) != newsort[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + calculate("inputday4.txt"));
    }
}