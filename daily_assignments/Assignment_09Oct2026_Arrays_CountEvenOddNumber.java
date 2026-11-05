package daily_assignments;

public class Assignment_09Oct2026_Arrays_CountEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {42,0,45,67,89};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.print("\nEven Count : " + evenCount);
		System.out.print("\nOdd Count : "+ oddCount);

		
	}

}
