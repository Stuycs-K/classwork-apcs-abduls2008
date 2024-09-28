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

 // public static int[] returnCopy(int[]ary)
  //  String[] builder;
  //  for (i = 0; i<ary.length; i++){
  //    builder+=ary[i];


 //   }




  
  public static void main(String[] args){
	int[] one = {1};
	int[] two = {1,5};
    System.out.println(aryToString(one));
	System.out.println(aryToString(two));
  }
}
  



 //public static int[] concatArray(int[]ary1,int[]ary2)
