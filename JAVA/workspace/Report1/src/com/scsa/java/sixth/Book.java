package com.scsa.java.sixth;

public class Book {

	private String isbn = "";
	private String title = "";
	private String author = "";
	private String publisher = "";
	private int price = 0;
	private String desc = "";

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {

		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;

	}

	public Book(String isbn, String title, String author, String publisher, int price) {

		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		char ck;
		boolean flag=true;
		
		for (int i = 0; i < isbn.length(); i++) {
			ck = isbn.charAt(i);
			
			if(ck<48 || ck>58) {
				flag = false;
				break;
			}
		}
		
		if ((isbn.length() == 5) && (flag==true)) {
			this.isbn = isbn;
		} else 
			System.out.println("isbn은 5자리 숫자입니다.");
			
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >=0) 
			this.price = price;	
		else
			System.out.println("가격에는 양수만 입력 할 수 있습니다.");
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return getIsbn()+"\t|"+getTitle()+"\t|"+getAuthor()+"|"+getPublisher()+"\t|"+getPrice()+"\t|"+getDesc();
	}

}
