public class Fib{   public static int fibb(int n){     if(n<2){       return n;     }     return fibb(n-1)+fibb(n-2);   }    public static void main(String[] args){     System.out.println(fibb(47));   } } 
