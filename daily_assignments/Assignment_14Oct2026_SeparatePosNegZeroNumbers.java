package daily_assignments;

public class Assignment_14Oct2026_SeparatePosNegZeroNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {-4, 7, 0, -2, 9, 0, -8, 5};
		
		int [] pos = new int[arr.length];
		int [] neg = new int[arr.length];
		int [] zero = new int[arr.length];
		int posCount=0;
		int negCount=0;
		int zeroCount=0;
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				pos[posCount]=arr[i];
				posCount++;
			}
			else if(arr[i]<0)
			{
				neg[negCount]=arr[i];
				negCount++;
			}
			else
			{
				zero[zeroCount]=arr[i];
				zeroCount++;
			}	
		}
		 System.out.println("Final Result:");

	        for (int i = 0; i < posCount; i++) {
	            System.out.print(pos[i] + " ");
	        }

	        for (int i = 0; i < negCount; i++) {
	            System.out.print(neg[i] + " ");
	        }

	        for (int i = 0; i < zeroCount; i++) {
	            System.out.print(zero[i] + " ");
	        }
	}

}
