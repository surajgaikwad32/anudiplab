package suraj;
import java.util.Scanner;
public class PROGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your  no");
		int x = sc.nextInt();
		if(x<=9)
		{
			
			System.out.println("Single digit number");
			
		}
		else if(x<=99)
		{
			
			System.out.println("Double digit number");
			
		}
		else if(x<=999)
		{
			
			System.out.println("triple digit number");
			
		}
	}


	}


