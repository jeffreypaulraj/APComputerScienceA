public class Cat{

	private String breed;
	private String name;
	private int age;

	public Cat(){
		breed = "sdaj";
		name = "adsjkl";
		age = 12;
	}

	public Cat(String breed, String name, int age){
		this.breed = breed;
		this.name = name;
		this.age = age;
	}

	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}

	public void setBreed(String newBreed){
		breed = newBreed;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void setName(String newName){
		name = newName;
	}

}