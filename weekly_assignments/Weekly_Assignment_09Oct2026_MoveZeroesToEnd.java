package weekly_assignments;

public class Weekly_Assignment_09Oct2026_MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr= {100,-89,99,99,12,45,7,89,0,-44,34,89,56};
		
		int[]arr= {-4, 7, 0, -2, 9, 0, -8, 5};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==0)
				{
					if(arr[j]!=0)
					{
						//swap
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					else
						j++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
