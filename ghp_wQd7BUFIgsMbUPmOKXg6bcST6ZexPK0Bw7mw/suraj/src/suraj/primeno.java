package suraj;
import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter value=");
        int   n=sc.nextInt();
        int c=0;
         for(int i=1;i<=n;i++)
       { 
          if(n%i==0)
         {
             c++;
         }
      }
     if(c==2)
     {
         System.out.println("Is a prime number");
    }
  else
    {
         System.out.println("Is not a prime number");
	}
	}
	}
