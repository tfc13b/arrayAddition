import java.util.Scanner;
public class mwp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		otherOne  otherOneObject = new otherOne ();
		
		System.out.println("Enter your age here: ");
		int age = input.nextInt();
		
		otherOneObject.simpleMessage(age);
	}

}
