public class ArrayStack <E> implements Stack<E> {
  
  private E[] elems;
  private int top;
  
  @SuppressWarnings("unchecked")
  
  public ArrayStack(int capacity){
    
    elems = (E[]) new Object[capacity];
    top = 0;
  }
  
  public boolean isEmpty(){
    return (top == 0 );
  }
  
  public E peek(){
    return elems[top-1];
  }
  
  public E pop(){
    E saved = elems[--top];
    elems[top] = null;
    return saved;
      
  }
  
  public void push(E element){
    elems[top++] = element;
  }
  
  public void clear(){
    for (int i=0; i<top; i++){
      elems[i]=null;
      
      top=0;
    }
   
    
}
  public String toString(){
    return ("the stack is" + elems);
  }
}
    

  
                
            