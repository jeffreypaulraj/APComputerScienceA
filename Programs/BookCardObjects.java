import java.util.ArrayList;
public class BookCardObjects{
	public static void main(String[]args){

		BookCard bookCard1 = new BookCard();

		bookCard1.setAuthor("Edith Wharton");
		bookCard1.setTitle("Ethan Frome");
		bookCard1.setYearOfPublication(1850);

		System.out.println(bookCard1.getAuthor());
		System.out.println(bookCard1.getTitle());
		System.out.println(bookCard1.getYearOfPublication());

		bookCard1.setAuthor("Willa Cather");
		bookCard1.setTitle("My Antonia");
		bookCard1.setYearOfPublication(1920);

		System.out.println(bookCard1.getAuthor());
		System.out.println(bookCard1.getTitle());
		System.out.println(bookCard1.getYearOfPublication());


		ArrayList<Integer> yearPublished = new ArrayList<Integer>();
		yearPublished.add(2001);
		yearPublished.add(2003);
		yearPublished.add(2005);
		yearPublished.add(2007);
		yearPublished.add(2009);

		ArrayList<String> title = new ArrayList<String>();
		title.add("Raisin in the Sun");
		title.add("Washington Square");
		title.add("Ethan Frome");
		title.add("Red Badge of Courage");
		title.add("My Antonia");

		ArrayList<String> author = new ArrayList<String>();
		author.add("Edith Wharton");
		author.add("Stephen Crane");
		author.add("Willa Cather");
		author.add("Emily Bronte");
		author.add("Rick Riordan");

		ArrayList<String> card = new ArrayList<String>(5);
		System.out.println();
		for(int i = 0; i < 5; i++){
			BookCard book = new BookCard();
			book.setAuthor(author.get((int)(Math.random()*5)));
			book.setTitle(title.get((int)(Math.random()*5)));
			book.setYearOfPublication(yearPublished.get((int)(Math.random()*5)));
			card.add(book.toString());
		}

		for(int i = 0; i < card.size(); i++)
			System.out.println(card.get(i));
	}
}