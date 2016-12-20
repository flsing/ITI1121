/**
 * @author: ITI1121A 
*/


import java.util.NoSuchElementException;

public class LinkedList<E> {
  
  //  ----------------------------------------------------------
  //  Implementing the doubly linked nodes (static nested class)
  //  ----------------------------------------------------------
  
  private static class Node<E> {
    
    private E value;
    
    private Node<E> previous;
    private Node<E> next;
    
    private Node( E value, Node<E> previous, Node<E> next ) {
      this.value = value;
      this.previous = previous;
      this.next = next;
    }
  }
  
  // Instance variables
  
  private Node<E> head;
  private int size;
  
  /** Creates a new linked list.
    */
  
  public LinkedList() {
    
    // Representation of the empty list using a dummy node
    head = new Node<E>( null, null, null );
    head.next = head.previous = head;
    size = 0;
  }
  
  //  ----------------------------------------------------------
  //  LinkedList methods
  //  ----------------------------------------------------------
  
  /** 
   * Returns the number of elements currently stored in this OrderedStructure.
   *
   * @return the number of elements of this strucutre.
   */
  
  public int size() {
    return size;
  }
  
  /**
   * Returns true if this collection contains no elements.
   *
   * @return true if this collection contains no elements
   */
  
  public boolean isEmpty() {
    return size == 0;
  }
  
  /** 
   * Adds an element at the end of the list.
   *
   * @return true since duplicated values are allowed.
   * @throws IllegalArgumentException if obj is null.
   */
  
  public boolean addLast( E obj ) {
    
    if ( obj == null ) {
      throw new IllegalArgumentException( "null" );
    }
    
    Node<E> before = head.previous;
    Node<E> after = head;
    
    before.next = new Node<E>( obj, before, after );
    after.previous = before.next;
    
    size++;
    
    return true;
  }
  
  /** 
   * Adds an element at the start of the list.
   *
   * @return true since duplicated values are allowed.
   * @throws IllegalArgumentException if obj is null.
   */
  
  public boolean addFirst( E obj ) {
    
    if ( obj == null ) {
      throw new IllegalArgumentException( "null" );
    }
    
    Node<E> before = head;
    Node<E> after = head.next;
    
    before.next = new Node<E>( obj, before, after );
    after.previous = before.next;
    
    size++;
    
    return true;
  }
  
  /** 
   * Returns the element at the specified position; the first
   * element has the index 0.
   *
   * @return the element at the specified position.
   * @throws IndexOutOfBoundsException if pos is out of range (pos < 0 || pos >= size()). 
   */
  
  public E get( int pos ) {
    
    if ( pos < 0 || pos > (size-1) ) {
      throw new IndexOutOfBoundsException( Integer.toString( pos ) );
    }
    
    Node<E> p = head.next;
    
    for ( int i=0; i<pos; i++ ) {
      p = p.next;
    }
    
    return p.value;
  }
  
  public LinkedList<E> remove( int from, int to ) {
    
    LinkedList<E> result = new LinkedList<E>();
    
    if(from < 0 || from > size-1 )
      throw new IllegalArgumentException("Invalid Starting Index:" +from);
    if(to < 0 || to > size-1 || to < from)
      throw new IllegalArgumentException("Invalid Finishing Index:" +to);
    
    Node<E> p = head.next;
    int index=0;
    
    while(index<from){
      
      p=p.next;
      index++;
    }
    
    while (index <= to){
      //add current element to result list
      
      if(result.head.next == result.head){
        result.head.next = result.head.previous = new Node<E> (p.value, result.head.previous, result.head);
      }
      else{
        result.head.previous = result.head.previous.next = new Node<E> (p.value, result.head.previous, result.head);
      }
      
      result.size++;
      
      //delete this element from the current list
      
      p.previous.next = p.next;
      p.next.previous = p.previous;
      
      size--;
      
      p=p.next;
      index++;
    }
    
      
    return true;
    
    
    
    
    
    
    
    
    
    
    
    
    
  } // End of remove
  
  //  ----------------------------------------------------------
  //  Other instance methods
  //  ----------------------------------------------------------
  
  public String toString() {
    StringBuffer answer = new StringBuffer( "[" );
    Node<E> p = head.next;
    while ( p != head ) {
      if ( p != head.next ) {
        answer.append( "," );
      }
      answer.append( p.value );
      p = p.next;
    }
    answer.append( "]" );
    return answer.toString();
  }
  
}
