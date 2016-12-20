public class Animals{
  
  //Class variables  make sure to make it always private
  private String name="Unknown";
  private int age=0;
  private String type="Unknown";
  
  //Constructor Method  if the name of "name" was "name2" we wouldnt need the "this."
  public Animals(String name,String type){
    this.name =name;
    this.type=type;
  }
  
  //Methods
  //setAge Method
  public void setAge(int age){
    this.age=age;
  }
  
  //getAge Method
  public int getAge(){
    return age;
  }
    //getName Method
  public String getName(){
    return name;
  }
      //getName Method
  public String getType(){
    return type;
  }
  
}