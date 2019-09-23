public class Methods1005{

	public static void printName(){
		System.out.println("Jeffrey");
	}
	public static void showSum(int i , int j){
		System.out.println(i+j);
	}
	public static int addNumbers(int i, int j){
		int sum = i + j;
		return sum;
	}
	public static int[] fillArray(int i, int j, int k){
		int[] arr = {i,j,k};
		return arr;
	}
	public static boolean isEven(int i){
		return (i%2 == 0);
	}
	public static boolean isEven(int i, int j){
			return (i%2 == 0) && (j%2 == 0);
	}
	public static void main(String[]args){
		int[] arr = fillArray(1,2,3);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		printName();
		showSum(5,7);
		System.out.println(addNumbers(5,5));
		System.out.println(isEven(67));
		System.out.println(isEven(124,522));

	}
}