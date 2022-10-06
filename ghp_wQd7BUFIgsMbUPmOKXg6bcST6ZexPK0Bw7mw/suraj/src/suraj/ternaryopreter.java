package suraj;
import java.util.Scanner;
public class ternaryopreter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ("System.in");
		System.out.println("ENTER YOUR NUMBER");
		
    int a=54;
    int b=65;
    int c=78;
    int largenum =(a>b)?((a>c)?a:c):((a>b)?b:c);
    System.out.println(largenum);
	}

}
