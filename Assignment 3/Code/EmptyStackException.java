/**
 * The class <b>EmptyStackException</b> creats an Exception if the Stack is empty. 
 * 
 * 
 */

public class EmptyStackException extends RuntimeException {
  
  public EmptyStackException(){
    
  }
  
  public EmptyStackException(String s){
    super(s);
  }

    
  public EmptyStackException(String s, Throwable throwable){
    super(s, throwable);
  }
  
  
  public EmptyStackException(Throwable throwable){
    super(throwable);
  }
  
  
}
