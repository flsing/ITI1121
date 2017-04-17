public class LinkedQueue<E> implements Queue<E> {

    public static class Elem<T> {

        private T value;
        private Elem<T> next;

        private Elem( T value, Elem<T> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Elem<E> front;
    private Elem<E> rear;

    public E peek() {
      // throw exception if queue is empty
         if(isEmpty())
         throw new EmptyQueueException(" Cannot Peek: Queue is empty ");

        return front.value;
    }

    public void enqueue( E o ) throws NullPointerException {
       if ( o == null)
      throw new NullPointerException(" Cannot enqueue null");
      
        Elem<E> newElem;
        newElem = new Elem<E>( o, null );

        if ( rear == null ) {
            front = rear = newElem;
        } else {
            rear.next = newElem;
            rear = newElem;
        }
    }

    public E dequeue() {
       // throw exception if queue is empty
      if(isEmpty())
        throw new EmptyQueueException("Cannot dequeue: Queue is empty");
      
        E result = front.value;
        if ( front != null & front.next == null ) {
            front = rear = null;
        } else {
            front = front.next;
        }
        return result;
    }

    public boolean isEmpty() {
        return front == null;
    }

}