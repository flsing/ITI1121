/**
 * @author: Berk ITI1121A
*/

public class Main {
  public static void main(String[] args){
    
    LinkedList<String> myList = new LinkedList<String>();
    
    myList.addFirst("John");
    myList.addFirst("Kim");
    myList.addFirst("Marie");
    myList.addFirst("Jack");
    myList.addFirst("Brook");
    myList.addFirst("Ellie");
    
    System.out.println(myList);
    
    System.out.println(myList.remove(2,4).toString());
    
  }
}
    