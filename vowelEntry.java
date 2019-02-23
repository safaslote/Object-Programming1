import java.util.Scanner;
public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  System.out.print("Please enter a vowel > " );
		  String vowel = scan.next();
		  char vowels = vowel.charAt(0);
		  
		  switch(vowels) {
		  case('a'):
		  System.out.println("You have entered the vowel a");
		  break;
		  case 'A':
		  System.out.println("You have entered the vowel A");
		  break;
		  case('e'):
		  System.out.println("You have entered the vowel e");
		  break;
		  case('E'):
		  System.out.println("You have entered the vowel E");
		  break;
		  case('i'):
		   System.out.println("You have entered the vowel i");
		  break;
		  case('I'):
		  System.out.println("You have entered the vowel I");
		  break;
		  case('o'):
		   System.out.println("You have entered the vowel o");
		  break;
		  case('O'):
		   System.out.println("You have entered the vowel O");
		   break;
		  case('u'):
		   System.out.println("You have entered the vowel u");
		  break;
		  case('U'):
		  System.out.println("You have entered the vowel U");
		   break;
		  case('y'):
		   System.out.println("You have entered the vowel y");
		  break;
		  case('Y'):
		   System.out.println("You have entered the vowel Y");
		   break;
		  default:
		   System.out.println("ERROR MESSAGE " + vowels);
		  }
		  if (vowels == 'a'|| vowels == 'e'|| vowels == 'i'|| vowels == 'o' || vowels == 'u' || vowels == 'y') {
		  	System.out.println("You have entered a lower case letter");
		 }else if (vowels == 'A'|| vowels == 'E'|| vowels == 'I'|| vowels == 'O' || vowels == 'U' || vowels == 'Y') {
		   System.out.println("You have entered an upper case letter");
		 }else {
		  System.out.println("You do not know what a vowel is");
		 }
		 }
		

	}


