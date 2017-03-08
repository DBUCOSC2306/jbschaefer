package jsjf;

import jsjf.exceptions.*;

/**
 * LinkedOrderedList represents a singly linked implementation of an 
 * ordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedOrderedList<T> extends LinkedList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        // To be completed as a Programming Project
        if(!(element instanceof Comparable))
            throw new NonComparableElementException("OrderedList");
        
        Comparable<T> comparableElement = (Comparable<T>)element;
        LinearNode<T> newNode = new LinearNode<>(element);
        
        //List is empty
        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        
        //New element is first
        else if(comparableElement.compareTo(head.getElement()) <= 0)
        {
            newNode.setNext(head);
            head = newNode;
        }
        
        //New element is last
        else if(comparableElement.compareTo(tail.getElement()) >= 0)
        {
            tail.setNext(newNode);
            tail = newNode;
        }
        
        //New element goes in the middle
        else
        {
            LinearNode<T> current = head;
            LinearNode<T> previous = null;
            
            while(comparableElement.compareTo(current.getElement()) > 0)
            {
                previous = current;
                current = current.getNext();
            }
            
            newNode.setNext(current);
            previous.setNext(newNode);
        }
        
        count++;
        modCount++;
    }
}
