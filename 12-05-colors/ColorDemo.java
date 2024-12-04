public class ColorDemo{
  /*public static void main(String[] args){
    for(int r = 0; r < 256; r+=10){
      for(int g = 0; g <= 256; g+=10){
        for(int b = 0; b <= 256; b+=30){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+"m");
        }
      }
        System.out.print("abc");
    }
  System.out.println("\u001b[38;2;120;200;50m");
System.out.println("Hello World");
System.out.print("\u001b[0m");
System.out.print("\u001b[1;91m");
System.out.println("Hello World");
System.out.print("\u001b[0m");

}
}
*/
public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";
    public static final String RESET_COLOR =  "\u001b[0m";
    
    
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;
    
    public static void main(String[] args) {
        
        System.out.print(CLEAR_SCREEN);
        System.out.print(HIDE_CURSOR);
        
        
        for (int i = 0; i < 10; i++) {
            
            go(i + 1, 1);
            color(MAGENTA, BLACK);
            System.out.print("MAGENTA"+ (i + 1));
            sleep(500);
            
            
            go(i + 1, 20);
            color(GREEN, BLACK);
            System.out.print("GREEN"+ (i + 1));
            sleep(500);
            
            
            go(i + 1, 40);
            color(BLUE, BLACK);
            System.out.print("BLUE"+ (i + 1));
            
            
            
            System.out.print(RESET_COLOR);
        }
        
        
        System.out.print(SHOW_CURSOR);
    }

    
    public static void color(int foreground, int background) {
        System.out.print("\u001b[" + foreground + ";" + (background + 10) + "m");
    }
    
    
    public static void go(int r, int c) {
        System.out.print("\u001b[" + r + ";" + c + "f");
    }

   
    public static void sleep(int milli) {
        try {
            Thread.sleep(milli);
        } catch (Exception e) {
           
        }
    }
}
