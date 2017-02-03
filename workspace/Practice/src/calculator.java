import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		double a, b;
		int answer;
		
		System.out.println("Please enter a value for a: ");
		a = input.nextDouble();
		
		System.out.println("Please enter a value for b: ");
		b = input.nextDouble();
		
		System.out.println("Please enter 1 for addtion, 2 for subtraction, 3 for multiplication, 4 for division");
		answer = input.nextInt();
		
		switch (answer){
		case 1: 
			System.out.println( a + b ); 
			break;
		case 2: 
			System.out.println( a - b );
			break;
		case 3: 
			System.out.println( a * b );	
			break;
		case 4: 
			System.out.println( a / b );	
			break;
		default: 
			System.out.println("Input not valad");
			break;
		}

	}

}
