import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;


public class TriangleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //Rock rick = new Rock();
        Bug bob = new TriangleBug(8);
        world.add(new Location(5,0), bob);
        //world.add(new Location(2,5), rick);
        world.show();
    }
}
