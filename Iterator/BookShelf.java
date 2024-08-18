package Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

    public BookShelf(int MaxBookSize) {
        this.books = new ArrayList<Book>(MaxBookSize);
    }

    public Book getBook(int num) {
        return (Book) books.get(num);
    }

    public void appendBook(Book newBook) {
        books.add(newBook);
    }

    public int getTotalBooks() {
        return books.size();
    }

    @Override
    public BookShelfIterator iterator() {
        return new BookShelfIterator(this);
    }

    
}
