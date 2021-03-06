package cscie55.hw2; 

/**
 * Building class: Keeps track of one Elevator and multiple Floors. 
 * @author Yuling (Alice) Xiong 
 * @version 1.0 March 1, 2016
 */
public class Building {
	/**
	 * @param myElevator declare myElevator in this Building 
	 * @param FLOORS declare number of floors in this Building
	 * @param myFloor declare floor arrays in this Building 
	 */

	private Elevator myElevator;
	public static final int FLOORS = 7;
    private Floor [] myFloor;
    		
    /**
     * @param floorNumber 
     * @return the Floor object for the given floor number
     */
    public Floor floor(int floorNumber){
    	return myFloor[floorNumber-1];
    }
    
	/**
	 * myElevator's access is private, define getElevator method 
	 * @return the building's Elevator
	 */
    public Elevator elevator() {
    	return myElevator;
    }
    

    /**
     * Building constructor: 
     * Create an Elevator and initialize it 
     * Create an Floor array and initialize it in the for loop
     */
    public Building(){
    	myElevator = new Elevator(this);
    	myFloor = new Floor[FLOORS];
    	
    	for (int i=0; i < FLOORS; i++){
        	myFloor[i] = new Floor(this,i+1);
        }
    	
    }
   
    

    
}
