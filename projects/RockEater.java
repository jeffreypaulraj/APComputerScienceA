import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;

public class RockEater extends Critter{

	public ArrayList<Actor> getActors()
	    {
	        return getGrid().getNeighbors(getLocation());
    }

 	public void makeMove(Location loc)
 	   {
 	       setDirection(getLocation().getDirectionToward(loc));
 	       super.makeMove(loc);
 	   }
}