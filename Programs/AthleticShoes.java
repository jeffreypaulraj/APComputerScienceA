public class AthleticShoes extends Shoe{

	private String sport;
	private double price;

	public AthleticShoes(String brand, int size, String sport, double price){
		super(brand, size);
		this.sport = sport;
		this.price = price;
	}

	public String getSport(){
		return sport;
	}
	public double getPrice(){
		return price;
	}

}