public class ArraysDay2a{
	public static void main(String[]args){

	int birthday = (int)(Math.random()*360);

	int[][] arr = new int[12][30];

	int bdayrow = birthday/12;
	int bdaycolumn = birthday%12;
	arr[bdayrow][bdaycolumn] = 1;

	int countright = 0;
	int countwrong = 0;

	while(countright < 3){
		int i = (int)(Math.random()*12);
		int j = (int)(Math.random()*30);
		if(arr[i][j] == 1)
			countright++;
		else
			countwrong++;
	}
	System.out.println(countwrong);
	}
}
