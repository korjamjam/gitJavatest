package com.kh.controller;

import com.kh.vo.Book;

//controller의 역할
//vo객체를 이용해서 기능을 수행해주는 역할
public class BookController {
	
	private Book[] bookList = new Book[100];

	public BookController() {
		super();
		
		bookList[0] = new Book("아프니까 청춘이다", "최지원", "인문", 25000);
		bookList[1] = new Book("자바의 정석", "남궁섬", "기타", 30000);
		bookList[2] = new Book("대화의 기술", "김수민", "인문", 40000);
		bookList[3] = new Book("암 정복기", "최장군", "의료", 15000);
	}
	public void insertBook(Book bk) {
		//bookList에 저장
		//가장 앞쪽에 비어있는 공간(null)
		
		for(int i=0; i<bookList.length; i++) {
			if(bookList[i] == null) {
				bookList[i] = bk;
			}
			
		}
	}
	
	public Book[] getBookList() {
		return this.bookList.clone();
	}
	//keyword가 제목에 포함되어있는 도서 목록 반환
	public Book[] searchBook(String keyword) {
		Book[] searchBook = new Book[this.bookList.length]; //기존에 있던 책보다 검색하는 책이 더 많을 수는 없다.
		int index = 0;
		
		for(int i=0; i<this.bookList.length; i++) {
			if(bookList[i] == null) {
				break;
			}else if(bookList[i].getTitle().contains(keyword)) {
				searchBook[index] = bookList[i];
				index++;
			}
		}
		return searchBook;
		
	}
}
