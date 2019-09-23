public class DiceGame0914{
	public static void main(String[]args){


	int P1Points = 0;
	int P2Points = 0;
	int count = 1;
while((P1Points < 20) && (P2Points < 20)){
	int P1D1 = (int)(Math.random()*6)+1;
	int P1D2 = (int)(Math.random()*6)+1;
	int P2D1 = (int)(Math.random()*6)+1;
	int P2D2 = (int)(Math.random()*6)+1;

	if((P1D1 > P2D1) && (P1D2 > P2D2))
		P1Points+=3;
	else if((P1D1 > P2D2) && (P1D2 > P2D1))
		P1Points+=3;

	if((P2D1 > P1D1) && (P2D2 > P1D2))
		P2Points+=3;
	else if((P2D1 > P1D2) && (P2D2 > P1D1))
		P2Points+=3;

	if(P1D1 > (P2D1 +P2D2))
		P1Points+=6;
	if(P2D1 > (P1D1 + P1D2))
		P2Points+=6;

	if((P1D2 > P2D1) && (P1D2 > P2D2))
		P1Points++;
	if((P2D2 > P1D1) && (P2D2 > P1D2))
		P2Points++;
	System.out.println("\nRound " + count + ":");
	System.out.println("Player 1 Score: " + P1Points);
	System.out.println("Player 2 Score: " + P2Points);
	count++;
}
	}
	}