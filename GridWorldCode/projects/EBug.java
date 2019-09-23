import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;


public class EBug extends Bug{
    private int steps;
    private int sideLength;
	private int count;

    public EBug(int length)
    {
        steps = 0;
        sideLength = length;
        setDirection(Location.WEST);
        count = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && getDirection() == 270 && canMove() && count < 18)
        {
            move();
            steps++;
            count++;
        }
        else if(steps == sideLength && getDirection() == 270 && count < 18){
        	turn();
        	turn();
        	steps = 0;
        	count++;
		}
		else if(steps < sideLength && getDirection() == 0 && canMove() && count < 18){
			move();
			steps++;
			count++;
		}
		else if(steps == sideLength && getDirection() == 0 && count < 18){
			turn();
			turn();
			steps = 0;
			count++;
		}
		else if(steps < sideLength && getDirection() == 90 && count < 18){
			move();
			steps++;
			count++;
		}
		else if(steps == sideLength && getDirection() == 90 && count < 18){
			setDirection(270);
			steps = 0;
			count++;
		}
        else
        {
            steps = sideLength + 1;
        }
    }
}
