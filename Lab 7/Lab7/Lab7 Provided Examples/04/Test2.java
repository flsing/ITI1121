import java.util.Locale;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Test2 {

    private static String formatStr = "###0.000";  

    private static DecimalFormat fmCanada = 
        new DecimalFormat( formatStr, new DecimalFormatSymbols( Locale.CANADA ) );
    private static DecimalFormat fmCdnFr = 
        new DecimalFormat( formatStr, new DecimalFormatSymbols( Locale.CANADA_FRENCH ) );
    private static DecimalFormat fmFrance = 
        new DecimalFormat( formatStr, new DecimalFormatSymbols( Locale.FRANCE ) );
    private static DecimalFormat fmDefault = 
        new DecimalFormat( formatStr, new DecimalFormatSymbols( Locale.getDefault() ) );

    public static void main( String[] args ) {

        System.out.println( "Canada, PI = " + fmCanada.format( Math.PI ) );
        System.out.println( "France, PI = " + fmFrance.format( Math.PI ) );

        System.out.println();
        System.out.println( "Canada francais, PI = " + fmCdnFr.format( Math.PI ) );
        System.out.println( "This computer, PI = " + fmDefault.format( Math.PI ) );

    }
}

// > java Test
// Canada, PI = 3.142
// France, PI = 3,142
// 
// Canada francais, PI = 3,142
// This computer, PI = 3.142
