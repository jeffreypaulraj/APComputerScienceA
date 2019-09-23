import java.util.ArrayList;
public class ArrayListReview{
	public static void main(String[]args){

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list.add((int)(Math.random()*10)+1);

		System.out.println(list);
		System.out.println(remove1(list));

		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list2.add((int)(Math.random()*10)+1);
		System.out.println("\n" + list);
		System.out.println(list2);
		System.out.println(combine(list,list2));

		System.out.println("\n" + list);
		System.out.println(list2);
		System.out.println(greatest(list, list2));
	}
	//Program 1
	public static ArrayList<Integer> remove1(ArrayList<Integer> list){
			ArrayList<Integer> list1 = list;
		for(int i = 0; i < list.size(); i++){
			if(list1.get(i) == 1){
				list1.remove(i);
				i--;
			}
		}
		return list1;
	}
	//Program 2
	public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++)
			list.add(list1.get(i));
		for(int i = 0; i < list2.size(); i++)
			list.add(list2.get(i));
		return list;
	}
	//Program 3
	public static ArrayList<Integer> greatest(ArrayList<Integer>list1, ArrayList<Integer> list2){
		int a = 0;
		if(list1.size() > list2.size())
			a = list1.size();
		else
			a = list2.size();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < a; i++){
			if(list1.get(i) < list2.get(i))
				list.add(list2.get(i));
			else if(list2.get(i) < list1.get(i))
				list.add(list1.get(i));
			else if(i >= list1.size())
				list.add(list2.get(i));
			else if (i >= list2.size());
				list.add(list1.get(i));
			}
			return list;
	}
}