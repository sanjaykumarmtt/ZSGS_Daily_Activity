package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Library {
	
	private List<String> books=new ArrayList<>();
	
	
	public void addBook(String bookName) {
		
		this.books.add(bookName);
		System.out.println(bookName+" This Book added SuccessFully");
	}
	public void removeBook(String bookName) {
		
		if(books.contains(bookName)) {
			books.remove(bookName);
			System.out.println(bookName+" This Book has been removed from the library record");
		}else {
			System.out.println("***Book not Found***");
		}
	}
	public List<String> getBook() {
		return books;
	}
}
