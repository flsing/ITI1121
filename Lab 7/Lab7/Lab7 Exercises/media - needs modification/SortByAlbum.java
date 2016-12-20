public class SortByAlbum implements java.util.Comparator {

    // The only method of the interface Comparator.

    public int compare( Object o1, Object o2 ) {

        // The following statment will throw a ClassCastException at
        // runtime if o1 does not designate a Song.  No exception will
        // thrown if o1 is null.

        Song a = (Song) o1;

        // Similarly for o2.

        Song b = (Song) o2;

        int result;

        // Considering null values greather than non-null values, this
        // will force the sort to move all the null values toward the
        // end of the array.

        if ( a == null && b == null )
            result = 0;
        else if ( a == null && b != null )
            result = 1;
        else if ( a != null && b == null )
            result = -1;
        else
            result = a.getAlbum().compareTo( b.getAlbum() );

        return result;
    }
}
