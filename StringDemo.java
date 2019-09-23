public class StringDemo{
	public static void main(String[]args){

		String word = "Hello";
		String word2 = new String("Hello");
		String word3 = "Hello";
		String word4 = "abc";

/*
		System.out.println( word == "Hello");
		System.out.println(word == word2);
//== refers to a place in memory
		System.out.println(word == word4);
		System.out.println( word.equals("Hello"));
		System.out.println(word.equals(word2));
//.equals() refers to actual values
		System.out.println(word.indexOf("el"));
		System.out.println(word.charAt(3));
		System.out.println(word.substring(1,4));
		System.out.println(word.substring(1, word.length()));
		System.out.println(word.substring(2));
*/

		String exampleString = "ThIs is A tEst";
//Program 1
		for(int i = 0; i < exampleString.length(); i++){
			System.out.print(exampleString.charAt(i));
		}
		System.out.println();
		System.out.println();
//Program 2
		int space = 0;
		for(int i = 0; i < exampleString.length(); i++){
			if(exampleString.charAt(i) == ' '){
				space = i;
				break;
			}
		}
		System.out.println(exampleString.substring(0,space));
		System.out.println();
//Program 3
		for(int i = 0; i < space; i++){
			System.out.print(exampleString.charAt(i));
		}
		System.out.println();
//Program 4
		String reverse = "";
		for(int i = exampleString.length() - 1; i >=0; i--){
			reverse += exampleString.charAt(i);
		}
		System.out.println(reverse + "\n");
//Program 5
		char[] reverser = new char[exampleString.length()];
		for(int i = 0; i < reverser.length; i++)
			reverser[i] = exampleString.charAt(i);
		for(int i = 0; i < reverser.length/2; i++){
			char temp = reverser[reverser.length - 1 -i];
			reverser[reverser.length - 1 - i] = reverser[i];
			reverser[i] = temp;
		}
		String newReverse = "";
		for(int i = 0; i < exampleString.length(); i++)
			newReverse += reverser[i];
		System.out.println(newReverse);

	String str1 = "abc";
	String str2 = new String("abc");
	System.out.println(str1.equals(str2));
	System.out.println(str1 == str2);
	}
}