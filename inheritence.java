/* 
 * Name - Thomas CHerian
 * Date - 08/08/25
 * Purpose - To show inheritance.
 */
package cseb;
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("Title = " + title);
		System.out.println("Author = " + author);
		System.out.println("Price = " + price);
	}
}



class Ebook extends Book{
	double fileSize;
	Ebook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize = fileSize;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("fileSize = " + fileSize);
	}
}



class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages = numberOfPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number Of Pages = " + numberOfPages);
	}
}	
public class inheritence {
	public static void main(String[] args) {
		Ebook book1 = new Ebook("Java","Unknown",325.78,23.4);
		book1.displayDetails();
		System.out.println();
		
		PrintedBook book2 = new PrintedBook("C programming","Dennis",321.3,45);
		book2.displayDetails();
		System.out.println();
		
		
	}
}		




