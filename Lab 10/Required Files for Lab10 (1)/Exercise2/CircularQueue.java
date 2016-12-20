/* Introduction a l'informatique II (ITI 1521)
 * Introduction to Computing II (ITI 1121)
 */

/**
 * Array-based implementation of a <code>Queue</code>.
 *
 * @author Marcel Turcotte
 */

import java.util.NoSuchElementException;

public class CircularQueue<E> implements Queue<E> {
  
  private static final int DEFAULT_CAPACITY = 100;
  private int front, rear, size;
  private E[] elems;
  
  @SuppressWarnings("unchecked")
  public CircularQueue( int capacity ) {
    elems = (E[]) new Object[ capacity ];
    front = 0;
    rear = -1;
    size = 0;
  }
  
  private class QueueIterator implements Iterator<E> {
    
    private int current = -1;
    
    public E next() {
      
      if (!hasNext() ) {
        throw new NoSuchElementException(); //should do a try catch 
      }
        
      if (current == -1) {
        current = front;
      } else {
        current = (current + 1) % elems.length;
      }
      return elems[current];
    }
    
    
    public boolean hasNext() {
      boolean result;
      result = (size!=0) && (current ==-1 || current!=rear);
      return result;
    }
  }// end of QueueIterator
  
  
  public  Iterator<E> iterator() {
    return new QueueIterator();
  }
  
  public boolean isEmpty() {
    return ( size == 0 );
  }
  
  
  public void enqueue( E value ) {
    rear = ( rear+1 ) % elems.length;
    elems[ rear ] = value;
    size++;
  }
  
  
  public E dequeue() {
    if ( isEmpty() ) {
      throw new EmptyQueueException();
    }
    E savedValue = elems[ front ];
    elems[ front ] = null; // ``scrubbing''
    size--;
    front =  ( front+1 ) % elems.length;
    return savedValue;
  }
  
  public String toString() {
    
    StringBuffer str = new StringBuffer( "[" );
    
    if ( size > 0 ) {
      
      int offset = 0;
      
      str.append( elems[ front ] );
      offset = offset + 1;
      
      while ( offset < size ) {
        
        str.append( ", " );
        str.append( elems[ ( front + offset ) % elems.length ] );
        offset = offset + 1;
        
      }
      
    }
    
    str.append( "]" );
    
    return str.toString();
    
  }
  
}
