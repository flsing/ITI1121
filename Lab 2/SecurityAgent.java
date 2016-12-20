import java.util.Random;

public class SecurityAgent{
  
  //instance variable
  private Combination secret;
  private DoorLock mylock;
  
  
  //constructor
  public SecurityAgent(){
    
    Random generator = new Random();
    
    int first = generator.nextInt(9)+1;
    int second = generator.nextInt(9)+1;
    int third = generator.nextInt(9)+1;
    
    secret = new Combination(first, second, third);
    mylock= new DoorLock(secret);
    }
  
  //instance methods
  public DoorLock getDoorLock(){
    return mylock;
    }
  
  public void activateDoorLock(){
    mylock.activate(secret);
  }
}