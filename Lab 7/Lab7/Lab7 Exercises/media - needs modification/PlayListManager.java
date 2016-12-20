import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PlayListManager extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // Instance variables
    private PlayList model;  // main PlayList
    private PlayList newPlayList;

    private String outFile;
  
    private JList<String> mainList;
    DefaultListModel<String> mainListModel;
    
    private JList<String> newList;
    DefaultListModel<String> newListModel;

    public PlayListManager( String in, String out ) {
    
        super( "Play List Manager" );
    
        // Taking of the data structures that will be storing our data

        try {
            this.model = PlayList.getSongsFromFile( in );
        } catch ( java.io.IOException e ) {
            System.err.println( e.getMessage() );
            System.exit( 1 );
        }

        newPlayList = new PlayList();  // we'll be adding Songs to this PlayList

        outFile = out;

        // Creating a Panel to visualize the two PlayLists

        JPanel listsPanel = new JPanel();
        listsPanel.setLayout( new FlowLayout() );
        mainListModel = new DefaultListModel<String>();
        mainList = new JList<String>(mainListModel);
        mainList.setBackground( Color.WHITE );
        
        
        newListModel = new DefaultListModel<String>();	
        newList = new JList<String>(newListModel);
        newList.setBackground( Color.WHITE );
        
        listsPanel.add( new JScrollPane(mainList));
        
        //  ------------------------------------------------------

        JButton copyButton = new JButton( "Copy >>" );

        copyButton.addActionListener( new ActionListener () {  // Listener is an inner class
                public void actionPerformed( ActionEvent e ) { // see supplemental notes on the web.

                    int pos = mainList.getSelectedIndex(); // determining which entry has been selected

                    if ( pos == -1 ) {

                        System.err.println( "Select a song from the list" );

                    } else {

                        newPlayList.addSong( model.getSongAt( pos ) ); // copy the Song
                        displaySongs(); // refresh the view
                    }
                }
            });

        listsPanel.add( copyButton );
        listsPanel.add( new JScrollPane(newList));
        //  ------------------------------------------------------

        
    
        add( listsPanel, BorderLayout.CENTER );
        

        //  ------------------------------------------------------

        //  Creating a Panel to hold the buttons

        JPanel controlPanel = new JPanel();

        //  ------------------------------------------------------

        JButton sortByNameButton = new JButton( "Sort By Name" );

        sortByNameButton.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent e ) {

                    SortByName c = new SortByName();  // Comparator

                    model.sort( c );
                    newPlayList.sort( c );

                    displaySongs();
                }
            });

        controlPanel.add( sortByNameButton );

        //  ------------------------------------------------------

        JButton sortByArtistButton = new JButton( "Sort By Artist" );

        sortByArtistButton.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent e ) {

                    SortByArtist c = new SortByArtist();

                    model.sort( c );
                    newPlayList.sort( c );

                    displaySongs();
                }
            });

        controlPanel.add( sortByArtistButton );

        //  ------------------------------------------------------

        JButton sortByAlbumButton = new JButton( "Sort By Album" );

        sortByAlbumButton.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent e ) {

                    SortByAlbum c = new SortByAlbum();

                    model.sort( c );
                    newPlayList.sort( c );

                    displaySongs();
                }
            });

        controlPanel.add( sortByAlbumButton );

        //  ------------------------------------------------------

        JButton printButton = new JButton( "Print" );

        printButton.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent e ) {

                    for ( int i=0; i<newPlayList.getSize(); i++ )
                        System.out.println( newPlayList.getSongAt( i ) );
                    
                }
            });

        controlPanel.add( printButton );

        //  ------------------------------------------------------

        JButton writeButton = new JButton( "Write" );

        writeButton.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent event ) {
                    try {
                        newPlayList.writeSongsToFile( outFile );
                    } catch ( java.io.IOException e ) {
                        System.err.println( e.getMessage() );
                        System.exit( 1 );
                    }
                }
            });

        controlPanel.add( writeButton );

        //  ------------------------------------------------------

        add( controlPanel, BorderLayout.SOUTH );

        //  ------------------------------------------------------

        addWindowListener( new WindowAdapter() {
                public void windowClosing( WindowEvent e ) {
                    System.exit( 0 );
                }
            });

        //  ------------------------------------------------------

        displaySongs();
                        
        pack();
        setVisible( true );
    }

    // Adds all the Songs from model to viewList, preserves the
    // order of the elements.

    private static void displaySongs( PlayList model, DefaultListModel<String> viewList ) {
        viewList.clear();
        for ( int i=0; i<model.getSize(); i++ ) {
            viewList.addElement(model.getSongAt( i ).toString() );
        }
    }

    // Used by the listeners to refresh the views

    public void displaySongs() {
        displaySongs( model, mainListModel );
        displaySongs( newPlayList, newListModel );
    }
}
