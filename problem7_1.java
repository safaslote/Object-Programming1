import java.util.Scanner;
public class problem7_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your age > ");
	    int age = scan.nextInt();
	    int BASIC_CHARGE = 600;
	    int SURCHARGE = 150;
		int ACCIDENT_SURCHARGE = 60;
	    
	    if (age >= 25) {
	    	System.out.println("Your total insurance cost is $" + BASIC_CHARGE);
	    
		}else {
			System.out.print("Enter your number of accidents > ");
			int accidents = scan.nextInt();
			
			if (accidents < 6 ) {
			int total = BASIC_CHARGE + SURCHARGE + (ACCIDENT_SURCHARGE * accidents);
			System.out.println("Your total insurance cost is $" + total);
			
			}else {
				System.out.println("You will not receive any insurance");
				
			
				
		}
		}
		}
	}