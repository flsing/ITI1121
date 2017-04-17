/**
 * The class <b>EmptyQueueException</b> creats an Exception if the Queue is empty. 
 * 
 * 
 */

public class EmptyQueueException extends RuntimeException {
  
  public EmptyQueueException(){
    
  }
  
  public EmptyQueueException(String s){
    super(s);
  }
  
  
  public EmptyQueueException(String s, Throwable throwable){
    super(s, throwable);
  }
  
  
  public EmptyQueueException(Throwable throwable){
    super(throwable);
  }
  
  
  
  
}
