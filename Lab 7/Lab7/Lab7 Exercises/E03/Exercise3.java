// Prints all the lines containing a given word. For each line
// containing the word, it prints the line number followed by the line
// itself.

import java.io.*;

public class Exercise3 {

    public static int findOccurance( String fileName, String word ) 
        throws IOException, FileNotFoundException {

      BufferedReader input;
     
     input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName) ) ); 
     
     int times = 0;
     String line; 
     
     while ((line = input.readLine())!= null){
       
       int index=0;
       
       while(line.indexOf(word,index)!= -1){
         index = line.indexOf(word,index)+word.length();
         times++;
         
          
        }
    }

        input.close();
        return times;
    }
      

    public static void main( String[] args ) 
        throws IOException, FileNotFoundException {

        if ( args.length != 2 ) {
            System.out.println( "Usage: java Find file word" );
            System.exit( 0 );
        }
        
        System.out.println("Number of occurance is: "+ findOccurance( args[0], args[1] ));
        

    }
}
// run Exercise3 myfile.txt ontario
// > java Find Find.java IOException
// 6:   throws IOException, FileNotFoundException {
// 23:  throws IOException, FileNotFoundException {
