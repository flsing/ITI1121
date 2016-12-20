/**
 * ITI1121A LAB 11
 * 
 */

public class BitListTest {

    public static void main( String[] args ) {

        BitList a, b;

        for ( int i=0; i<args.length; i++ ) {

            a = new BitList( args[i] );
            System.out.println( "Entered--> " + a );
            a.complement();
            System.out.println( "Complement--> " + a );
            System.out.println();

        }

        a = new BitList( "10001" );
        b = new BitList( "00011" );

        System.out.println( "a = " + a );
        System.out.println( "b = " + b );

        System.out.println( "a or b = " + a.or( b ) );

        a = new BitList( "11001" );
        b = new BitList( "11001" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList( "11001" );
        b = new BitList( "11000" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList( "01001" );
        b = new BitList( "11001" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList( "1100" );
        b = new BitList( "11001" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList( "11001" );
        b = new BitList( "110" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList( "11001" );
        b = new BitList();
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList();
        b = new BitList( "11001" );
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );

        a = new BitList();
        b = new BitList();
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "a.equals( b ) -> " + a.equals( b ) );
    }
}

// > java BitListTest 1011 "" 01 0000111
//
// > 1011
// < 0100
// 
// > 0
// < 1
// 
// > 01
// < 10
// 
// > 0000111
// < 1111000

