/*
Write a Java program that, given a list of books, prints the title of books whose publication
year is between 2000 and 2022 (including 2000, 2022). Otherwise the program raises an
exception and prints custom message. Complete the program as specified below.
b" Class PublicationYearOutOfBoundsException extends the Exception class and should
have the following member:
b Constructor public PublicationYearOutOfBoundsException(String t) that

takes the title of the book as argument. The constructor, initializes the error mes-
sage as "Publication year of <book-title> is outside the acceptable range".

b" Class Book has/should have the following members:
b Private instance variables String title and int publicationYear
b Constructor to initialize these variables
b Method checkAndGetTitle should return the title of the book if the publicationYear
is within the given limits. Otherwise, it should throw PublicationYearOutOfBoundsException.
b" Class ExceptionTest has the main method. It takes the title and publicationYear
of four books as input, and invokes the method checkAndGetTitle of class Book to
produce the specified output.
What you have to do
b" Define class PublicationYearOutOfBoundsException
b" Define method checkAndGetTitle() in class Book
*/


import java.util.Scanner;
import java.util.ArrayList;
//Define class PublicationYearOutOfBoundsException
class PublicationYearOutOfBoundsException extends Exception{
	public PublicationYearOutOfBoundsException(String message){
		super("Publication year of"+ message +"is outside the acceptable range");
	}
}
class Book {
	private String title;
	private int publicationYear;
	public Book(String t, int year) {
		title = t;
		publicationYear = year;
	}
	public String checkAndGetTitle() throws PublicationYearOutOfBoundsException {
//Complete definition of method checkAndGetTitle
		if (2000>publicationYear || publicationYear>2022) {
			throw new PublicationYearOutOfBoundsException(title);
		}
		return title;
			
		


	}
}
public class prac7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Book b = new Book(sc.next(), sc.nextInt());
			bookList.add(b);
		}
		for (Book b : bookList) {
			try {
				String title = b.checkAndGetTitle();
				System.out.println(title);
			} catch (PublicationYearOutOfBoundsException pe) {
				System.out.println(pe.getMessage());
			}
		}
		sc.close();
	}
}