/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;
 
import jsjf.ArrayStack;
import jsjf.LinkedStack;
import jsjf.exceptions.*;

/**
 *
 * @author jackjt
 */
public class Exam1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// TODO EXAM 1 - TAKEHOME
	// 1. Complete the ArrayStack and LinkedStack classes (all 6 methods)
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        
        arrayStackTest();
        linkedStackTest();
    }
    
    private static void arrayStackTest()
    {
        ArrayStack<String> arrayStack = new ArrayStack<>();
        System.out.println("ArrayStack test...");
        
        //Test push().
        arrayStack.push("Element 1");
        arrayStack.push("Element 2");
        arrayStack.push("Element 3");
        
        //Test pop() and peek().
        System.out.println("Pop: " + arrayStack.pop());
        System.out.println("Peek: " + arrayStack.peek());
        
        //Test isEmpty() and toString().
        System.out.println("Is empty? " + arrayStack.isEmpty());
        System.out.println("toString(): " + arrayStack.toString());
        
        //Pop everything out of the stack.
        arrayStack.pop();
        arrayStack.pop();
        
        //Attempt to pop while the stack is empty and
        //then handle the exception.
        try {
            arrayStack.pop();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the stack is actually empty.
        System.out.println("Is empty? " + arrayStack.isEmpty());
    }
    
    private static void linkedStackTest()
    {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        System.out.println("\nLinkedStack test...");
        
        //Test push().
        linkedStack.push("Element 1");
        linkedStack.push("Element 2");
        linkedStack.push("Element 3");
        
        //Test pop() and peek().
        System.out.println("Pop: " + linkedStack.pop());
        System.out.println("Peek: " + linkedStack.peek());
        
        //Test isEmpty() and toString().
        System.out.println("Is empty? " + linkedStack.isEmpty());
        System.out.println("toString(): " + linkedStack.toString());
        
        //Pop everything out of the stack.
        linkedStack.pop();
        linkedStack.pop();
        
        //Attempt to pop while the stack is empty and
        //then handle the exception.
        try {
            linkedStack.pop();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the stack is actually empty.
        System.out.println("Is empty? " + linkedStack.isEmpty());
    }
}
