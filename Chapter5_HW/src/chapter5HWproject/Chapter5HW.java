package chapter5HWproject;
import jsjf.CircularArrayQueue;
import jsjf.LinkedQueue;
import jsjf.exceptions.*;
 
/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the CirucularArrayQueue and LinkedQueue classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        
        circularArrayQueueTest();
        System.out.println("");
        linkedQueueTest();
    }
    
    private static void circularArrayQueueTest()
    {
        CircularArrayQueue<String> circularArrayQueue = new CircularArrayQueue<>();
        System.out.println("CircularArrayQueue test...");
        
        //Test enqueue()
        circularArrayQueue.enqueue("Element 1");
        circularArrayQueue.enqueue("Element 2");
        circularArrayQueue.enqueue("Element 3");
        
        //Test first()
        System.out.println("First: " + circularArrayQueue.first());
        
        //Test isEmpty() and toString()
        System.out.println("Is empty? " + circularArrayQueue.isEmpty());
        System.out.println("toString(): " + circularArrayQueue.toString());
        
        //Test dequeue()
        System.out.println("Dequeue: " + circularArrayQueue.dequeue());
        System.out.println("Dequeue: " + circularArrayQueue.dequeue());
        System.out.println("Dequeue: " + circularArrayQueue.dequeue());
        
        //Attempt to dequeue while empty and then handle the exception
        try {
            circularArrayQueue.dequeue();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the queue is actually empty
        System.out.println("Is empty? " + circularArrayQueue.isEmpty());
    }
    
    private static void linkedQueueTest()
    {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        System.out.println("LinkedQueue test...");
        
        //Test enqueue()
        linkedQueue.enqueue("Element 1");
        linkedQueue.enqueue("Element 2");
        linkedQueue.enqueue("Element 3");
        
        //Test first()
        System.out.println("First: " + linkedQueue.first());
        
        //Test isEmpty() and toString()
        System.out.println("Is empty? " + linkedQueue.isEmpty());
        System.out.println("toString(): " + linkedQueue.toString());
        
        //Test dequeue()
        System.out.println("Dequeue: " + linkedQueue.dequeue());
        System.out.println("Dequeue: " + linkedQueue.dequeue());
        System.out.println("Dequeue: " + linkedQueue.dequeue());
        
        //Attempt to dequeue while empty and then handle the exception
        try { 
            linkedQueue.dequeue();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.toString());
        }
        
        //Check that the queue is actually empty
        System.out.println("Is empty? " + linkedQueue.isEmpty());
    }
}

































