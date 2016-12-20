/*
 * The class Address stores the information of the 
 * employees address. Including the street, the number
 * and the postal code. 
 * 
 */

public class Address {

  
  /*
   * Instance Variables
   */
  
  /**
   * Reference the street name
   */
    private String street;
    
    /**
   * Reference the street number
   */
    private int number;
    
    /**
   * Reference the postal code
   */
    private String postal;

    /**
     * Constructor used for initializing the adderss. It creates
     * the address. 
     * 
     * @param street the street name
     * @param number the number of the street address
     * @param postal the postal code
     */
    public Address(String street, int number, String postal){
     this.street= street; 
     this.number = number;
     this.postal = postal; 
    }
    
   /**
    * Returns the street name
    * 
    * @return street
    */
    public String getStreet(){
     return street;
    }
    
     /**
    * Returns the number of the address
    * 
    * @return number
    */
   public int getNumber(){
    return number;
   }
   
    /**
    * Returns the postal code
    * 
    * @return postal
    */
   public String getPostal(){
    return postal;
   }
   
     /**
    * Return a string format of the address including
    * street, number, and postal code. 
    * 
    * @return The entire address in a string format. 
    */
    public String toString(){
     return "Street: "+ street + ", number: " + number + ", postal: "+ postal;
    }
    
    
}