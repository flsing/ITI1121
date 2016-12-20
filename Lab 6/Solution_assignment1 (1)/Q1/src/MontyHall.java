
/**
 * The class <b>MontyHall</b> simulates one game. Is uses three <b>Door</b> objects
 * to simulate the three doors. One game consists of the following steps
 * <ol>
 * <li>Resets all three doors</li>
 * <li>Simulates the selection of one of the doors by the player</li>
 * <li>Simulates opening of an empty door by the host</li>
 * <li> provide the outcome for switching and not switching door</li>
 * </ol>
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class MontyHall {

	/** 
     * The names of the three doors 
     */
	private Door doorA, doorB, doorC;

	/** 
     * Random generator 
     */
	private static java.util.Random generator = new java.util.Random();

	/** 
     * Initializes the three doors.
     */
 	public MontyHall(){
		doorA = new Door("A");
		doorB = new Door("B");
		doorC = new Door("C");
	}
	
	/** 
     * Simulates one Monty Hall game.  
     * <ol>
     * <li>Resets all three doors</li>
	 * <li>Simulates the selection of one of the doors by the player</li>
	 * <li>Simulates opening of an empty door by the host</li>
	 * <li>prints the outcome for switching and not switching door to standard output</li>
	 * </ol>
     */
 	public void oneGame(){
		doorA.reset();
		doorB.reset();
		doorC.reset();
		
		// add the price behind one of the doors
		Door prizeDoor = pickADoor();
		prizeDoor.setPrize();
		
		// player selects one of the doors
		Door selectedDoor = pickADoor();
		selectedDoor.choose();
		
		Door openDoor = openOtherDoor(prizeDoor,selectedDoor);

		// //This is a different implementation of the same feature
		// Door openDoor = openOtherDoor_AlternateImplementation();
		
		
		System.out.println("The prize was behind door " + prizeDoor.getName());
		System.out.println("The player selected door " + selectedDoor.getName());
		System.out.println("The host opened door " + openDoor.getName());
		if(selectedDoor == prizeDoor){
			System.out.println("Switching strategy would have lost");
		} else{
			System.out.println("Switching strategy would have won");	
		}
		
	}

	/** 
     * Simulates a random selection of one of the three doors.
     * @return the door randomly selected  
     */
 	private Door pickADoor(){
 		int choice = generator.nextInt(3);
		if(choice == 0) {
			return doorA;
		}
		else if(choice == 1){
			return doorB;
		}
		else {
			return doorC;
		}		
	}
	
	/** 
     * Simulates the opening of one of the other doors once the player selected one.
     * It should  open a door chosen randomly among the ones that don't have the prize and
     * that are not selected by the player
     * 
     *   @param prizeDoor the door that hides the prize
     *   @param selectedDoor the door that was selected by the player
     *   @return the door opened
     */
 	private Door openOtherDoor(Door prizeDoor, Door selectedDoor){

		if(prizeDoor != selectedDoor){
			// open the third door
			if(!doorA.hasPrize() && !doorA.isChosen()){
				doorA.open();
				return doorA;
			}
			if (!doorB.hasPrize() && !doorB.isChosen()){
				doorB.open();
				return doorB;
			}
			doorC.open();
			return doorC;	
		}
		else{
			// chose at random which of the 2 other ones to open
			// if we draw 0, we open the first we encounter,
			// else we open the second
			boolean openNext = ((int)(Math.random()*2) == 0);
			
			if(!doorA.hasPrize()){
				if(openNext){
					doorA.open();
					return doorA;
				}
				else{
					openNext=true;
				}
			}			
			if(!doorB.hasPrize()){
				if(openNext){
					doorB.open();
					return doorB;
				}
				else{
					openNext=true;
				}
			}			
			doorC.open();
			return doorC;
		}

	}
 	
	/** 
     * Same as openOtherDoor, but a different approach
     * 
     *   @return the door opened
     */
	
	private Door openOtherDoor_AlternateImplementation(){

		Door chosenDoor;
		while(true){
			chosenDoor = pickADoor();
			if(!chosenDoor.hasPrize() && !chosenDoor.isChosen()){
				chosenDoor.open();
				return chosenDoor;
			}
		}
	}
	
 	/**
     * The main method of this program. Examples of the execution of the program
     * from the command line:
     * <pre>
     * > java MontyHall
     * The prize was behind door B
     * The player selected door B
     * The host opened door C
     * Switching strategy would have lost
     * </pre>
     * <pre>
     * > java MontyHall
     * The prize was behind door B
     * The player selected door A
     * The host opened door C
     * Switching strategy would have won
     * </pre>
    * @param args ignored for now
	 */
	public static void main(String[] args) {

		MontyHall montyHall;
		
		StudentInfo.display();
		montyHall = new MontyHall();		
		montyHall.oneGame();
	}

}
