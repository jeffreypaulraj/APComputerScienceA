import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;

public class JeffreyPaulraj extends Critter{

	public JeffreyPaulraj(){
		setColor(null);
	}
	public void makeMove(Location loc){
	        setDirection(getLocation().getDirectionToward(loc));
	        super.makeMove(loc);
	}

    public ArrayList<Actor> getActors(){
	      Grid<Actor> gr = getGrid();
	      ArrayList<Actor> neighbor = new ArrayList<Actor>();
	      Location current = getLocation();
	      ArrayList<Location> neighborLocs = new ArrayList<Location>();
	      ArrayList<Location> lineOfSight = new ArrayList<Location>();
	      Location base;
	      for(int i = 0; i < 10; i++){
			  if(i == 0)
			  	base = current;
			  else
			  	base = lineOfSight.get(i-1);
			  lineOfSight.add(base.getAdjacentLocation(getDirection()));
			  if(gr.isValid(base.getAdjacentLocation(getDirection())))
			  	neighborLocs.add(base.getAdjacentLocation(getDirection()));
		  }
		  Actor n;
		  if(neighborLocs.size() != 0){
		  for(int i = 0; i < neighborLocs.size(); i++){
		  	n = gr.get(neighborLocs.get(i));
		  	if(n != null)
		  		neighbor.add(n);
		  }
	  }

	      return neighbor;
	}
	public void processActors(ArrayList<Actor> actors){
	       Grid<Actor> gr = getGrid();
	       Ash ash = new Ash();
	       if(actors.size() != 0){
	       	Location loc = actors.get(0).getLocation();
	       	actors.get(0).removeSelfFromGrid();
		   	ash.putSelfInGrid(gr,loc);
		   }
    }


}
