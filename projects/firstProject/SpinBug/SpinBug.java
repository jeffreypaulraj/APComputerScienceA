import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpinBug extends Bug{
	private boolean spinDirection;
	private boolean spinNotFinished;
	private int steps;

	public SpinBug(boolean spinDirection){
		this.spinDirection = spinDirection;
		spinNotFinished = false;
		steps = 0;
	}

	public void act(){
		if(canMove() &&! (spinNotFinished)){
			move();
			spinNotFinished = true;
		}
		else if (steps < 8 && spinDirection){
			turn();
			steps++;
		}
		else if(steps < 8 && !(spinDirection)){
			setDirection(getDirection() + 315);
			steps++;
		}
		else if(steps == 8){
			spinNotFinished = false;
			steps = 0;
		}
		else{
			turn();
			turn();
			steps = 0;
		}
	}
}



