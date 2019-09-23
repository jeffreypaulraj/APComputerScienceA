import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Flower;

public class NyanCat extends Bug{

	public NyanCat(){
		setColor(null);
	}

	public void act(){
		Grid<Actor> gr = getGrid();
		Location current = getLocation();
	    Location next = current.getAdjacentLocation(getDirection());
	     if (!gr.isValid(next)){
			turn();
		}
		else{
			move();
			Rainbow r = new Rainbow(getDirection()-90);
			r.putSelfInGrid(gr, current);
		}
	}

}