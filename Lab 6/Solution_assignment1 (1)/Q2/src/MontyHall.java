import javax.swing.JOptionPane;

/**
 * The class <b>MontyHall</b> simulates one or several games. Is uses three <b>Door</b> objects
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
     * Runs a series of Monty Hall games and displays the resulting statistics in a 
     * message dialog or on the standard output  
     * 
     * @param numberOfGames the number of games to simulate
     * @param commandLine if true, sends the results to standard output, else uses a message dialog
     */
 	public void runGames(int numberOfGames, boolean commandLine){
 		Statistics stats = new Statistics();
		for(int i = 0; i < numberOfGames; i++){
			oneGame();	
			stats.updateStatistics(doorA, doorB, doorC);
		}
		
		if(commandLine) {
			System.out.println(stats.toString());
		}
		else {
			JOptionPane.showMessageDialog (null,stats.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);
		}
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
    * > java MontyHall 5
    * 
    * Number of games played: 5
    * Staying strategy won 2 games (40%)
	* Switching strategy won 3 games (60%)
	*	Selected doors:
	*		door 1: 1 (20%)
	*		door 2: 3 (60%)
	*		door 3: 1 (20%)
	*	Winning doors:
	*		door 1: 1 (20%)
    *		door 2: 1 (20%)
	*		door 3: 3 (60%)
	*	Open doors:
    *		door 1: 2 (40%)
	*		door 2: 2 (40%)
 	*		door 3: 1 (20%)
 	*
    * @param args (optional) the number of games to simulate
	*/
	public static void main(String[] args) {

		MontyHall montyHall;
		int numberOfGames;
		boolean commandLine = false;
		
		StudentInfo.display();

		if (args.length == 1) {
			numberOfGames = Integer.parseInt(args[0]);
			commandLine = true;
		} else {
			numberOfGames = Integer.parseInt(JOptionPane.showInputDialog("Input the number of games to play", "1000"));
		}

		
		montyHall = new MontyHall();		
		montyHall.runGames(numberOfGames, commandLine);
	}

}
