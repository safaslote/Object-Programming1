import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		 
		  System.out.print("Please enter a number > " );
		 
		  int number = scan.nextInt();
		  
		  
		  switch(number) {
		  case (10):
		   System.out.println("You have entered the number 10");
		   break;
		  case (20):
		   System.out.println("You have entered the number 20");
		  break;
		  case (30):
		   System.out.println("You have entered the number 30");
		  break;
		  case (40):
		   System.out.println("You have entered the number 40");
		  break;
		  default:
		   System.out.println("You have entered " + number + " ERROR MESSAGE");
		  }
		  
		  if (number == 10 || number == 20) {
		   System.out.println("Lower values require ID");
		  
		   
		  
		  }
		   
		 }
		}

	