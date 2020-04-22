import java.util.Scanner;
import jsjf.ArrayStack;
import java.util.Arrays;
/**
 * Application class for ArrayStack
 * @author zombm
 *
 */
public class Application {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean playing = true;
		
//while loop for as long as the user decides to type sentences
		while(playing) {
			System.out.println("Please Type A Sentence: ");
			String s = scan.nextLine();
			//utilizes reverseString method
			s = reverseString(s);
			System.out.println("The reversed string is: "+ s);
			
			//nested while loop to see if user wants to quit or continue
			boolean retry = true;
			while(retry) {
				System.out.println("Would you like to try again? (Y/N) ");
				String b = scan.nextLine();
				if(b.equalsIgnoreCase("y")) {
					playing = true;
					retry = false;
				} else if(b.equalsIgnoreCase("n")) {
					System.out.println("Goodbye!");
					playing = false;
					retry = false;
				} else {
					System.out.println("Incorrect Input");
					retry = true;
		}
			}
		}
	}

		    public static String reverseString(String s) {
		    	//base if string is empty
		        if(s == null || s.equals(""))
		            return s;

		        ArrayStack<Character> stack = new ArrayStack<Character>();

		        for(int i=0; i< s.length(); i++)
		            stack.push(s.charAt(i));

		        StringBuilder sb = new StringBuilder();
		        while(!stack.isEmpty())
		            sb.append(stack.pop());

		        return sb.toString();
		    }
		}