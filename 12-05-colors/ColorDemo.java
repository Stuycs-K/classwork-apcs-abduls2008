public class ColorDemo{
  public static void main(String[] args){
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
