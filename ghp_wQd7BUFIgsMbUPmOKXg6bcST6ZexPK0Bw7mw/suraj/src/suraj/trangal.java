package suraj;
import java.util.Scanner;
public class trangal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your angle1");
		int angle1 = sc.nextInt();
				
		System.out.println("Enter your angle2");
		int angle2 = sc.nextInt();
		
		System.out.println("Enter your angle3");
		int angle3= sc.nextInt();
	
		if(angle1 +angle2 + angle3 ==180)
		{
		System.out.println("the given system is a triangle");
		if(angle1<90 && angle2<90 && angle3<90) {
			System.out.println("the given system is a accute triangle");
		}
		else if (angle1==90 || angle2==90 ||angle3==90) {
			System.out.println("the given system is a right angle triangle");
			
		}
		else if (angle1>90 || angle2>90 || angle3>90)
		{System.out.println("the given system is a obtuse triangle");
		}
		
			
		

	}
		else 
		{System.out.println("the given system is a not triangle");}
	}

	}


