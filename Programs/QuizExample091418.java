public class QuizExample091418{
	public static void main (String[]args){

//Program 8

	for(int i = 0; i <= 8; i+=2){
		for(int j = i; j<=9; j++)
			System.out.print(j);
		System.out.println(":" + i);
	}

//Program 9

	int diceA = (int)(Math.random()*6)+1;
	int diceB = (int)(Math.random()*6)+1;

	System.out.println("Dice 1 rolled a " + diceA + ".");
	System.out.println("Dice 2 rolled a " + diceB + ".");
	System.out.println("The sum of the two die is " + (diceA + diceB));
	System.out.println("The product of the two die is " + (diceA*diceB));
	if(diceA > diceB)
		System.out.println("The difference of the two die is " + (diceA - diceB));
	else
		System.out.println("The difference of the two die is " + (diceB - diceA));

	}
}