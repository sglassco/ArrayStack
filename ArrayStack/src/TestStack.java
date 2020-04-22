import java.util.Arrays;
import jsjf.ArrayStack;

/** TestStack is used to test all ArrayStack methods.
 * 
 * @author zombm
 *
 */
public class TestStack {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		  
		System.out.println("STACK TESTING");
		System.out.print("\nIs stack empty? ");
		System.out.println(stack.isEmpty());
		stack.push(3);
		stack.push(7);
		stack.push(4);
		
		//shows 4 at top
		System.out.println(stack.peek());
		
		//removes 4
		stack.pop();
		stack.push(9);
		stack.push(8);
		
		//shows 8 at top
		System.out.println(stack.peek());
		
		//shows 8 being removed from top
		System.out.println(stack.pop());
		
		//shows 9 at top
		System.out.println(stack.peek());
		  
		System.out.print("\nIs stack empty? ");
		System.out.print(stack.isEmpty());
		
		System.out.println("\nThe size of the stack is: " + stack.size());
		System.out.println("The stack contains:\n" + stack.toString());
		}
	}
