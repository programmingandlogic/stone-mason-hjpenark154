/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			buildPillar();
			moveBackDown();
			moveToPillar();
		}
		buildPillar();
		moveBackDown();
	}	
	
	/*
	 * This method repairs the pillar by having karel put beepers along the avenue.
	 * Karel starts on 1st street on the bottom of the pillar and ends on top of the pillar.
	 */
	private void buildPillar() {
		turnLeft();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}	
			move();
		}	
		 if (noBeepersPresent()) {
			 putBeeper();
		 }	 
	}
	
	/*
	 * This method moves karel back to the bottom of the pillar they repaired. 
	 * Karel starts at the top of the pillar facing north and ends at the bottom of the pillar facing east
	 */
	private void moveBackDown() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	/*
	 * This method moves karel to the next pillar that needs to be repaired. 
	 * Karel starts on 1st avenue and 1st street facing east and ends on 1st avenue four streets forward facing east 
	 */
	private void moveToPillar() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
}