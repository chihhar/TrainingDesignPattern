package Iterator;

public class BookShelfIterator extends Iterator {
    private BookShelf bookShelf;
    private int MaxBookSize;
    private int iteratorNum = 0;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.MaxBookSize = bookShelf.getTotalBooks();
    }

    @Override
    public Boolean hasNext() {
        if (iteratorNum < MaxBookSize) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = this.bookShelf.getBook(iteratorNum);
        iteratorNum++;
        return book;
    }

}
