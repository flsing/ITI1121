public class Combination{
  
  //Class Variables
  private int first;
  private int second;
  private int third;
  
  //Constructor
  public Combination(int first, int second, int third){
    this.first=first;
    this.second=second;
    this.third=third;
  }
  //Equals Method
  public boolean equals(Combination other){
    return ((other != null) && (other.first == first) && (other.second == second) && (other.third == third));
  }
  //to string method
  public String toString(){
    return first+":"+second+":"+third;
    
  }
}
    
  
    