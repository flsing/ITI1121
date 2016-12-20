public class TimeConversion{
  public static void main(String[] args){
   
    int day, hour,minute,sec=100000;
   
    //Minute Calculation
    minute=sec/60;
    sec=sec %60;
    
    //Hour Calculation
    hour=minute/60;
    minute=minute%60;
    
    //Day Calculation
    day=hour/24;
    hour=hour %24;
    
    System.out.println(day+ " Day " + hour+ " Hours "+minute+" Minutes " + sec + " Seconds ");
  }
}