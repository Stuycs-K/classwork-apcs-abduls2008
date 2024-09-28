public class MyArrays{
  public static String aryToString(int[] nums){
	String ans = "[";
    for (int i = 0; i< nums.length; i++){
	ans+= nums[i];
	if (i< nums.length -1){
		ans+=", ";
	}

  }
  return ans + "]";
}

	public static int[] returnCopy(int[] ary) {
    // Create a new array of the same length
		int[] copy = new int[ary.length];
    
    // Copy elements from ary to copy
		for (int i = 0; i < ary.length; i++) {
        copy[i] = ary[i];
    }
    
		return copy;
}


  
  public static int[] concatArray(int[] ary1, int[] ary2){
	  int[] newarray = new int[ary1.length + ary2.length];
	  for (int i=0; i<ary1.length; i++){
		newarray[i] = ary1[i];
	  }
		
	  for (int i=0; i<ary2.length; i++){
		newarray[ary1.length + i] = ary2[i];
	  }
	  return newarray;
  }


  
 //public static void main(String[] args){
	//int[] one = {1};
	//int[] two = {1,5};
   // System.out.println(aryToString(one));
	//System.out.println(aryToString(two));
//  }

  



 public static void main(String[] args) {
    
    int[] originalArray = {1, 2, 3, 4, 5};
    int[] copiedArray = returnCopy(originalArray);
    
    
    System.out.println("Original Array:" + aryToString(originalArray));
    System.out.println("Copied Array:" + aryToString(copiedArray));
    
    
    

   
    originalArray[0] = 10;
    System.out.println("Modified Original Array: " + aryToString(originalArray));
    System.out.println("Copied Array after original modification: " + aryToString(copiedArray));
    
    
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    
    int[] concatenatedArray = concatArray(array1, array2);
    System.out.println("Concatenated Array: " + aryToString(concatenatedArray));

    // check if arrays are unchanged
    System.out.println("Array 1: " + aryToString(array1));
    System.out.println("Array 2: " + aryToString(array2));
}
}

