// Prints all the lines containing a given word. For each line
// containing the word, it prints the line number followed by the line
// itself.

import java.io.*;

public class Exercise2 {

    public static void find( String fileName, String word ) 
        throws IOException, FileNotFoundException {

      
     BufferedReader input;
     
     input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName) ) ); 
     
     int lineNumber = 0;
     String line; 
     
     while ((line = input.readLine())!= null){
       
       lineNumber++;
       
       if(line.indexOf(word)!= -1){
         System.out.println(lineNumber + ":" + line);   
          
        }
    }

        input.close();
    }

    public static void main( String[] args ) 
        throws IOException, FileNotFoundException {

        if ( args.length != 2 ) {
            System.out.println( "Usage: java Find file word" );
            System.exit( 0 );
        }

        find( args[0], args[1] );

    }
}
// run Exercise2 myfile.txt ontario
// > java Find Find.java IOException
// 6:   throws IOException, FileNotFoundException {
// 23:  throws IOException, FileNotFoundException {
