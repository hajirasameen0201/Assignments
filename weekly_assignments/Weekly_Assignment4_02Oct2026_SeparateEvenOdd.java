package weekly_assignments;

public class Weekly_Assignment4_02Oct2026_SeparateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Even Numbers are : ");
		for (int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				//System.out.println("The number is even");
				System.out.print(i +" ");
			}
		}		
		System.out.println();
		System.out.print("Odd Numbers are : ");
		for (int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				//System.out.println("The number is odd");
				System.out.print(i +" ");
			}
		}

	}

}
