/*
 * The class Employee stores the information of the 
 * employee. Including the name, the amount of hours, 
 * the rate, and the reference to the Address.  
 * 
 */

public class Employee {

  /** 
   * Instance Variables
   */
  /**
   * Reference the the name of the employee
    */
    private String name; 
    
     /**
   * Reference the the amount of hours the employee worked
    */
    private int hours;
    
     /**
   * Reference the the rate of that the employee will be paid
    */
    private double rate; 
    
    /**
     * Reference to the address of the employee
     */
    private Address address;
    
    
    
    /**
     * Constructor used for initializing the Employee. It creates
     * the Employee. 
     * 
     * @param name the name of the employee
     * @param hours the number of hours employee worked
     * @param rate the amount the employee is paid per hour
     * @param address the address of the employee
     */
    public Employee(String name, int hours, double rate, Address address){
      this.name = name;
      this.hours = hours;
      this.rate = rate;
      this.address = address;
      
    }
    
     /**
    * Returns the Employee's name
    * 
    * @return name
    */
    public String getName(){
     return name;
    }
     /**
    * Returns the amount of hours the employee worked
    * 
    * @return hours
    */
    public int getHours(){
     return hours; 
    }
     /**
    * Returns the rate at which the employee is paid
    * 
    * @return rate
    */
    public double getRate(){
     return rate; 
    }
     /**
    * Returns the address
    * 
    * @return address
    */
    public Address getAddress(){
     return address;
    }
    /**
    * Return a string format of the Employee information including
    * name, hours, rate, and the reference to the address. 
    * 
    * @return The entire Employee reference in a string format. 
    */
    public String toString(){
     return "name: " + name + ", hours: "+ hours + ", rate: " + rate + ", address: " + address;
     
    }
    
    

}