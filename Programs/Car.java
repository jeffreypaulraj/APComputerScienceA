public class Car implements Vehicle, Comparable<Car>{

	private String make;
	private String model;

	public Car(String make, String model){
		this.make = make;
		this.model = model;
	}
	public int compareTo(Car obj){
		return 0;
	}
	public String travelType(){
		return "land";
	}
	public String toString(){
		return "This is a " + make + " " + model + ".";
	}
}