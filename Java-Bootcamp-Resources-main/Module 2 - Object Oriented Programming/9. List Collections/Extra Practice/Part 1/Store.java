import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return new Book(this.books.get(index));
    }

    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public void sellBook(String title) {
        // Varianta 1:
        //this.books.removeIf(book -> book.getTitle() == title);

        // Varianta 2: 
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void printStore() {
        System.out.println("Store contains: " + this.books.size() + " books:");
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
}
