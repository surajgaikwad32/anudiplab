package suraj;
import java.util.Scanner;
public class Triangal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Sc = new Scanner (System.in);
      
      		int x = Sc.nextInt();
      		char l = Sc.next().charAt(0);
      		
      		if((x==1 || x==3 || x==5 || x==7 ) && (l=='A' || l=='C' || l=='E' || l=='G' )){
      			System.out.println("Black");
      		}else if ((x==2 || x==4 || x==6 || x==8 ) && (l=='B' || l=='D' || l=='F' || l=='H' )){
      		
              System.out.println("White");
      	}
	}
}
	


