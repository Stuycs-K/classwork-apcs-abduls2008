//Jai Shah and Abdul Siddique
//jaiS5@nycstudents.net and asiddique60@stuy.edu

public class ArrayMethods{
  public static String arrToString(int[] nums){
    String arr="[";
    if(nums.length==0){
      return "[]";
    }
    arr+=nums[0];
    for(int i=1; i<nums.length; i++){
    arr+=", "+nums[i];
    }
    arr+="]";
    return arr;
  }

  public static String arrToString(int[][]ary){
    String arr="[";
    for (int i = 0; i<ary.length; i++){
      arr+=arrToString(ary[i]);
    }
    return "";
  }

  public static int[] returnCopy(int[]ary){
    int[] arr=new int[ary.length];
    for(int i=0; i<ary.length; i++){
      arr[i]=ary[i];
    }
    return arr;
  }

  public static boolean arraychecker(int[]a, int[]b){
    if(a.length!=b.length){
      return false;
    }
    for(int i=0; i<a.length; i++){
      if (a[i]!=b[i]){
        return false;
      }
    }
    return true;
  }

  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] ary=new int[ary1.length+ary2.length];
    for(int i=0; i<ary1.length; i++){
      ary[i]=ary1[i];
    }
    for(int i=0; i<ary2.length; i++){
      ary[ary1.length+i]=ary2[i];
    }
    return ary;
  }

  public static void main(String[] args){
    //test cases
    int[] test1 = new int[]{};
    int[] test2 = new int[]{0, 4, 23,19, 23};
    int[] test3 = new int[]{1};
    int[] test4= new int[]{1, 12};
    int[] test5= new int[]{2, 3, 4, 9};
    int[][] test6= new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};

    System.out.println("Original: [], Actual: "+ arrToString(test1));
    System.out.println("Original: [0, 4, 23, 19, 23], Actual: "+ arrToString(test2));
    System.out.println("Original: [1], Actual: "+ arrToString(test3));
    System.out.println("Original: [1,12], Actual: "+ arrToString(test4));

    System.out.println("Does it match: "+ arraychecker(test1, returnCopy(test1)));
    System.out.println("Does it match: "+ arraychecker(test2,returnCopy(test2)));
    System.out.println("Does it match: "+ arraychecker(test3,returnCopy(test3)));
    System.out.println("Does it match: "+ arraychecker(test4,returnCopy(test4)));

    System.out.println("Original: [] and [0, 4, 23, 19, 23], Concat: "+ arrayToString(concatArray(test1, test2)));
    System.out.println("Original: [0, 4, 23, 19, 23] and [1], Concat: "+ arrayToString(concatArray(test2, test3)));
    System.out.println("Original: [1] and [1,12], Concat: "+ arrayToString(concatArray(test3, test4)));
    System.out.println("[2, 3, 4, 9] vs" + arrToString(test5));
    System.out.println("[[2, 3, 4], [5, 6, 7], [2, 4, 9]]" + arraytest6);



  }
}
