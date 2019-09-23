public class JediKnight extends Person{

	private String forcePower;
	public JediKnight(String name, String alliance, String forcePower){
		super(name, alliance);
		this.forcePower = forcePower;
	}

	public String toString(){
		//return getName() + " is a Jedi and has " + forcePower + " power.";
		return super.toString()+ " has a force power of " + forcePower;
	}
}