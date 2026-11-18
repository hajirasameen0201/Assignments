package weekly_assignments;

public class Weekly_Assignment_09Oct2026_SeparatePosNegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {-4, 7, 0, -2, 9, 0, -8, 5};
		
		for (int i = 0; i < arr.length; i++) {
		    int num = arr[i];
	            if (num > 0) 
	            {
	                System.out.print(num + " ");
	            }
		}
		 
		for (int i = 0; i < arr.length; i++) {
		    int num = arr[i];
	            if (num < 0) 
	            {
	                System.out.print(num + " ");
	            }
		}
		 
		for (int i = 0; i < arr.length; i++) {
		    int num = arr[i];
	            if (num == 0) 
	            {
	                System.out.print(num + " ");
	            }
		}
		}
	}


