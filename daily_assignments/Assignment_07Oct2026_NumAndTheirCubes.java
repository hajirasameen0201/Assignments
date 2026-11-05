package daily_assignments;

public class Assignment_07Oct2026_NumAndTheirCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int cube=0;
		int i=1;
	/*	for(i=1;i<=num;i++)
		{
			
			cube=i*i*i;
			System.out.println(cube);
		}*/
	
		while (i <= num) {
            cube = i * i * i;
            System.out.println("Cube of " + i + " is : " + cube);
            i++;
        }
	}

}
