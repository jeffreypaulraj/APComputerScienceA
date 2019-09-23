import java.util.Scanner;
public class DoNow091818{
	public static void main(String[]args){

Scanner reader = new Scanner(System.in);
//Program 1
	int z = 1;
	int y = 2;
	int x = 3;
	int w = 4;
	int v = 5;
	int u = 6;

	z++;
	y+=2;
	x-=3;
	w--;
	v*=4;
	u/=5;

//Program 2
	System.out.print("ab");
	System.out.println("cd");
	System.out.print("ef");
	System.out.println("g\nh");
	System.out.println("ij");
	System.out.print("kl");
	System.out.print("mn");
	System.out.println("o\n");

//Program 3

	int a = 5;
	int b = 2;
	System.out.println(a + " divided by " + b + " is "
	+ (a/b) + " with a remainder of " + (a%b));
System.out.println();
//Program 4

	for(int i = 1; i <= 6; i++){
		for(int j = 1; j <= i; j++){
			if(i%3 == 0)
				System.out.print(j);
			else
				System.out.print(j + "" + j);
		}
		System.out.println();
	}
System.out.println();

//Program 5

	int i = 1;
	do{
		int j = 1;
		while(j <= i){
			if(i%3 == 0)
				System.out.print(j);
			else
				System.out.print(j + "" + j);
		j++;
		}
		i++;
		System.out.println();
	}while(i <=6);

//Program 6

 int dice = (int)(Math.random()*20+1);
 System.out.print("\n" + dice + ": ");
 	if(dice == 20)
 		System.out.println("Perfect Roll");
 	else if((dice <= 19) && (dice >= 15)){
 		int dice2 = (int)(Math.random()*4) +1;
 		System.out.println("\nDice 2: " + dice2);
 		System.out.println("Sum: " + (dice + dice2));
	}
	else if((dice <=9) && (dice >= 5)){
		if(dice%2 == 0)
			dice+=2;
		else
			dice--;
		System.out.println(dice);
	}
	else if((dice <= 4) && (dice>=1)){
		System.out.print("\nWould you like to reroll: ");
		String reroll = reader.nextLine();
		if(reroll.equals("yes")){
			int dice3 = (int)(Math.random()*20);
			System.out.println("Rerolled die: " + dice3);
		}
	}


	}
}