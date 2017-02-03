import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// Creating scanner variable

		Scanner tim = new Scanner(System.in);
		
		//declare variables 
		
		int fnum, snum, answer;


		System.out.println("Enter first number: ");

		fnum = tim.nextInt();

		System.out.println("Enter second number: ");

		snum = tim.nextInt();

		answer = fnum + snum;

		System.out.println("the answer is : " + answer);
	}
	}