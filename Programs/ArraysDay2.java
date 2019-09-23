public class ArraysDay2{
	public static void main(String[]args){

	int[][] arr = new int[6][6];

	int count = 0;
	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[0].length; j++){
			count++;
		}
	}


	int[] Array = new int[2];
	for(int i = 0; i < Array.length; i++)
		Arr[i] = count/2;

	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[0].length; j++){
			if(count1 == 0){
				arr[i][j] = 2;
				count2--;
			}
			else if(count2 == 0){
				arr[i][j] = 1;
				count1--;
			}
			else{
				arr[i][j] = (int)(Math.random()*2)+1;
				if(arr[i][j] == 1)
					count1--;
				else if(arr[i][j] == 2)
					count2--;
			}
		}
	}

	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[0].length; j++){
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

	}
}