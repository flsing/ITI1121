class SortByArtist implements java.util.Comparator {

    public int compare( Object o1, Object o2 ) {

        Song a = (Song) o1;
        Song b = (Song) o2;

        int result;

        if ( a == null && b == null )
            result = 0;
        else if ( a == null && b != null )
            result = 1;
        else if ( a != null && b == null )
            result = -1;
        else
            result = a.getArtist().compareTo( b.getArtist() );

        return result;
    }
}
