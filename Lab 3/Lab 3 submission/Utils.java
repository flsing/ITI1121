/* 
 * This is a utility class. For now it contains a single method. 
 * The name of the method is findAndReplace
 * 
 * @author: Felix Singerman
 * @version: 1.0
 * @since: 2016-02-05
 * 
 */

public class Utils {
/*
 * Returns a copy of the array 'in' where each word occuring in the array 'what'
 * has been replaced by the word occuring in the same position in the array 'with'
 * 
 * @param in an array of Strings
 * @param what an array of Strings
 * @param with an array of Strings
 * @return a new array of Strings
 * 
 */
    public static String[] findAndReplace( String[] in, String[] what, String[] with ) {
      String[] out=null; //The new array to be returned
      boolean valid=true; //True if the pre-conditions are satisfied
      
      //Testing pre-conditions
      
      if(in==null || what==null || with==null){
        valid=false;
      }
      else{
        for(int i=0; valid==true && i<in.length; i++){
          if(in[i] ==null){
            valid=false;
          }
        }
        if(valid){
          if(what.length != with.length){
            valid = false;
          }
          else{
            for(int i=0; valid==true && i < what.length; i++){
              if(what[i]==null || with[i]==null){
                valid=false;
              }
            }
          }
        }
      }
      //The program
      if(valid){
        out= new String[in.length];
        
        for(int i=0; i<in.length; i++){
          boolean found =false;
          
          for(int j=0; !found && j<what.length; j++){
            if(in[i].equals(what [j])){
              out[i] = with[j];
              
              found=true;
            }
          }
          if(!found){
            out[i]=in[i];
          }
        }
      }   
        return out;
    }
}
