import java.util.ArrayList;
public class ArrayListDay1{
	public static void main(String[]args){

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list.add((int)(Math.random()*11)+10);
		System.out.println(list);

		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i)%2 == 0)
				list1.add(list.get(i));
		}
		System.out.println(list1);

		for(int i = 0; i < list.size(); i++){
			if(list.get(i)%2 == 0)
				list.set(i, list.get(i) + 1);
		}
		System.out.println(list);
		System.out.println(swap(list));
		System.out.println(doubleit(list));
		System.out.println(concatenation(list,list1));
	}
	public static ArrayList swap(ArrayList<Integer> list){
		int temp = list.get(list.size() - 1);
		list.set(list.size()-1, list.get(0));
		list.set(0, temp);

		return list;
	}
	public static ArrayList doubleit(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i)%2 == 1)
				list.set(i, 2*list.get(i));
		}
		return list;
	}
	public static ArrayList concatenation(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < list2.size();i++)
			list1.add(list2.get(i));
		return list1;
	}
}