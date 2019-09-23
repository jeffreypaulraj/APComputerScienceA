import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;
import info.gridworld.grid.Location;

public class JumpBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        JumpBug alice = new JumpBug(false);
        alice.setColor(Color.ORANGE);
 		world.add(new Location(7,8), alice);
 		world.add(new Rock());
        world.show();
    }
}