import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Book class representing individual books
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}

// BookCollection class representing a collection of books
class BookCollection implements Iterable<Book> {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}

// BookIterator class implementing the Iterator interface for books
class BookIterator implements Iterator<Book> {
    private int index;
    private List<Book> books;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("1984", "George Orwell"));
        collection.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        collection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        for (Book book : collection) {
            System.out.println(book);
        }
    }
}
