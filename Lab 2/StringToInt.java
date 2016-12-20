public class StringToInt{
  public static void main(String[] args){
    
    String s1 = "9";
    String s2 = "4"; 
  
    System.out.println("String Summation= " + s1+s2);
    System.out.println("Double Summation= " + (Double.parseDouble(s1)+Double.parseDouble(s2)));
    System.out.println("Integer Summation= " + (Integer.parseInt(s1)+Integer.parseInt(s2)));
  }
}