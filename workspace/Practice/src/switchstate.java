import java.util.Scanner;

public class switchstate {

	public static void main(String[] args) {
	Scanner tim = new Scanner(System.in);

	int age;

	System.out.println("Please enter and age for your child from 1-3: ");

	age = tim.nextInt();

	switch (age){
	case 1: 
			System.out.println("Your child can crawl");
			break;
	case 2: 
			System.out.println("Your child can talk");
			break;
	case 3: 
			System.out.println("Your child can get into trouble");	
			break;
	default: 
			System.out.println("Age not valid!");
			break;
	}


	}

}
