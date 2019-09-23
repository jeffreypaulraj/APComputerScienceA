public class ArraysDay1{
	public static void main(String[]args){

	int count = 0;
	int[] arr = new int[40];
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*30)+10;
		arr[arr.length-2] = 99;
		if(arr[i]%2 == 0)
			arr[i] = arr[i] - 2;
		if(i%2 == 1){
			arr[i]*=2;
			count++;
			if(count%2 == 0)
				arr[i] = 1;
		}
		if(arr[i]%4 == 1)
			arr[i] = 0;
		if(i%5 == 0)
			arr[i] = 5;

		System.out.print(arr[i] + " ");
	}

System.out.println();
//Program 1
	int[][] TwoArr = new int[10][10];
	for(int i = 0; i < TwoArr.length; i++){
		for(int j = 0; j < TwoArr[0].length; j++){
			TwoArr[i][j] = (i+1)*(j+1);
			System.out.print(TwoArr[i][j] + "\t");
		}
		System.out.println();
	}

System.out.println();
//Program 2
	int[][] Array2D = new int[4][4];
	int[] Arr = new int[16];
	for(int i = 0; i < Arr.length; i++)
		Arr[i] = i+1;

	for(int i = 0; i < Array2D.length; i++){
		for(int j = 0; j < Array2D[0].length; j++){
			int x = (int)(Math.random()*15)+1;
				if (Arr[x] == x){
					Array2D[i][j] = x;
					Arr[x] = 0;
			}
			System.out.print(Array2D[i][j]+ "\t");
		}
		System.out.println();
	}

}
}


/*
for(int k = 0; k < arr.length; k++){
				if(x == arr[k])
					counter++;
			}
			if(counter == 0){
				arr[j] = x;
				Array2D[i][j]
		}
*/