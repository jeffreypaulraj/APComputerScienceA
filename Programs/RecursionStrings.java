public class RecursionStrings{
	public static void main(String[]args){

		System.out.println(practice1("abda1234sds"));
	}
	public static int practice1(String str){
		if(str.length() == 0)
			return 0;
		boolean isInteger = isInteger(Integer.parseInt(Character.toString(str.charAt(0))));
		if(isInteger == true)
			return Integer.parseInt(Character.toString(str.charAt(0))) + practice1(str.substring(1));
		else
			return practice1(str.substring(1));
	}
}