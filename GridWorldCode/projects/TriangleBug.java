import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class TriangleBug extends Bug{

	private int length;
	private int steps;

	public TriangleBug(){
		length = 3;
		steps = 0;
		setDirection(45);
	}

	public TriangleBug(int length){
		this.length = length - 1;
		steps = 0;
		setDirection(45);
	}

	public void act(){
		if(canMove()&& steps < length && getDirection() == 45){
			move();
			steps++;
		}
		else if(canMove() && steps == length && getDirection() == 45){
			turn();
		}
		else if(canMove() && steps == length && getDirection() == 90){
			turn();
			steps = 0;
		}
		else if(canMove() && steps< length && getDirection() == 135){
			move();
			steps++;
		}
		else if(canMove() && steps == length && getDirection() == 135){
			turn();
		}
		else if(canMove() && steps == length && getDirection() == 180){
			turn();
		}
		else if(canMove() && steps == length && getDirection() == 225){
			turn();
			steps = 0;
		}
		else if(canMove() && steps < (2*length) && getDirection() == 270){
			move();
			steps++;
		}
		else if(steps == (2*length) && getDirection() == 270){
			turn();
		}
		else if(steps == (2*length) && getDirection() == 315){
			turn();
		}
		else if(steps == (2*length) && getDirection() == 0){
			turn();
			steps = 0;
		}
		else
			turn();
	}

}