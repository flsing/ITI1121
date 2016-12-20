// Copies the content of the input file onto the screen.

import java.io.*;

public class Copy {

    public static void copy( String fileName ) 
        throws IOException, FileNotFoundException {

        InputStreamReader input;

        input = new InputStreamReader( new FileInputStream( fileName ) );
        
        int c;
        while ( ( c = input.read() ) != -1 ) {
            System.out.write( c );
        }

        input.close();
    }

    public static void main( String[] args ) 
        throws IOException, FileNotFoundException {

        if ( args.length != 1 ) {
            System.out.println( "Usage: java Copy file" );
            System.exit( 0 );
        }

        copy( args[0] );

    }
}

// > java Copy Copy.java
//
// import java.io.*;
// 
// public class Copy {
// 
//     public static void copy(String fileName) 
//     throws IOException, FileNotFoundException {
// 
//      InputStreamReader input = null;
// 
//      try {
// 
//          input = new InputStreamReader(new FileInputStream(fileName));
//      
//          int c;
//          while ((c = input.read()) != -1) {
//              System.out.write(c);
//          }
// 
//      } finally {
//          if (input != null)
//              input.close();
//      }
//     }
// 
//     public static void main(String[] args) {
// 
//      if (args.length == 0) {
//          System.out.println("Usage: java Copy file [file|...]");
//          System.exit(0);
//      }
// 
//      for (int i=0; i<args.length; i++) {
// 
//          String fileName = args[i];
//          System.out.println(fileName + ":");
// 
//          try {
//              copy(fileName);
//          } catch (FileNotFoundException e) {
//              System.err.println("File not found ("+fileName+"): "+e.getMessage());
//          } catch (IOException e) {
//              System.err.println("Cannot read file ("+fileName+"): "+e.getMessage());
//          }
//      }
//     }
// }
