public class PersonRunner{
	public static void main(String[]args){
	Person personOne = new Person("Bob","Rebels");

	System.out.println(personOne.getName());
	System.out.println(personOne);

	JediKnight jediOne = new JediKnight("Luke", "Rebels", "Force Push");
	System.out.println(jediOne);
	System.out.println(jediOne.getName());

	System.out.println(personOne instanceof Person);
	System.out.println(personOne instanceof JediKnight);

	System.out.println(jediOne instanceof Person);
	System.out.println(jediOne instanceof JediKnight);

}
}