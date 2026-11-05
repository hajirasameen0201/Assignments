package weekly_assignments;

public class Weekly_Assignment5_02Oct2026_SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=50;
		for (int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				//System.out.print(i +" ");
			}
		}
		System.out.println("The Sum of Even Numbers between 1 and " +num +" is : " + sum);
	}

}
