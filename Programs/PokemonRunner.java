import java.util.*;
public class PokemonRunner{
	public static void main(String[]args){

		ArrayList<Pokemon> list = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			list.add(new Pokemon((int)(Math.random()*300), "Bob"));
		}

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}