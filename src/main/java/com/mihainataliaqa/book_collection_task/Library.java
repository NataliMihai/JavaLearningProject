package com.mihainataliaqa.book_collection_task;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> booklist;

    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.booklist = new ArrayList<>();

    }


    public void addBook(Book book) {
        booklist.add(book);
        System.out.println("The book has been added to the library stock: " + book.getTitle());
    }

    public void addBooksFromAnotherList(List<Book> importList) {
        booklist.addAll(importList);
        System.out.println("The list of books are added to the library stock! ");
    }

    public int getTotalNumberOfBooks() {
        return booklist.size();
    }

    public String getNameOfLibrary() {
        return libraryName;
    }

    public void removeBookFromTheStock(Book book) {
        if (booklist.remove(book)) {
            System.out.println("The book <<" + book.getTitle() + ">> has been removed.");
        } else {
            System.out.println("The book <<" + book.getTitle() + ">> has not been found.");
        }
    }

    // выводим список книг в магазине
    public void displayTheBookTitles() {
        for (int i = 0;  i < booklist.size();  i++) {
            int nr = i + 1;
            System.out.println(nr + ". " + booklist.get(i).getTitle());
        }
    }

}
