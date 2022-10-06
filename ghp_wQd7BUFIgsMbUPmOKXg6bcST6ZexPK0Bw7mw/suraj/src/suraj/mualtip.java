package suraj;
 import java.util.Scanner;
public class mualtip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner (System.in);
   int x = sc.nextInt();
	
	for(int a=1;a<=10;a++) {
   int result =x*a;
       System.out.println(x+"*"+a+"="+result); 
	}
	}
}
