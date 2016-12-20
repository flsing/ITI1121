public class Conversion{
  public static void main(String[] args){
    int i = 100000; // Adjust this value and observe the output
    Short s;
    
    if (i < Short.MAX_VALUE)
      s = (short) i;
    else
      System.out.println("Data Loss");
    
  }
}

