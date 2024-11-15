import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> Short = new ArrayList<String>();
    Short = ArrayListPractice.createRandomArray(20);
    System.out.println(Short);
    ArrayListPractice.replaceEmpty(Short);
    System.out.println(Short);
		ArrayList<String> A = new ArrayList<String>();
		A.add("banana");
		A.add("strawberry");
	 ArrayList<String> reversedList = ArrayListPractice.makeReversedList(A);
	 System.out.println(reversedList);

  }

}
