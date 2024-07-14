package csMiddle.list.book;

import java.util.ArrayList;

class Book {
    public final String author;
    public final String title;
    public final String year;

    public Book(String title, String year) {
        this.author = "Stephen Hawkings";
        this.title = title;
        this.year = year;
    }
}

class MyClass{
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("How Did It All Begin?", "2021"));
        books.add(new Book("The Theory of Everything", "2010"));
        books.add(new Book("God Created the Integers", "2006"));

        printBookArray(books);
    }

    private static void printBookArray(ArrayList<Book> books) {
        for(int i=0; i<books.size(); i++) {
            System.out.println(books.get(i).title + " written by " + books.get(i).author + " in " + books.get(i).year);
        }
    }
}
