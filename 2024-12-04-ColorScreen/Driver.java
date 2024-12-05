import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        
        drawBorder();

        
        int[] randomNumbers = generateRandomNumbers();
        displayRandomNumbers(randomNumbers);
		drawSeparator();

        drawstuff();
        Text.go(31, 1);
        System.out.println(Text.RESET);

        
	}

    
    public static void drawBorder() {
        for (int col = 1; col <= 80; col++) {
            
            Text.go(1, col);
            Text.color(Text.BRIGHT, Text.background(Text.BLUE));
            System.out.print("+");

            
            Text.go(30, col);
            Text.color(Text.BRIGHT, Text.background(Text.BLUE));
            System.out.print("+");
        }

        for (int row = 1; row <= 30; row++) {
            
            Text.go(row, 1);
            Text.color(Text.BRIGHT, Text.background(Text.BLUE));
            System.out.print("+");

            
            Text.go(row, 80);
            Text.color(Text.BRIGHT, Text.background(Text.BLUE));
            System.out.print("+");
        }
    }

    
    public static int[] generateRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    
    public static void displayRandomNumbers(int[] numbers) {
        int startCol = 20; 
        for (int i = 0; i < numbers.length; i++) {
            Text.go(2, startCol + i * 20);
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }
	 public static void drawSeparator() {
        for (int col = 1; col <= 80; col++) {
            Text.go(3, col);
            Text.color(Text.BRIGHT, Text.background(Text.GREEN));
            System.out.print("=");
        }
    }

    
    public static void drawstuff() {
        Text.go(15, 35); 
        Text.color(Text.CYAN, Text.background(Text.YELLOW), Text.BRIGHT);
        System.out.print(":)");
    }
	
}



 