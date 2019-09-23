import java.util.Scanner;
public class Demo{
	public static void main(String[]args){

	int myVar = 0;

	for(int i = 0; i < 10; i++){
		System.out.println("Value of i: " + i);
	}

//Program 1
	double count = 0;
	double sum = 0;

	for(int i = 2; i <=100; i+=2){
		sum+=i;
		count++;
	}

	System.out.println("Average: " + (sum/count));

	double counter = 0;
	double evenSum = 0;
	for(int i = 1; i <=100; i++){
		if(i%2 == 0){
			evenSum+=i;
			counter++;
		}
	}
	double avg = evenSum/counter;
	System.out.println("Average: " + (avg));

System.out.println();
//Program 2

	for(int i = 5; i >0; i--){
		for(int j = 0; j<i;j++)
			System.out.print("*");
		System.out.println();
	}

System.out.println();
//Program 3

	for(int i = 1; i< 5;i++){
		for(int j = 5; j > i; j--){
			System.out.print(j);
		}
		if(i%2 == 1)
			System.out.println("*");
		else
			System.out.println();
	}

System.out.println();
//Program 4a

	int Bagels = 171;
	int numGross = Bagels/144;
	int remainderGross = Bagels - 144*numGross;
	int numDozen = remainderGross/12;
	int remainderDozen = remainderGross - 12*numDozen;

	System.out.println(Bagels + " bagels are " + numGross + " gross, " + numDozen + " dozen, and " + remainderDozen + " bagels.");

System.out.println();
//Program 4b
	int aBagels = (int)(Math.random()*300) + 1;
	int anumGross = aBagels/144;
	int aremainderGross = aBagels - 144*anumGross;
	int anumDozen = aremainderGross/12;
	int aremainderDozen = aremainderGross - 12*anumDozen;

	System.out.println(aBagels + " bagels are " + anumGross + " gross, " + anumDozen + " dozen, and " + aremainderDozen + " bagels.");

System.out.println();
//Program 5
Scanner reader = new Scanner(System.in);
	System.out.print("How many dice would you like to roll: ");
	int dice = reader.nextInt();
	int diceCounter = 0;
	for(int i = 0; i < dice; i++){
		int diceRoll = (int)(Math.random()*6)+1;
		if(diceRoll == 6)
			diceCounter++;
	}
	System.out.println("The number 6 was rolled " + diceCounter + " time(s).");
	}
}