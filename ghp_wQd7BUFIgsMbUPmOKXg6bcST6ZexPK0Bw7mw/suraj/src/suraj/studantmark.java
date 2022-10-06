package suraj;

import java.util.Scanner;
public class studantmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


				Scanner sc = new Scanner(System.in);
				System.out.println("enter the marks");
				int marks = sc.nextInt();
				
				String result = (marks>=40)? "pass":"fail";
					System.out.println(result);

			}

		
	}


