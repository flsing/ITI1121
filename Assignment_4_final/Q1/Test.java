/*
 * Test class in order to see if Address and Employee match the memory diagram provided. 
 * 
 */ 

public class Test{
  
  public static void main(String[] args){
  
  

  /*
   * Creating new address array, to store at position 0 and 
   * position 1 the values seen in the memory diagram. 
   * 
   */
  Address[] address = new Address[6];
  address[0] = new Address("Queen", 48, "K1P1N2");
  address[1] = new Address("King Edward", 800, "K1N6N5");
  
  /*
   * Creating Employee object which has its own values, and references the address array
   */
  Employee o1;
  
  /*
   * assigning o1 to reference object 0 in the array. 
   */
  o1 = new Employee("Falcao", 40, 15.50, address[0]); 
  
  

  //tests
  System.out.println(o1);
  System.out.println(address[0]);
  System.out.println(address[1]);
  
  //Call to StudentInfo
  StudentInfo.display();
  
  
  }
}