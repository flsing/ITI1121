
/**
 * The class  <b>Statistics</b> accumulates information about a series of games:
 * <ol>
 * <li>Number of game played</li>
 * <li>Number of times the switching strategy was successful</li>
 * <li>Number of times the switching strategy was not successful</li>
 * <li>Number of times each door has the prize behind it</li>
 * <li>Number of times each door was chosen by the player</li>
 * <li>Number of times each door was open by the host</li>
 * </ol>
 *
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class Statistics {

	private int[] selectedDoors;
	private int[] prizeDoors;
	private int[] openDoors;
	private int switchingStrategyWins;
	private int stayingStrategyWins;
	private int numberOfGamesPlayed;

	/** 
     * Initializes the statistics.
     */
 	public  Statistics(){
		selectedDoors = new int[3];
		prizeDoors = new int[3];
		openDoors = new int[3];
		switchingStrategyWins = 0;
		stayingStrategyWins = 0;
		numberOfGamesPlayed = 0;		
	}
	
	/** 
     * Updates statistics after one game.
     *   @param door1 the first door in the game
     *   @param door2 the second door in the game
     *   @param door3 the third door in the game
     */
 	public void updateStatistics(Door door1, Door door2, Door door3){
		numberOfGamesPlayed++;
		oneDoor(door1,0);
		oneDoor(door2,1);
		oneDoor(door3,2);
	}
	
	/** 
     * Updates statistics for one single door.
     *   @param door the door for which statistics are updated
     *   @param index index of that door (0, 1 or 2)
     */
	private void oneDoor(Door door, int index){
		if(door.isChosen()){
			selectedDoors[index]++;
			if(door.hasPrize()){
				stayingStrategyWins++;
			}else{
				switchingStrategyWins++;
			}
		}
		if(door.hasPrize()){
			prizeDoors[index]++;
		}
		if(door.isOpen()){
			openDoors[index]++;
		}
	}

	/** 
     *  @return Returns the complete statistics information
     */
	public String toString(){
		StringBuffer answer = new StringBuffer();
		answer.append("Number of games played: " + numberOfGamesPlayed);

		/** 
		*  Note: In order to have system-dependent line separator, it highly recommended to use "System.lineSeparator()" instead of "\n".
		*/
		answer.append(System.lineSeparator()+"Staying strategy won " + stayingStrategyWins + " games ("+ (int)(stayingStrategyWins*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"Switching strategy won " + switchingStrategyWins + " games ("+ (int)(switchingStrategyWins*100/numberOfGamesPlayed) + "%)");
		
		answer.append(System.lineSeparator()+"Selected doors:");
		answer.append(System.lineSeparator()+"\tdoor 1: " + selectedDoors[0] + " ("+ (int)(selectedDoors[0]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 2: " + selectedDoors[1] + " ("+ (int)(selectedDoors[1]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 3: " + selectedDoors[2] + " ("+ (int)(selectedDoors[2]*100/numberOfGamesPlayed) + "%)");

		answer.append(System.lineSeparator()+"Winning doors:");
		answer.append(System.lineSeparator()+"\tdoor 1: " + prizeDoors[0] + " ("+ (int)(prizeDoors[0]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 2: " + prizeDoors[1] + " ("+ (int)(prizeDoors[1]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 3: " + prizeDoors[2] + " ("+ (int)(prizeDoors[2]*100/numberOfGamesPlayed) + "%)");

		answer.append(System.lineSeparator()+"Open doors:");
		answer.append(System.lineSeparator()+"\tdoor 1: " + openDoors[0] + " ("+ (int)(openDoors[0]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 2: " + openDoors[1] + " ("+ (int)(openDoors[1]*100/numberOfGamesPlayed) + "%)");
		answer.append(System.lineSeparator()+"\tdoor 3: " + openDoors[2] + " ("+ (int)(openDoors[2]*100/numberOfGamesPlayed) + "%)");

		return answer.toString();

	}
	
	/** 
     *  @return Returns the complete statistics information in CSV format
     */
	public String toCSV(){
		StringBuffer answer = new StringBuffer();
		answer.append("Number of games,"+numberOfGamesPlayed);
		/** 
		*  Note: In order to have system-dependent line separator, it highly recommended to use "System.lineSeparator()" instead of "\n".
		*/
		answer.append(System.lineSeparator()+"Number of doors,"+3);
		answer.append(System.lineSeparator()+",Win,Loss");		
		answer.append(System.lineSeparator()+"Staying strategy," + stayingStrategyWins + "," +  (numberOfGamesPlayed-stayingStrategyWins));
		answer.append(System.lineSeparator()+"Switching strategy," + switchingStrategyWins + "," +  (numberOfGamesPlayed-switchingStrategyWins));
		answer.append(System.lineSeparator()+",Selected doors,Winning doors,Open doors");		
		answer.append(System.lineSeparator()+"Door 1,"+selectedDoors[0]+","+prizeDoors[0]+","+openDoors[0]);
		answer.append(System.lineSeparator()+"Door 2,"+selectedDoors[1]+","+prizeDoors[1]+","+openDoors[1]);
		answer.append(System.lineSeparator()+"Door 3,"+selectedDoors[2]+","+prizeDoors[2]+","+openDoors[2]);
		return answer.toString();

	}

}
