public class BookCard{

	private String author;
	private String title;
	private int yearOfPublication;

	public BookCard(){
		author = "asdsahkd";
		title = "sdajlksadj";
		yearOfPublication = 2018;
	}

	public BookCard(String author, String title, int yearOfPublication){
		this.author = author;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
	}

	public String getAuthor(){
		return author;
	}
	public void setAuthor(String newAuthor){
		author = newAuthor;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public int getYearOfPublication(){
		return yearOfPublication;
	}
	public void setYearOfPublication(int newYearOfPublication){
		yearOfPublication = newYearOfPublication;
	}
	public String toString(){
		return "\"" + title + "\" is by " + author + " and was published by " + yearOfPublication + ".";
	}
}