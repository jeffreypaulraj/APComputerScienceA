public class ShoeRunner{
	public static void main(String[]args){

		Shoe shoeOne = new Shoe("Nike", 10);

		System.out.println(shoeOne.getBrand());
		if((shoeOne instanceof Shoe) == true)
			System.out.println("Shoe One is an instance of Shoe.");
		else
			System.out.println("Shoe One is not an instance of Shoe.");
		if((shoeOne instanceof AthleticShoes) == true)
			System.out.println("Shoe One is an instance of Athletic Shoes.");
		else
			System.out.println("Shoe One is not an instance of Athletic Shoes.");
		if((shoeOne instanceof SignatureShoe) == true)
			System.out.println("Shoe One is an instance of Signature Shoe.");
		else
			System.out.println("Shoe One is not an instance of Signature Shoe.");

		AthleticShoes shoeTwo = new AthleticShoes("Brooks", 12, "Running", 109.99);

		System.out.println("$" + shoeTwo.getPrice());
		if((shoeTwo instanceof AthleticShoes) == true)
				System.out.println("Shoe Two is an instance of Athletic Shoes.");
		else
				System.out.println("Shoe Two is not an instance of Athletic Shoes.");
		if((shoeTwo instanceof AthleticShoes) == true)
			System.out.println("Shoe Two is an instance of Athletic Shoes.");
		else
			System.out.println("Shoe Two is not an instance of Athletic Shoes.");
		if((shoeTwo instanceof SignatureShoe) == true)
			System.out.println("Shoe Two is an instance of Signature Shoe.");
		else
			System.out.println("Shoe Two is not an instance of Signature Shoe.");


		SignatureShoe shoeThree = new SignatureShoe("Nike", 13, "Basketball", 189.99, "Michael Jordan", 4);

		System.out.println(shoeThree.getAthlete());
		if((shoeThree instanceof AthleticShoes) == true)
			System.out.println("Shoe Three is an instance of Athletic Shoes.");
		else
			System.out.println("Shoe Three is not an instance of Athletic Shoes.");
		if((shoeThree instanceof AthleticShoes) == true)
			System.out.println("Shoe Three is an instance of Athletic Shoes.");
		else
			System.out.println("Shoe Three is not an instance of Athletic Shoes.");
		if((shoeThree instanceof SignatureShoe) == true)
			System.out.println("Shoe Three is an instance of Signature Shoe.");
		else
			System.out.println("Shoe Three is not an instance of Signature Shoe.");

	}
}
//In order for something to be a subclass, it must have all the functionalities
//of the superclass. However, variables cannot call upon any methods from the superclass
//and this reduced functionality makes variables not a subclass.