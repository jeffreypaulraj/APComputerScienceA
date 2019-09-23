//5 random numbers that are odd from 1-9
public class ArraysDoNow{
	public static void main(String[]args){

	int arr[] = new int[5];
	for(int i = 0; i < arr.length; i++){
		int x = (int)(Math.random()*8);
		if(x%2 == 1)
			arr[i] = x;
		else
			arr[i] = x + 1;

		System.out.println(arr[i]);

	}

	}
}
