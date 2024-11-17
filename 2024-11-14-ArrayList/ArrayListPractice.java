import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> randomList = new ArrayList<String>();
    int randomInt;
    while(size > 0){
      randomInt= (int)(Math.random()*11);
      if(randomInt == 0){
        randomList.add("");
      }
      else{
        randomList.add(randomInt+"");
      }
      size--;
    }
    return randomList;
  }

  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i< original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }


public static ArrayList<String> makeReversedList( ArrayList<String> original){
  ArrayList<String> reverse = new ArrayList<>();
    for (int i = original.size() - 1; i >= 0; i--) {
        reverse.add(original.get(i));
    }
    
    return reverse;
}


public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> mixedList = new ArrayList<>();
  int i = 0;
  while (i < a.size() && i < b.size()) {
        mixedList.add(a.get(i)); // Add from list 'a'
        mixedList.add(b.get(i)); // Add from list 'b'
        i++;
    }
	while (i < a.size()) {
        mixedList.add(a.get(i));
        i++;
    }
	while (i < b.size()) {
        mixedList.add(b.get(i));
        i++;
	}
	return mixedList;
}
}

