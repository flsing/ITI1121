

/**
 * The class <b>Door</b> stores the information about one of the door: 
 * does it have the prize behind it? Is it open or closed? Was it 
 * selected by the player?
 * 
 * It provides other objects access to these information through some
 * <b>setters</b> and <b>getters</b>.
 * 
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class Door {
	
	private boolean hasPrize;
	private boolean isOpen;
	private boolean isChosen;
	private String name;

	/** 
     * Creates an instance of the Door object.
     * Initially, the door is closed, doesn't have a prize behind it 
     * and has not been chosen by the player.
     * 
     * @param name identifier for that door
     */
	public Door(String name){
		this.name = name;
		reset();
	}

	/** 
     * Resets the door to its initial state: closed, without a prize behind it 
     * and not chosen by the player.
     */
	public void reset(){
		hasPrize = false;
		isOpen = false;	
		isChosen = false;
	}
	
	/** 
     * Sets this door open.
     */
	public void open(){
		isOpen = true;
	}
	
	/** 
     * Checks if the door is open.
     * @return true if the door is open
     */
	public boolean isOpen(){
		return isOpen;
	}
	
	/** 
     * Puts the prize behind this door.
     */
	public void setPrize(){
		hasPrize = true;
	}
	
	/** 
     * Checks if the door has the prize.
     * @return true if the door has the prize
     */
	public boolean hasPrize(){
		return hasPrize;
	}
	
	/** 
     * Sets this door as selected by the player.
     */
	public void choose(){
		isChosen = true;	
	}

	/** 
     * Checks if the door is selected by the player.
     * @return true if the door is selected by the player
     */
	public boolean isChosen(){
		return isChosen;
	}
	
	
	/** 
     * @return the door's identifier
     */
	public String getName(){
		return name;
	}
}
