import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;
public class ThreeBugRunner{
	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

		SpiralBug alice = new SpiralBug(6);
		alice.setColor(Color.ORANGE);
		world.add(new Location(5, 7), alice);

		CircleBug alison = new CircleBug(6);
		alison.setColor(Color.ORANGE);
		world.add(new Location(9, 9), alison);

        ZBug bob = new ZBug(4);
		bob.setColor(Color.ORANGE);
		world.add(new Location(0, 0), bob);
        world.show();
	}
}