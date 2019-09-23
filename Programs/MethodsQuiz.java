public class MethodsQuiz{
	public static void main(String[]args){

	int[] test = makeArray();
	outputArray(test);

	System.out.println("Are all of the values even: " + isArrayEven(test));

	System.out.println("Are more than half of the items even: "
	+ isMoreThanHalfEven(test));

	}
	public static int rand(){
		int a = (int)(Math.random()*10)+1;
		return a;
	}
	public static boolean isEven(int num){
		if(num%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isArrayEven(int num[]){
		for(int i = 0; i < num.length; i++){
			if(isEven(num[i]) == false)
				return false;
		}
		return true;
	}
	public static boolean isMoreThanHalfEven(int num[]){
		if(isArrayEven(num) == true)
			return true;
		else{
			int count = 0;
			for(int i = 0; i < num.length; i++){
				if(isEven(num[i]) == true)
					count++;
			}
			if(count > num.length/2)
				return true;
			else
				return false;
			}
	}
	public static int[] makeArray(){
		int a = rand();
		int b = 0;
		if (a%2 == 0)
			b = 3;
		else
			b = 6;

		int[] arr = new int[b];
		for(int i = 0; i < arr.length; i++)
			arr[i] = rand();

		return arr;
	}
	public static void outputArray(int arr[]){
		for(int i = 0; i < arr.length; i++)
			System.out.println("Num " + (i+1) + ": "+ arr[i] + " ");
		System.out.println();
	}
}