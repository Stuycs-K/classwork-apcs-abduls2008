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
	 
	 ArrayList<String> alist = new ArrayList<>();
        alist.add("A1");
        alist.add("A2");
        alist.add("A3");
        alist.add("A4");
        alist.add("A5");

        ArrayList<String> blist = new ArrayList<>();
        blist.add("B1");
        blist.add("B2");

        ArrayList<String> mixedList = ArrayListPractice.mixLists(alist, blist);
        System.out.println(mixedList);
    }

  }


