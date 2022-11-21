import java.util.ArrayList;

public class Book extends Section{
	ArrayList<Author> authors;
	ArrayList<Element> contents;
	
	public Book(String title) {
		super(title);
		this.authors = new ArrayList<Author>();
		this.contents = new ArrayList<Element>();
	}

	public void print() {
		System.out.println("Book: " + this.title +"\n\n" + "Authors:");
		this.authors.forEach(Author::print);
		System.out.println();
		this.contents.forEach(Element::print);
	}

	public void addAuthor(Author author) {
		this.authors.add(author);
		
	}

	public void addContent(Element element) {
		this.contents.add(element);
		
	}

}
