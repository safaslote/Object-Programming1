import java.util.Scanner;
public class problem7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        float total = 0;
        float count = 0;
        while (true) {
            System.out.print("Would you like to enter a real number? ");
            String s1 = scan.next();
            if(s1.equals("no")) {
                System.out.println("Your average is " + (float)(total) /count);
                break;
            }
            System.out.print("Enter a real number: ");
            float number = scan.nextFloat();
            total += number;
            count++;
        }

    }
}







			
				
		
				
				
		
		
	
		 
	

		


	


