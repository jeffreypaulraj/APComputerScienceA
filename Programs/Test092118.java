public class Test092118{
	public static void main(String[]args){

//Program 9

	for(int i = 0; i <= 4; i++){
		for(int j = i; j <= 4; j++){
			System.out.print(j);
		if(j%2 == 0)
			System.out.print(j);
		}
		System.out.println();
	}

//Program 10
System.out.println();

	for(int i = 0; i <=4; i++){
		for(int j = 0; j <= (i*2); j++){
			System.out.print(j);
		}
		System.out.println();
	}


//Program 11
System.out.println();

	int a = (int)(Math.random()*10)+1;
	int b = (int)(Math.random()*10)+1;

	System.out.println("Sum: " + (a + b));
	System.out.println("Product: " + (a*b));
	System.out.println("Difference: " + (a - b));
	System.out.println("Quotient: " + ((double)(a)/(double)(b)));


	}
}