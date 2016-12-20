
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
	private int numberOfDoors;

	/** 
     * Initializes the statistics.
     * 
     * @param numberOfDoors the number of doors used
     */
 	public  Statistics(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;
		selectedDoors = new int[numberOfDoors];
		prizeDoors = new int[numberOfDoors];
		openDoors = new int[numberOfDoors];
		switchingStrategyWins = 0;
		stayingStrategyWins = 0;
		numberOfGamesPlayed = 0;		
	}
	
	/** 
     * Updates statistics after one game.
     *   @param doorList the list of Doors used during the game
     */
	public void updateStatistics(Door[] doorList){
		numberOfGamesPlayed++;
		for(int i = 0; i < numberOfDoors; i++){
			if(doorList[i].isChosen()){
				selectedDoors[i]++;
				if(doorList[i].hasPrize()){
					stayingStrategyWins++;
				}else{
					switchingStrategyWins++;
				}				
			}
			if(doorList[i].hasPrize()){
				prizeDoors[i]++;
			}
			if(doorList[i].isOpen()){
				openDoors[i]++;
			}
			
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
		for(int i = 0; i < numberOfDoors; i++){
			answer.append(System.lineSeparator()+"\tDoor " + (i+1) +": " + selectedDoors[i] + " ("+ (int)(selectedDoors[i]*100/numberOfGamesPlayed) + "%)");
		}

		answer.append(System.lineSeparator()+"Winning doors:");
		for(int i = 0; i < numberOfDoors; i++){
			answer.append(System.lineSeparator()+"\tDoor " + (i+1) +": " + prizeDoors[i] + " ("+ (int)(prizeDoors[i]*100/numberOfGamesPlayed) + "%)");
		}

		answer.append(System.lineSeparator()+"Open doors:");
		for(int i = 0; i < numberOfDoors; i++){
			answer.append(System.lineSeparator()+"\tDoor " + (i+1) +": " + openDoors[i] + " ("+ (int)(openDoors[i]*100/numberOfGamesPlayed) + "%)");
		}

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
		for(int i = 0; i < numberOfDoors; i++){
			answer.append(System.lineSeparator()+"Door " + (i+1) +","+selectedDoors[i]+","+prizeDoors[i]+","+openDoors[i]);
		}
		return answer.toString();

	}

	/** 
     *  @return Returns the statistics data numberOfGamesPlayed,numberOfDoors,stayingStrategyWins,switchingStrategyWins in CSV format
     */
	public String strategiesResultsCSV(){
		return( numberOfGamesPlayed + "," + numberOfDoors+ "," + stayingStrategyWins + "," + switchingStrategyWins );
	}

}
