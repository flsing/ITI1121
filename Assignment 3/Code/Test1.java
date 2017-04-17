public class Test1 extends LinkedStack {
  
  public static void main(String[] args){
    LinkedStack<String> t;
    t= new LinkedStack<String>();
    LinkedStack<String> r;
    r = new LinkedStack<String>();
    LinkedQueue<Integer> a;
    a= new LinkedQueue<Integer>();
    //@SuppressWarnings("unchecked")
    
    t.push(new String("S"));
    t.push(new String("q"));
    t.push(new String("r"));
    t.push(new String("t"));
    //r.push(null);
    
    System.out.println(t.peek());  
    System.out.println(t.pop());
    System.out.println(t.peek());  
    
    a.enqueue(24);
    System.out.println(a.dequeue());
    System.out.println(a.dequeue());
    
    
   
  }
}