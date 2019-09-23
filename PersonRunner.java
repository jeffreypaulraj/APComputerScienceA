public class PersonRunner{
	public static void main(String[]args){

		Person1 p1 = new Person1();
		System.out.println(p1);
		p1.add();
		p1.add();
		p1.add();
		System.out.println("*P1*" + p1);

		Person1 p2 = new Person1();
		System.out.println("*P2*" + p2);
		p2.add();
		p2.add();
		System.out.println("*P2*" + p2);

		System.out.println(Person1.staticPersonCounter);
	}
}