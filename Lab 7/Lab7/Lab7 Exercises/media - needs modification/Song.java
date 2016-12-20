import java.util.StringTokenizer;

public class Song {
  
    // Instance variables

    private String name;
    private String artist;
    private String album;
  
    // Constructor

    public Song( String name, String artist, String album ) {

        if ( name == null || artist == null || album == null )
            throw new IllegalArgumentException( "null value" );

        this.name = name;
        this.artist = artist;
        this.album = album;
    }
  
    // Access methods

    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }

    // Overriding the method equals

    public boolean equals( Object o ) {

        if ( ! ( o instanceof Song ) ) // also takes care of o == null
            return false;

        // None of the instance variables can be null: i) the
        // constructor does not allow it and ii) there are no
        // setters. This simplifies the implementation of equals.

        Song other = (Song) o;

        return ( name.equals( other.name ) && 
                 artist.equals( other.artist ) && 
                 album.equals( other.album ) );

    }

    // Overriding the method toString

    public String toString() {
        return getName() + ":" + getArtist() + ":" + getAlbum();
    }

    public static Song parseSong( String s ) {

        StringTokenizer st = new StringTokenizer( s, ":" );

        return new Song( st.nextToken(), st.nextToken(), st.nextToken() );
    }

}
