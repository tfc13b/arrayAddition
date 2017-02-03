//whileloops
import java.util.Scanner;

public class whilestatement {

	public static void main(String[] args) {
	Scanner tim = new Scanner(System.in);
		int counter;
		
		counter = tim.nextInt();
		
		while (counter < 10){
			System.out.println("Your number is less than 10");
			counter++;
			
		}
	}
}

