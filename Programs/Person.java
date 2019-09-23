public class Person{

	private String name;
	private String alliance;

	public Person(String name, String alliance){
		this.name = name;
		this.alliance = alliance;
	}
	public Person(){
		this.name = "no name";
		this.alliance = "no alliance";
	}
	public String getName(){
		return name;
	}

	public String toString(){
		return "The name of this person is " + name;
	}
}