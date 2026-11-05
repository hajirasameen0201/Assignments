package weekly_assignments;

public class Weekly_Assignment2_02Oct2026_CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123512345;
		int count=0;
		System.out.print("The Count of digits of "+num+" is : ");
		for(int i=1;i<=num;i++)
		{
			count++;
			num=num/10;
			
		}
		System.out.print(count);

	}

}
