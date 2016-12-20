public class AnimalMain{
  
  public static void main(String[] args){
    
    //Let us create our objects
    
    Animals dog = new Animals("Toby","Beagle");
    Animals cat = new Animals("Shadow","Persian");
    
    //now we can access the methods of Animal class by using our objects.
    
    dog.setAge(5);
    cat.setAge(1);
    
     int i =1042790;
     short s = (short) i;
     System.out.println(s);
     
    System.out.println("My Dog's Name: " + dog.getName() + " , Age: " + dog.getAge() + " , Type: " + dog.getType());
    System.out.println("My Cat's Name: " + cat.getName() + " , Age: " + cat.getAge() + " , Type: " + cat.getType());
  }
  
}