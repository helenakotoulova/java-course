import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);
    
    
        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
    
    
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
    
    
        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    

    }
    
    public static boolean isNullOrBlank(String str) {
        return (str.isBlank() || str == null);
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        return issueNumber <= 0;
    }

    public static boolean incorrectPublicationYear(int publicationYear) {
        return publicationYear <= 0;
    }
    
    public static String promptForTitle(Scanner scanner) {
        while (true) {
            try {
                System.out.print("\nPlease enter a valid title: ");
                String title = scanner.nextLine();
                if (isNullOrBlank(title)) {
                    throw new IllegalArgumentException("Title should not be blank or null.");
                } else {
                    return title;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            try {
                System.out.print("\nPlease enter a valid publisher: ");
                String publisher = scanner.nextLine();
                if (isNullOrBlank(publisher)) {
                    throw new IllegalArgumentException("Publisher should not be blank or null.");
                } else {
                    return publisher;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            try {
                    System.out.print("\nPlease enter a valid issue number: ");
                if (scanner.hasNextInt()) {
                    int issueNumber = scanner.nextInt();
                    if (incorrectIssueNumber(issueNumber)) {
                        throw new IllegalArgumentException("Issue number should be greater than 0.");
                    }
                    return issueNumber;
                } else {
                    throw new IllegalArgumentException("Issue number should be number.");
                }
            } catch (IllegalArgumentException e) {
                 System.out.println(e.getMessage());
            }
            
        }
    }

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            try {
                 System.out.print("\nPlease enter a valid publication year: ");
                if (scanner.hasNextInt()) {
                    int publicationYear = scanner.nextInt();
                    if (incorrectPublicationYear(publicationYear)) {
                        throw new IllegalArgumentException("Publication year should be greater than 0.");
                    }
                    return publicationYear;
                } else {
                    throw new IllegalArgumentException("Publication year should be number.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
           
        }
    }
        
}