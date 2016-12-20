/*
 * The class ListUtil which has a method to find and return 
 * the indox of all the objects in a LinkedList. 
 * 
 */

public class ListUtil {
  
  public ListUtil(){
  }
  
  /**
   * Method indexOfAll iteratively searches a LinkedList for an object and returns the indices 
   * of that object. 
   * 
   * @param list A linked list that will be passed through the method
   * @param obj The obj the method will search for in the linked list
   * 
   * @return Returns a new linked list with the indices of the the object being searched. 
   */
  public static <E > LinkedList <Integer > indexOfAll(LinkedList <E > list, E obj){
    
    //creating new LinkedList to store the indices
    LinkedList<Integer> index = new LinkedList<Integer>();
      
    //creating the iterator that will iterate through the LinkedList. 
    Iterator<E> it = list.iterator();
    
    
    int i =-1;
    
    //while the iteration of the List is not null, if the object is in the list, add the 
    //index to the new LinkedList. 
       while (it.hasNext()) {
         i++;
         if(it.next()==obj)
          
           index.addLast(i);
   
       }
       
    return index;

  }
}