package weekly_assignments;

public class Weekly_Assignment3_02Oct2026_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634;
		int original=num;
		int count=0;
		int armstrong=0;
	
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		num=original;
		for(;num>0;) 
		{
			int lastDigit=num%10;
			int multiply=1;
			for(int i=1; i<=count;i++)
				multiply=multiply*lastDigit;
			armstrong=armstrong+multiply;
			num=num/10;
		}
		if(original==armstrong)	
		System.out.println(original + " is an Armstrong number");
		else
		System.out.println(original + " is not an Armstrong number");

	
	}

}
