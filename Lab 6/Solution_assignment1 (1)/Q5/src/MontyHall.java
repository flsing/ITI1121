import javax.swing.JOptionPane;


/**
 * The class <b>MontyHall</b> simulates one or several games. Is uses three <b>Door</b> objects
 * to simulate the three doors. One game consists of the following steps
 * <ol>
 * <li>Resets all  doors</li>
 * <li>Simulates the selection of one of the doors by the player</li>
 * <li>Simulates opening of all other (empty) door save one by the host</li>
 * <li> provide the outcome for switching and not switching door</li>
 * </ol>
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class MontyHall {

	/** 
     * The list of doors 
     */
	private Door[] doorList;
	private int numberOfDoors;

	/** 
     * Initializes the list of doors.
     * 
     * @param numberOfDoors number of door used in the simulation
     */
 	public MontyHall(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;
		doorList = new Door[numberOfDoors];
		for(int i = 0; i < numberOfDoors; i++){
			doorList[i]= new Door(Integer.toString(i));
		}
	}
	
	/** 
     * Runs a series of Monty Hall games and displays the resulting statistics in a 
     * message dialog or on the standard output  
     * 
     * @param numberOfGames the number of games to simulate
     * @param commandLine if true, sends the results as CSV to standard output, else uses a message dialog
     */
 	public void runGames(int numberOfGames, boolean commandLine){
 		Statistics stats = new Statistics(numberOfDoors);
		for(int i = 0; i < numberOfGames; i++){
			oneGame();	
			stats.updateStatistics(doorList);
		}
		
		if(commandLine) {
			System.out.println(stats.toCSV());
		}
		else {
			JOptionPane.showMessageDialog (null,stats.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/** 
     * Runs a series of Monty Hall games for an increasing number of doors (from 2 to this.numberOfDoors)
     * Creates a CSV output with the results for each number of door
     *     
     * @param numberOfGames the number of games to simulate at each step
     */
	public void runGamesSeries(int numberOfGames){
		
		Statistics stats;
		int intialNumberOfDoors = numberOfDoors;
		
		for(numberOfDoors = 2; numberOfDoors <= intialNumberOfDoors; numberOfDoors++){
			stats = new Statistics(numberOfDoors);

			for(int i = 0; i < numberOfGames; i++){
				oneGame();	
				stats.updateStatistics(doorList);
			}
			System.out.println(stats.strategiesResultsCSV());
		}
	}

	/** 
     * Simulates one Monty Hall game.  
     * <ol>
     * <li>Resets all the doors</li>
	 * <li>Simulates the selection of one of the doors by the player</li>
	 * <li>Simulates opening of an empty door by the host</li>
	 * <li>prints the outcome for switching and not switching door to standard output</li>
	 * </ol>
     */
 	public void oneGame(){

 		for(int i = 0; i < numberOfDoors; i++){
			doorList[i].reset();
		}
		
		// add the price behind one of the doors
		Door prizeDoor = pickADoor();
		prizeDoor.setPrize();
		
		// player selects one of the doors
		Door selectedDoor = pickADoor();
		selectedDoor.choose();
		
		openOtherDoors(prizeDoor,selectedDoor);
		
	}

	/** 
     * Simulates a random selection of one of the  doors.
     * @return the door randomly selected  
     */
 	private Door pickADoor(){
		int choice = (int)(Math.random()*numberOfDoors);
		return doorList[choice];
	}
	
	/** 
     * Simulates the opening of numberOfDoors-2 doors once the player selected one.
     * It should  open doors chosen randomly among the ones that don't have the prize and
     * that are not selected by the player
     * 
     *   @param prizeDoor the door that hides the prize
     *   @param selectedDoor the door that was selected by the player
     */
 	private void openOtherDoors(Door prizeDoor, Door selectedDoor){

		if(prizeDoor != selectedDoor){
			//open every non selected, non prize door
			for(int i = 0; i < numberOfDoors; i++){
				if(!doorList[i].hasPrize() && !doorList[i].isChosen()){
					doorList[i].open();
				}
			}
		} else{
			//choose randomly a door to keep closed among the numberOfDoors-1 ones 
			int keepClosed = (int)(Math.random()*(numberOfDoors-1));
			for(int i = 0; i < numberOfDoors; i++){
				if(doorList[i].isChosen()){
					// skip over the chosen door
					keepClosed++;
				}
				else if(i != keepClosed){
					doorList[i].open();
				}
			}
		}

	}
	
 	/**
    * The main method of this program. Examples of the execution of the program
    * from the command line:
    * <pre>
    * > java MontyHall 5 3
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
    * @param args (optional) the number of games to simulate and the number of doors to use
	*/
	public static void main(String[] args) {

		MontyHall montyHall;
		int numberOfGames;
		int numberOfDoors;
		boolean commandLine = false;
		
		StudentInfo.display();

		if (args.length == 2) {
			numberOfGames = Integer.parseInt(args[0]);
			numberOfDoors = Integer.parseInt(args[1]);
			commandLine = true;
		} else {
			numberOfGames = Integer.parseInt(JOptionPane.showInputDialog("Input the number of games to play", "1000"));
			numberOfDoors = Integer.parseInt(JOptionPane.showInputDialog("Input the number of doors", "3"));
		}

		
		montyHall = new MontyHall(numberOfDoors);		
//		montyHall.runGames(numberOfGames, commandLine);
		montyHall.runGamesSeries(numberOfGames);
	}

}
