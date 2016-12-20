import javax.swing.JPanel;

public class DisplayArea extends JPanel {
  public static final int SCREEN_SIZE = 600;
  private static final int DELTA = 50;
  
  public DisplayArea(){
    setSize(SCREEN_SIZE, SCREEN_SIZE);
  }
}
