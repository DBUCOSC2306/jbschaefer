package chapter6HWproject;
import jsjf.ArrayOrderedList;
import jsjf.ArrayUnorderedList;
import jsjf.LinkedOrderedList;
import jsjf.LinkedUnorderedList;
import jsjf.exceptions.*;

/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the incomplete classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        
        arrayOrderedListTest();
        System.out.println("");
        
        arrayUnorderedListTest();
        System.out.println("");
        
        linkedOrderedListTest();
        System.out.println("");
        
        linkedUnorderedListTest();
    }
    
    private static void arrayOrderedListTest()
    {
        ArrayOrderedList<String> arrayOrderedList = new ArrayOrderedList<>();
        System.out.println("ArrayOrderedList test...");
        
        //Test add()
        arrayOrderedList.add("Element 1");
        arrayOrderedList.add("Element 2");
        arrayOrderedList.add("Element 3");
        
        //Test first() and last()
        System.out.println("First: " + arrayOrderedList.first());
        System.out.println("Last: " + arrayOrderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is Empty? " + arrayOrderedList.isEmpty());
        System.out.println("toString(): " + arrayOrderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + arrayOrderedList.removeFirst());
        System.out.println("removeLast(): " + arrayOrderedList.removeLast());
        System.out.println("remove(): " + arrayOrderedList.remove("Element 2"));
                
        //Attempt to remove while empty and handle the exception
        try {
            arrayOrderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is Empty? " + arrayOrderedList.isEmpty());
    }
    
    private static void arrayUnorderedListTest()
    {
        ArrayUnorderedList<String> arrayUnorderedList = new ArrayUnorderedList<>();
        System.out.println("ArrayUnorderedList test...");
        
        //Test addToFront(), addToRear(), and addAfter()
        arrayUnorderedList.addToFront("Element 1");
        arrayUnorderedList.addToRear("Element 3");
        arrayUnorderedList.addAfter("Element 2", "Element 1");
        
        //Test first() and last()
        System.out.println("First: " + arrayUnorderedList.first());
        System.out.println("Last: " + arrayUnorderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is Empty? " + arrayUnorderedList.isEmpty());
        System.out.println("toString(): " + arrayUnorderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + arrayUnorderedList.removeFirst());
        System.out.println("removeLast(): " + arrayUnorderedList.removeLast());
        System.out.println("remove(): " + arrayUnorderedList.remove("Element 2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            arrayUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is Empty? " + arrayUnorderedList.isEmpty());
    }
    
    private static void linkedOrderedListTest()
    {
        LinkedOrderedList<String> linkedOrderedList = new LinkedOrderedList<>();
        System.out.println("LinkedOrderedList test...");
        
        //Test add()
        linkedOrderedList.add("Element 1");
        linkedOrderedList.add("Element 2");
        linkedOrderedList.add("Element 3");
        
        //Test first() and last()
        System.out.println("first(): " + linkedOrderedList.first());
        System.out.println("last(): " + linkedOrderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is Empty? " + linkedOrderedList.isEmpty());
        System.out.println("toString(): " + linkedOrderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + linkedOrderedList.removeFirst());
        System.out.println("removeLast(): " + linkedOrderedList.removeLast());
        System.out.println("remove(): " + linkedOrderedList.remove("Element 2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            linkedOrderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is Empty? " + linkedOrderedList.isEmpty());
    }
    
    private static void linkedUnorderedListTest()
    {
        LinkedUnorderedList<String> linkedUnorderedList = new LinkedUnorderedList<>();
        System.out.println("LinkedUnorderedList test...");
        
        //Test add()
        linkedUnorderedList.addToFront("Element 1");
        linkedUnorderedList.addToRear("Element 3");
        linkedUnorderedList.addAfter("Element 2", "Element 1");
        
        //Test first() and last()
        System.out.println("first(): " + linkedUnorderedList.first());
        System.out.println("last(): " + linkedUnorderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is Empty? " + linkedUnorderedList.isEmpty());
        System.out.println("toString(): " + linkedUnorderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + linkedUnorderedList.removeFirst());
        System.out.println("removeLast(): " + linkedUnorderedList.removeLast());
        System.out.println("remove(): " + linkedUnorderedList.remove("Element 2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            linkedUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is Empty? " + linkedUnorderedList.isEmpty());
    }
}