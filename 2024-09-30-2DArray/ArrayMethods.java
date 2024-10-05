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
    String builder="[";
    for (int i = 0; i<ary.length; i++){
		builder = builder + arrToString(ary[i]);
		if (i< ary.length -1){
			builder = builder + ", ";
		}
	}
  
	
	builder = builder + "]";
	return builder;
  }
  
  public static int arr2DSum(int[][] nums) {
    int totalSum = 0;
    
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[i].length; j++) {
            totalSum = totalSum + nums[i][j];
        }
    }
    
    return totalSum;
}

   public static int[][] swapRC(int[][] nums) {
    int rowCount = nums.length;
    int colCount = nums[0].length;
    int[][] swapped = new int[colCount][rowCount];
    
    for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < colCount; j++) {
            swapped[j][i] = nums[i][j];
        }
    }
    
    return swapped;
}


public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
        for (int j = 0; j < vals[i].length; j++) {
            if (vals[i][j] < 0) {
                
                if (i == j) {
                    vals[i][j] = 1;
                } else {
                    vals[i][j] = 0;
                }
            }
        }
    }
	
	
	
}
public static int[][] copy(int[][] nums) {
       
        int rows = nums.length;

        
        int[][] copy = new int[rows][];

        
        for (int i = 0; i < rows; i++) {
           
            int cols = nums[i].length;
            copy[i] = new int[cols];

            
            copyRow(nums[i], copy[i]);
        }

        return copy;
    }

 
    public static void copyRow(int[] originalRow, int[] newRow) {
        for (int i = 0; i < originalRow.length; i++) {
            newRow[i] = originalRow[i];
        }
    }














public static void main(String[] args){
	int[] test = {1,2,3,0};
	int[][] test2 = {{1,2,3,0},{9,9}, {5,6,7,9}};
	int[][] test3 = {{1,2,5,2},{92,9}, {5,6,7,9}};
	int[][] test4 = {{1,2,3,},{4,5,6}};
	int[][] test5 = {{1,-2,3,},{4,5,6}};
	
	System.out.println(arrToString(test));
	System.out.println(arrToString(test2));
	System.out.println(arrToString(test2));
	System.out.println(arr2DSum(test3));
	System.out.println(arrToString(swapRC(test4)));
	System.out.println(arrToString(copy(test4)));
	replaceNegative(test5);
	System.out.println(arrToString(test5));
	
	
	
	
}






}


	


   

  
   

	
  