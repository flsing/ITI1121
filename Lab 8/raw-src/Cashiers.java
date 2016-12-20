public class Cashiers{
  
  private static final String nl = System.getProperty("line.seperator");
  
  private Cashier[] cashiers;
  
  public Cashiers(int nb){
    
    if(nb<1){
      throw new IllegalArgumentException(Integer.toString(nb));
      
    }
    
    cashiers = new Cashier[nb];
    
    for(int i=0; i<nb; i++){
      cashiers[i] = new Cashier();
    }
  }
  
  public void addCustomer(Customer c){
    int iMin=0;
    
    for(int i=1; i<cashiers.length; i++){
      if(cashiers[i].getQueueSize() < cashiers[iMin].getQueueSize()){
        iMin=i;
      }
    }
    
    cashiers[iMin].addCustomer(c);
  }
  
  public void serveCustomers(int currentTime){
    
    for(int i =0; i<cashiers.length; i++){
      cashiers[i].serveCustomers(currentTime);
    }
  }
  
  public String toString(){
    
    StringBuffer out= new StringBuffer();
    
    for (int i=0; i < cashiers.length; i++){
      out.append("Line"+i+"::"+nl);
      out.append(cashiers[i]);
      out.append(nl);
    }
    return out.toString();
  }
}

    
    
    
    
    
    
    