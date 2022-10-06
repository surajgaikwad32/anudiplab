package suraj;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj = new Scanner (System.in);
     System.out.println("please enter the no" );
     int x=obj.nextInt();
     int y =obj.nextInt();
  
     int result =1;  
    	
     for (int i=1;i<=y;i++) { 
    	 result*=x ;
     }
     System.out.println(result);
	}

}
