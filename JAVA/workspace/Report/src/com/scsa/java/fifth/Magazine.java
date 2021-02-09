package com.scsa.java.fifth;

public class Magazine {

	String isbn;
	String title;
	String author;
	String publisher;
	int year;
	int month;
	int price;
	String desc;
	
	@Override
	public String toString() {
		return isbn+"\t|\t"+title+"\t|\t"+author+"\t|\t"+publisher+"\t|\t"+price+"\t|\t"+desc+"\t|\t"+year+"."+month;
	}
	
}
