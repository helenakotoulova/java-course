import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");

        Contact copyContact1 = new Contact(contact1);
        Contact copyContact2 = new Contact(contact3);

        System.out.println(contact1.getAge());

        contact1.setBirthDate("1980-01-01");

        System.out.println(contact1.getAge());

        Contact[] contacts = { contact1, contact2 };

        //ContactManager contactManager1 = new ContactManager({contact1, contact2}); // INCORRECT
        ContactManager contactManager2 = new ContactManager(new Contact[] { contact1, contact2 });
        ContactManager contactManager3 = new ContactManager(contacts);

        Contact obtainedContact = contactManager2.getContact(0);
        obtainedContact.setBirthDate("2023-01-01");
        contactManager2.setContact(0, obtainedContact);

        contactManager2.printContacts();

        ContactManager contactManager4 = new ContactManager(contactData());

    }
    
    public static Contact[] contactData() {
        return new Contact[] {
                new Contact("John Doe", "555-123-4567", "1985-01-01"),
                new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
                new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
                new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
                new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
                new Contact("Diana White", "555-333-4444", "1997-11-18"),
                new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
                new Contact("Fiona Black", "555-777-8888", "2002-10-31")
        };
    }
    

}
