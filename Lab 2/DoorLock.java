public class DoorLock{
  
  //Constant
  public static final int MAX_NUMBER_OF_ATTEMPTS = 3;
  
  //instance variable
  private Combination combination;
  private boolean open; 
  private boolean activated;
  private int numberOfAttempts;
      
  //constructor
  public DoorLock(Combination combination){
    this.combination = combination;
    open=false;
    activated=true;
    numberOfAttempts = 0;
  }
  
  //instance methods
  
  public boolean isOpen(){
    return open;
  }
  public boolean isActivated(){
    return activated;
  }
  public void activate(Combination combination){
    if(this.combination.equals(combination)){
        activated=true; 
  }
  }
  public boolean open(Combination combination ){
    if(activated){
      if(this.combination.equals(combination)){
        open=true;
        numberOfAttempts=0;
      }
    }
    
      else{
        numberOfAttempts++;
        if(numberOfAttempts >=MAX_NUMBER_OF_ATTEMPTS){
          activated=false;
          numberOfAttempts=0;
        }
      }
      return activated && open;
  }
  
  }
