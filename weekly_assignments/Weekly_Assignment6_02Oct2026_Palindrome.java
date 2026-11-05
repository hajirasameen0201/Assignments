package weekly_assignments;

public class Weekly_Assignment6_02Oct2026_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13332121;
		int original=num;
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
		if(original==reverse)
			System.out.println("The number is a Palindrome");
		else
			System.out.println("The number is NOT a Palindrome");
	}

}
