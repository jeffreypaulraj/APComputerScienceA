public class SignatureShoe extends AthleticShoes{

	private String athlete;
	private int model;

	public SignatureShoe(String brand, int size, String sport, double price, String athlete, int model){
		super(brand,size,sport,price);
		this.athlete = athlete;
		this.model = model;
	}

	public String getAthlete(){
		return athlete;
	}
	public int getModel(){
		return model;
	}
}