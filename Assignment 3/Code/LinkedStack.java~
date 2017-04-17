
public class LinkedStack<E>  implements Stack<E>{

    private static class Elem<T>{
        private T info;
        private Elem<T> next;
        private Elem( T info, Elem<T> next) {
            this.info = info;
            this.next = next;
        }
    }

    private Elem<E> top; // instance variable

    public LinkedStack() {
      
        top = null;    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push( E info ) throws NullPointerException {
      //throw Exception if null is pushed. 
      
      if (info==null)
        throw new NullPointerException("Cannot push null value.");
        
        top = new Elem<E>( info, top );
    }

    public E peek() {
      // throw exception if Stack is Empty
      if (isEmpty())
        throw new EmptyStackException("Cannot peek, Stack is empty.");
      //return if it is not empty
      return top.info;
    }

    public E pop() {
      //thor exception if Stack is Empty. 
      if (isEmpty())
        throw new EmptyStackException("Cannot pop, Stack is empty.");

        //return and pop if not empty. 
        E savedInfo = top.info;

        Elem<E> oldTop = top;
        Elem<E> newTop = top.next;

        top = newTop;

        oldTop.info = null; // scrubbing the memory
        oldTop.next = null; // scrubbing the memory

        return savedInfo;
    }
}
