package weekly_assignments;

public class Weekly_Assignment_09Oct2026_MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,2,3,5,6,8,9,10};
		int n = arr.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
           if(!found)
        	   System.out.println("The missing number is : " + i);

	}

	}
}
