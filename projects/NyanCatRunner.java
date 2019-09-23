import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;


public class NyanCatRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //Rock rick = new Rock();
        Bug bob = new NyanCat();
        world.add(new Location(1,5), bob);
        //world.add(new Location(2,5), rick);
        world.show();
    }
}
