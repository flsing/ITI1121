/**
 * <h1>Equality Check</h1>
 * This class shows the difference between the equals operator and the equals() method
 * by using two String objects.
 * 
 * @author:Berk Soysal
 * @version:1.0
 * @since:2016-02-02
 * 
 */ 
 public class Equality{
   
   
   /**
    *This method is the main method(static void) which prints the results of the 
    * equality comparison operations.
    * 
    * @param args is a String array(not used).
    */
  public static void main(String[] args){

    String s1 = new String("xyz");
    String s2 = new String("xyz");
 
  //Operator
    if(s1 == s2)
      System.out.println("s1==s2 is TRUE");
    else
      System.out.println("s1==s2 is FALSE");
    
 // Equals Method
    if(s1.equals(s2))
      System.out.println("s1 equals s2 is TRUE");
    else
      System.out.println("s1 equals s2 is FALSE");
     
  }
}