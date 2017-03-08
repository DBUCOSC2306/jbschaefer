package jsjf;

import jsjf.exceptions.*;

/**
 * LinkedUnorderedList represents a singly linked implementation of an 
 * unordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedUnorderedList<T> extends LinkedList<T> 
         implements UnorderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedUnorderedList()
    {
        super();
    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToFront(T element)
    {
        // To be completed as a Programming Project
        LinearNode<T> newNode = new LinearNode<>(element);
        
        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            head = newNode;
        }
        
        count++;
        modCount++;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToRear(T element)
    {
        // To be completed as a Programming Project
        LinearNode<T> newNode = new LinearNode<>(element);
        
        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }
        
        count++;
        modCount++;
    }
	
	
    /**
     * Adds the specified element to this list after the given target.
     *
     * @param  element the element to be added to this list
	 * @param  target the target element to be added after
	 * @throws ElementNotFoundException if the target is not found
	 */
    public void addAfter(T element, T target)
    {
        // To be completed as a Programming Project
        if(isEmpty())
            throw new ElementNotFoundException("UnorderedList");
        
        LinearNode<T> newNode = new LinearNode<>(element);
        LinearNode<T> current = head;
        while(current != null && !current.getElement().equals(element))
            current = current.getNext();
        
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        
        count++;
        modCount++;
    }	
}
