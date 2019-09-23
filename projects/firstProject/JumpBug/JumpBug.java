import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class JumpBug extends Bug{

	private int steps;

	public JumpBug(boolean spinDirection){
		steps = 0;
	}

	  public void act()
	    {
	        if (canMove())
	        {
	            move();
	            steps++;
	        }
	        else
	        {
	            turn();
	        }
	    }
}


