import java.text.NumberFormat;

public class Test {
    public static void main( String[] args ) {

        NumberFormat nf = NumberFormat.getInstance();

        nf.setMaximumFractionDigits( 2 );
        nf.setMinimumFractionDigits( 2 );
 
        System.out.println( nf.format( 1.0/3.0 ) );
        System.out.println( nf.format( 100.0 ) );

    }
}

