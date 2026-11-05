package weekly_assignments;

public class Weekly_Assignment1_02Oct2026_ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int reverse=0;
		System.out.print("The reverse of "+num+" is : ");
		for(;num>0;)
		{
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			//System.out.println(lastDigit);
			num=num/10;
		}
		System.out.println(reverse);
		
	}

}
