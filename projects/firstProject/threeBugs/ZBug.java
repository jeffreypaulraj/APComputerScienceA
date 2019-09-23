import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
public class ZBug extends Bug{
private int steps;
    private int sideLength;
    private int temp;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        temp = 3;
        setDirection(Location.EAST);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
		if (steps < sideLength && canMove())
   	     {
   	         move();
   	         steps++;
   	     }
   	     else{
			 temp--;
			 if(temp == 1){
			 	turn();
			 	turn();
			}
			 turn();
			 turn();
			 turn();
			 steps = 0;
			 if(temp<=0){
			 	steps = sideLength+1;
			 	setDirection(Location.EAST);
			}
		 }
    }
}
