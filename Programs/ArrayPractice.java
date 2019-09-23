public class ArrayPractice{
	public static void main(String[]args){
//Program 1
		int[] arr = new int[10];
		double sum = 0;
		double count = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*21)+5;
			sum+= arr[i];
			count++;
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nSum: " + sum);
		System.out.println("Average: " + (sum/count));
		System.out.println("Maximum Value: " + max);
		System.out.println("Minimum Value: " + min + "\n");

		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-i-1] = temp;
		}
		for(int i = 0; i < arr.length;i++)
			System.out.print(arr[i] + " ");
System.out.println("\n");
//Program 2
		int[][] Arr = new int[5][7];
		int counter = 0;
		double sumcol = 0;
		double sumrow = 0;
		for(int i = 0; i < Arr.length; i++){
			for(int j = 0; j <Arr[0].length; j++){
				counter++;
				Arr[i][j] = counter;
				System.out.print(Arr[i][j] + "\t");
				if(j == 2)
					sumcol+=Arr[i][j];
				if(i==3)
					sumrow+=Arr[i][j];
			}
			System.out.println();
		}

		System.out.println("Average of the Third Column: " + sumcol/Arr.length);
		System.out.println("Average of the Fourth Row: " + sumrow/Arr[0].length + "\n");

		for(int i = 0; i < Arr.length; i++){
			for(int j = 0; j < Arr[0].length; j++){
				if(j == 1){
					int temp = Arr[i][j];
					Arr[i][j] = Arr[i][Arr[0].length - 1 -j];
					Arr[i][Arr[0].length - 1 -j] = temp;
				}
				int temp = Arr[0][0];
				Arr[0][0] = Arr[4][6];
				Arr[4][6] = temp;
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}

/*
-1
1
4
7
*/

/*
0
-2
-4
-6
*/

/*
5
3
1
-1
*/

