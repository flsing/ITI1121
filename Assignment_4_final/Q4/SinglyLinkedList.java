/* ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 *
 * Marcel Turcotte
 */

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
 
    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node(T value, Node<T> next) {
            this.value = value;
            this.next  = next;
        }
    }

    // Instance variable

    private Node<E> head;
    
    // Node p to traverse through the original SinglyLinkedList<E> n times
    private Node<E> p;
    
    // int size to keep track of the size of the original SinglyLinkedList
    private int size;

    /*Constructor for SinglyLinkedList 
     * initializes size to zero
     * */
    public SinglyLinkedList (){
    size =0;
    }

    //  ----------------------------------------------------------
    //  SinglyLinkedList methods
    //  ----------------------------------------------------------

    public void addFirst( E item ) {
        if (item == null) {
            throw new NullPointerException("Illegal argument");
        }

        head = new Node<E>(item, head);

        // Incremnets size everytime an element is added to the original SinglyLinkedList
        size++;
    }

    public boolean isEmpty() { 
        return head == null; 
    }

    /* @param int n : first n elements of the list  
     * @param SinglyLinkedList<E> b: new list to insert the first n elements
     * calls take method and passes parameters; p,n,b*/
    
    public SinglyLinkedList<E> take(int n) {
      
      // throws UnsupportedOperationException exception if n is less than 0
      if(n<0)
 throw new UnsupportedOperationException( "Try a larger value" );
      
      //  throws UnsupportedOperationException exception if the list is empty
      if ( head==null )
         throw new UnsupportedOperationException( "list is empty" );
      
      // throws UnsupportedOperationException exception if n is larger than the
      //size of the original SinglyLinkedLisr
      if ( n>getSize() )
         throw new NoSuchElementException( "Try a smaller value" );
      
      //points traversing p to the first node of the list
      p = head;
      
      //creates a new SinglyLinkedList b to store the first n elements
      SinglyLinkedList<E> b = new SinglyLinkedList<E>();
      
      //calls private take method with parameters; p,n,b
      return take(p, n,b);
    }
    
      /*private method take recursively adds the first n elements to new list b
       * @param p: traverses through the original SinglyLinkedList n times
       * @param n: method take gets recursively called n times
       * @param b:  stores the first n elements*/
    
    private SinglyLinkedList<E> take (Node<E> p, int n,SinglyLinkedList<E> b){
      
      // base case: if list is empty return empty list b
     if (p == null)
       return b;
     
     //when n = 0, return b
     //either the original value for n is 0
     // or n gets decremented to 0
     if(n==0)
       return b;
     
     //when p.next is pointing to another node
     if(p.next != null ){
     b.addFirst(p.value); // adds value of node p to new list b
     take(p.next,n-1,b); // calls private take: p.next node, n-1 & new list b
     }
     
     // returns b to public method take
     return b;
   }

    // returns the size of the original SinglyLinkedList<E>
    public int getSize(){
    return size;
    }
    //  ----------------------------------------------------------
    //  Other instance methods
    //  ----------------------------------------------------------

    @Override
    public String toString() {
        return "{" + toString(head) + "}";
    }

    private String toString(Node<E> p) {

        String result = "";

        if (p != null) {
            result = p.value.toString();
            if (p.next != null) {
                result = result + "," + toString(p.next);
            }
        }

        return result;
    }
}