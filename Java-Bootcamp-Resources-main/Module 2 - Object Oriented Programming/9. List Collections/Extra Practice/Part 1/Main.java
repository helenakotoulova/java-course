public class Main {

    static Store store = new Store();
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
        Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);
        
        Book[] books = { book1, book2, book3, book4 };
        for (Book book : books) {
            store.addBook(book);
        }

        store.printStore();
        System.out.println(store.contains(book2)); // true

        store.sellBook("1984");

        store.printStore();
        System.out.println(store.contains(book2)); // false

    }
}