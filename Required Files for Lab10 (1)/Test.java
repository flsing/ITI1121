import java.util.ListIterator;
import java.util.LinkedList;

public class Test {
  public static void main(String[] args){
    
    LinkedList<String> a,b;
    
    a=new LinkedList<String>();
    b=new LinkedList<String>();
    
    a.add("alpha");
    a.add("bravo");
    a.add("tango");
    a.add("charlie");
    
    ListIterator<String> i, j;
    
    i=a.listIterator();
    j=b.listIterator();
    
    while(i.hasNext()){
      j.add(i.next());
    }
    System.out.println(a);
    System.out.println(b);
  }
}