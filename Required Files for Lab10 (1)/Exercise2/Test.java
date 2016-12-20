public class Test {

    public static void main( String[] args ) {

	CircularQueue<String> q;
	q = new CircularQueue<String>( 7 );

	q.enqueue( "A" );
	q.enqueue( "B" );
	q.enqueue( "C" );
	q.enqueue( "D" );
	q.enqueue( "E" );

	System.out.println( q );

	Iterator<String> i;
	i = q.iterator();

	while (i.hasNext()) {
	    System.out.print( i.next() );
	    if ( i.hasNext() ) {
		System.out.print( ", " );
	    }
	}
	System.out.println();

	i = q.iterator();

	while (i.hasNext()) {
	    System.out.print( i.next() );
	    if ( i.hasNext() ) {
		System.out.print( ", " );
	    }
	}
	System.out.println();


	q.dequeue();
	q.dequeue();
	q.dequeue();

	q.enqueue( "F" );
	q.enqueue( "G" );
	q.enqueue( "H" );
	q.enqueue( "I" );

	System.out.println( q );

	i = q.iterator();

	while (i.hasNext()) {
	    System.out.print( i.next() );
	    if ( i.hasNext() ) {
		System.out.print( ", " );
	    }
	}
	System.out.println();

	i = q.iterator();

	while (i.hasNext()) {
	    System.out.print( i.next() );
	    if ( i.hasNext() ) {
		System.out.print( ", " );
	    }
	}
	System.out.println();

    }
}

