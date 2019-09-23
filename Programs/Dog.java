public class Dog{

	private String breed;
	private int age;

	public Dog(){
		breed = "pug";
		age = 5;
	}

	//public Dog(String dogBreed, int dogAge){
	//	breed = dogBreed;
	//	age = dogAge;
	//}

	public Dog(String breed, int age){
		this.breed = breed;
		this.age = age;
	}

	public String getBreed(){
		return breed;
	}

	public void setBreed(String newBreed){
		breed = newBreed;
	}

	public String toString(){
		return "This is a " + breed + " and it is " + age + ".";
	}
}