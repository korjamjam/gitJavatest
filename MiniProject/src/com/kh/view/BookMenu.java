package com.kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.BookController;
import com.kh.vo.Book;

//사용자와의 소통을 위한 입출력을 담당하는 클래스
public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	public void mainMenu() {

		System.out.println("도서관 환영");

		while (true) {

			System.out.println("메인메뉴");
			System.out.println("1. 새 도서 등록");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("9. 종료");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				try {
				this.insertBook();
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("잘못 입력했습니다.");
					System.out.println("도서추가를 실패했습니다.");
				}
				break;
			case 2:
				this.selectBookList();
				break;
			case 3:
				this.searchBook();
				break;
			case 9:
				return;
			}

		}
	
	}
	public void insertBook() {
		//도서정보를 저장
		System.out.println("=== 새 도서 추가 ===");
		System.out.println("책 정보를 입력해 주세요.");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르 : ");
		String genre = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt(); sc.nextLine();
		
		Book newBook = new Book(title, author, genre, price);
		bc.insertBook(newBook);
		
	}

	public void selectBookList() {
		System.out.println("========도서 전체 조회========");
		Book[] bookList = bc.getBookList();
		if(bookList[0] == null) {
			System.out.println("검색 된 도서가 없습니다.");
		}
		printBookList(bookList, "등록된 도서가 없습니다.");
	}
	
	public void searchBook(){
		System.out.println("\n==== 도서 검색 ====");	
		System.out.println("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] bookList = bc.searchBook(keyword);
		if(bookList[0] == null) {
			System.out.println("검색 된 도서가 없습니다.");
		}
		printBookList(bookList,"검색된 도서가 없습니다.");
	}
	public void printBookList(Book[] bookList, String emptyMsg) {
		for(Book b : bookList) {
			if(b == null)
				break;
			System.out.println(b.toString());
		}
	}
}

