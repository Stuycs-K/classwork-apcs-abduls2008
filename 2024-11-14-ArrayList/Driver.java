import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> Short = new ArrayList<String>();
    Short = ArrayListPractice.createRandomArray(20);
    System.out.println(Short);
    ArrayListPractice.replaceEmpty(Short);
    System.out.println(Short);

  }

}
