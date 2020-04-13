import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class StackDriver {
    static void displayStack(Stack<Integer> stack)  
    {  
        if (stack.isEmpty()) 
            return;  
        int top = stack.peek();  
        stack.pop();  
        // Recursively call the function displayStack  
        displayStack(stack);  
        // Display the stack element starting  
        // from the bottom  
        System.out.print(top + " ");  
        // Repush the top element back to the Stack to 
        // maintain the order
        stack.push(top);  
    }  

    public static void main(String[] args) {
        // Initialize the stack
        System.out.println("Enter the size of the stack:");
        Scanner scan = new Scanner(System.in);
        int stack_size = scan.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < stack_size; i++){
            stack.push(i+1);
        }
        displayStack(stack);   
        System.out.print("\n");
        
    }   
}
