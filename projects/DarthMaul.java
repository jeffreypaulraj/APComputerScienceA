import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import info.gridworld.grid.Location;


public class DarthMaul extends Critter{

	public DarthMaul(){
		setColor(null);
	}
	public void processActors(ArrayList<Actor> actors)
	    {
	        for (Actor a : actors)
	        {
	            if (!(a instanceof Critter))
	                a.removeSelfFromGrid();
	        }
    }
    public ArrayList<Actor> getActors()
	{
	      Grid<Actor> gr = getGrid();
	      ArrayList<Actor> neighbor = new ArrayList<Actor>();
	      Location current = getLocation();
	      Location nextRight = current.getAdjacentLocation(getDirection()+90);
	      if(gr.isValid(nextRight)){
	      	Actor a = gr.get(nextRight);
	      	if(a != null)
	      		neighbor.add(a);
		  }

		  Location nextLeft = current.getAdjacentLocation(getDirection()-90);
		  if(gr.isValid(nextLeft)){
		  	    Actor b = gr.get(nextLeft);
		  	    if(b != null)
		  	   		neighbor.add(b);
		  }

	      return neighbor;
	}

	public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}