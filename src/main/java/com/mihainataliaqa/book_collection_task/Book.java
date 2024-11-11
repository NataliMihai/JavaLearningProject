package com.mihainataliaqa.book_collection_task;

public class Book {
    private String title;
    /// private p/u incapsularea datelor prin mostenire
    private String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }
}
