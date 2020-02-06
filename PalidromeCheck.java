import java.util.Scanner;

public class PalidromeCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double randomNum > 0;
		int n = in.nextInt();
		int sum = 0, r;
		int temp = n; 
		
		System.out.println("Enter 0 if you would like to input a four digit number, otherwise enter 1 to randomly generate a four digit number.");
		
	if (userInput == 0)
		System.out.println("Enter your four digit number");
	else if(userInput == 1)
		double randomNum = (Math.random() * 10000);
		System.out.println("Your generated number is " + randomNum); {    
       
			r = n % 10;   
			sum = (sum*10)+r;    
			n = n/10;    
		}    
      if(temp==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
	}
}
