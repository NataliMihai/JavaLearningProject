package com.mihainataliaqa.book_collection_task;

public class MainTask {
    public static void main(String[] args) {

        Book book1 = new Book("Micul print", "A.S. Exupery");
        Book book2 = new Book("De la idei la bani", "Napoleon Hill");
        Book book3 = new Book("Contele de Monte-Cristo", "A.Diuma");

        Library library001 = new Library("Carturesti MAll");
        Library library002 = new Library("Fat-Frumos");

        library001.addBook(book1);
        library001.addBook(book1);
        library001.addBook(book1);

        System.out.println("Libraria: <" + library001.getNameOfLibrary() + "> are [" + library001.getTotalNumberOfBooks() + "] carti"); ///3
        System.out.println("Libraria: <" + library002.getNameOfLibrary() + "> are [" + library002.getTotalNumberOfBooks() + "] carti"); ///0
        //
        System.out.println();
        //
        library002.addBook(book1);
        library002.addBook(book2);
        library002.addBook(book3);

        System.out.println("Acum, libraria: <" + library002.getNameOfLibrary() + "> are [" + library002.getTotalNumberOfBooks() + "] carti"); ///3
        //
        System.out.println();
        //
        //adaugam carti din lista
        library002.addBooksFromAnotherList(library001.booklist);
        System.out.println("In final, libraria: <" + library002.getNameOfLibrary() + "> are in stoc [" + library002.getTotalNumberOfBooks() + "] carti"); ///6

        System.out.println();
        //
        //vindem o carte din librarie
        library002.removeBookFromTheStock(book2);
        System.out.println("La moment, libraria: <" + library002.getNameOfLibrary() + "> are in stoc [" + library002.getTotalNumberOfBooks() + "] carti"); ///6

        System.out.println();
        //
        System.out.println("Libraria:  <" + library001.getNameOfLibrary() + "> contine in stoc urmatoarele carti: ");
        library001.displayTheBookTitles();

        System.out.println();

        System.out.println("Libraria:  <" + library002.getNameOfLibrary() + "> contine in stoc urmatoarele carti: ");
        library002.displayTheBookTitles();
    }
}
