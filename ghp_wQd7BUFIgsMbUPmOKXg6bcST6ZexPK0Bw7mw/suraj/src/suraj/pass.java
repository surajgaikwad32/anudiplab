package suraj;
import java.util.Scanner;
public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
		 System.out.println("enter the no");
		 int sub1=obj.nextInt();
		 int sub2=obj.nextInt();
		 int sub3=obj.nextInt();
		 int Avg=(sub1+sub2+sub3)/3;
		 
		 System.out.println(Avg);
		 if (Avg>=70)
		 { 
		  System.out.println("A Grade");
		     }
		 else if (Avg>=60 && Avg<70)
		 { 
		    System.out.println("B Grad");
		 }
		   else if (Avg<60)
		 {System.out.println("Fail");
		    }
	}

}
