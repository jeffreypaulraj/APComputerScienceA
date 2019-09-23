import java.util.ArrayList;
public class ObjectDemo{
	public static void main(String[]args){

		Dog dog1 = new Dog();
		//System.out.println(dog1.breed);
		System.out.println(dog1.getBreed());
		dog1.setBreed("Spaniel");
		System.out.println(dog1.getBreed());

		//dog1.breed = "Poodle";
		//System.out.println(dog1.breed);

		Dog dog2 = new Dog("Golden Doodle", 10);
		//System.out.println(dog2.breed);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(6);
		//System.out.println(list.size);

		System.out.println(dog2.toString());
	}
}