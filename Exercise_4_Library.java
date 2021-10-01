package com.company.JAVA.Learning;

class districtLibrary{
    String[] Books;
    int no_of_books;
    districtLibrary(){
        this.Books = new String[10];
        this.no_of_books = 0;
    }
    void addBook(String book){
        Books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" Has Been Added To Library");
    }
    void issueBook(String book){
        for (int i=0; i<this.Books.length; i++){
            if (this.Books[i].equals(book)) {
                System.out.println("Book Has Been Issued");
                this.Books[i] = null;
                return;
            }
        }
        System.out.println("This Book Does Not Exit");
    }
    void returnBook(String book){
        addBook(book);
    }
    void showAvailableBooks(){
        for (String element : this.Books) {
            if (element==null){continue;}
            System.out.println("* "+element);
        }
    }
}

public class Exercise_4_Library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        districtLibrary library = new districtLibrary();
        library.addBook("Think and Grow Rich");
        library.addBook("Gaming With Style");
        library.showAvailableBooks();
        library.issueBook("Gaming With Style");
        library.showAvailableBooks();
        library.returnBook("Gaming With Style");
        library.showAvailableBooks();
    }
}
