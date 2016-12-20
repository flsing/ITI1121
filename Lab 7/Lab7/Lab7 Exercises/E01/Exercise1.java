// Reads keyboad input, displays the characters read, stops when the
// end-of-stream is reached.

import java.io.InputStreamReader;
import java.io.IOException;


public class Exercise1 {
    public static void main( String[] args ) throws IOException {

      InputStreamReader in = new InputStreamReader( System.in );
      
      char [] buffer = new char[20];
      String str;
      
        while ( (in.read(buffer) != -1 )) {
            str = new String (buffer).trim();
            
            System.out.println(str);
        }
        System.out.println( "bye" );

    }
}

// > java Exercise1
// On Unix you must type control-d in order to send an eos (-1) to
// the program.
