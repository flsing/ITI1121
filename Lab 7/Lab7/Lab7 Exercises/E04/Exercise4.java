import java.net.URL;
import java.net.MalformedURLException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise4 {

    public static void wget( String spec ) 
        throws MalformedURLException, IOException {
    
      URL url = new URL(spec);
      
      BufferedReader in = new BufferedReader (new InputStreamReader(url.openStream()));
      
      String line = null;
      
      while((line=in.readLine())!=null){
        System.out.println(line);
        
      }
      
      
            in.close();
      
    }

    public static void main( String[] args ) 
        throws MalformedURLException, IOException {

        if ( args.length != 1 ) {
            System.out.println( "Usage: java WGet url" );
            System.exit( 0 );
        }

        wget( args[ 0 ] );
    }
}

// > java WGet http://www.site.uottawa.ca/~turcotte/index.html
// <html>
//   <head>
//     <title>Marcel Turcotte</title>
//     <link rel="STYLESHEET" type="text/css" href="css/default.css" />
// 
//     <link rel="shortcut icon" href="favicon.ico"/>
//     <link rel="icon" href="favicon.ico"/>
// 
//   </head>
//   <body>
// ...
//   </body>
// </html>
