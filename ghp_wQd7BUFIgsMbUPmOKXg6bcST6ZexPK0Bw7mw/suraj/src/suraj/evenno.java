package suraj;
import java.util.Scanner;
public class evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("enter your number");
     int number =sc.nextInt();
     
     String result =(number % 2==0)? "even":"odd";
       System.out.println(result);
       
    	
       
    
	}
}
