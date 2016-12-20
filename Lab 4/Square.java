
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JFrame  implements ActionListener {


	private JButton bSquare = new JButton("Square");
	private JButton bQuit = new JButton("Exit");
	private JTextField input = new JTextField();

	public Square() {
		super("Square calculator");
		setLayout(new GridLayout(1,3));
		add(bSquare);
		add(input);
		add(bQuit);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bSquare.addActionListener(this);
		bQuit.addActionListener(this);

		setVisible(true);		
	}

	private void computeSquare(){
		int v = Integer.parseInt(input.getText());
		input.setText(Integer.toString(v*v));
	} 

	public void actionPerformed( ActionEvent e ) {
		if(e.getSource() == bSquare) {
     	   computeSquare();
     	} else if (e.getSource() == bQuit) {
     		System.exit(0);
     	}
  
    }

}



/*	private JButton bSquare = new JButton("Square");
	private JButton bQuit = new JButton("Exit");
	private JTextField input = new JTextField();
*/

	/*
			setLayout(new GridLayout(1,3));
		add(bSquare);
		add(input);
		add(bQuit);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bSquare.addActionListener(this);
		bQuit.addActionListener(this);
*/

    /*
	private void computeSquare(){
		int v = Integer.parseInt(input.getText());
		input.setText(Integer.toString(v*v));
	} 
	*/


	/*
	public void actionPerformed( ActionEvent e ) {
        computeSquare();
    }
    */

	/*
	public void actionPerformed( ActionEvent e ) {
		if(e.getSource() == bSquare) {
     	   computeSquare();
     	} else if (e.getSource() == bQuit) {
     		System.exit(0);
     	}
    }
*/

