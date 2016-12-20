
public class LinkedList<E> {
  
    private static class Node<T> {
    
        private T value;
    
        private Node<T> previous;
        private Node<T> next;
    
        private Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
  
    private Node<E> head;
    private int size;
 
  
    public LinkedList() {
        head = new Node<E>(null, null, null);
        head.next = head.previous = head;
        size = 0;
    }
  
    /** Returns the size of this list.
     *
     * @return the size of this list
     */
  
    public int size() {
        return size;
    }
  
    /** 
     * Adds an element at the end of the list. THIS IS A SAMPLE
     * METHOD THAT CANNOT BE USED BY InserAfter !
     *
     * @param element the element to be added.
     * @return true since duplicated values are allowed.
     * @throws NullPointerException if elem is null.
     */
  
    public boolean addLast(E element) {
    
        if (element == null) {
            throw new NullPointerException();
        }
    
        Node<E> before, after;

        before = head.previous;
        after = head;
    
        before.next = new Node<E>(element, before, after);
        after.previous = before.next;
    
        size++;
    
        return true;
    }
    
    /**
     * Method to insert an LinkedList inside another LinkedList after the first
     * occurence of an object. The other LinkedList is then empty.  
     * 
     * @param obj First occurence of Object in which the other LinkedList is inserted after
     * @param other LinkedList in which its elements are inserted into another LinkedList
     */

 public void insertAfter(E obj, LinkedList<E> other){
      
   Node<E> p = head.next;
   Node<E> q = p.next;
   
   //the first element in other
   Node<E> otherFirst = other.head.next;
   
   //the last element in other
   Node<E> otherLast= other.head.previous;
   
   
   //Pre condition if obj is null or the other list is empty        
   if(obj == null || other == null){
     throw new NullPointerException("Please insert a valid object");
   }
   
   //iterate through to find the object and throws exception if object cannot be found
   while(p!=head && (!obj.equals(p.value))){
     p=p.next;
   }
   if(p==head){
     throw new IllegalArgumentException("That object cannot be found");
   }
   
   if(otherFirst!=otherLast){
     
     p.next = otherFirst;
     otherFirst.previous=p;
     
     otherLast.next=q;
     q.previous= otherLast;
     
     size=size+other.size;
     
     //remove the elements from other
     other.size=0;
     
   }
               
      
      
    }
    
    /**
     * toString method to print out the strings
     * 
     * @return the printable String of the object
     */ 
    //converts the list to string
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