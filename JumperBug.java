import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Flower;

public class JumperBug extends Bug{

	private int steps;
	private int sideLength;

	public JumperBug(){
		steps = 0;
	}

	public void act(){
		if(canMove()){
			move();
		}
		else if(canJump()){
			jump();
		}
		else{
			turn();
		}
	}

	public boolean canJump(){
		Grid<Actor> gr = getGrid();
		Location current = getLocation();
		Location next = current.getAdjacentLocation(getDirection());
		Location secondNext = next.getAdjacentLocation(getDirection());
		if(!gr.isValid(secondNext))
			return false;
		else{
			Actor neighborTwo = gr.get(secondNext);
			return (neighborTwo == null || neighborTwo instanceof Flower);
		}
	}

	public void jump(){
		Grid<Actor> gr = getGrid();
		Location current = getLocation();
		Location next = current.getAdjacentLocation(getDirection());
		Location secondNext = next.getAdjacentLocation(getDirection());
		moveTo(secondNext);
		Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, current);
	}
}