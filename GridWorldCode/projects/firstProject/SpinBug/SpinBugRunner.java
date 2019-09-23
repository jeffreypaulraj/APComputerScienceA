import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpinBugRunner{
	public static void main(String[]args){

        ActorWorld world = new ActorWorld();
        SpinBug alice = new SpinBug(false);
        alice.setColor(Color.ORANGE);
        SpinBug bob = new SpinBug(true);
        world.add(new Location(7,8), bob);
        world.add(new Location(5, 5), alice);
        world.show();
	}
}