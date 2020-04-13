import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class QueueDriver {
    public static void displayQueue(Queue<Integer> queue)  
    {  
        // If queue is empty then return  
        if (queue.isEmpty()) 
            return;  
        int front = queue.peek();   // peek is same as front in java
        // Remove the front element from the queue  
        queue.remove();  // dequeue
        // Recursively call the function displayQueue  
        displayQueue(queue);  
        // Display the queue element starting  
        // from the front 
        System.out.print(front + " ");  
        
    }
    public static void main(String[] args) {
        // Initialize the queue
        System.out.println("Enter the size of the queue:");
        Scanner scan = new Scanner(System.in);
        int queue_size = scan.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < queue_size; i++){
            queue.add(i+1); //enqueue
        }
        displayQueue(queue);   
        System.out.print("\n");
        
    }   
}
