import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;


    public Contact(String name, String phoneNumber, String birtDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birtDate;
        this.age = toAge(birtDate);
    }

    public Contact(Contact contact) {
        this.name = contact.name;
        this.phoneNumber = contact.phoneNumber;
        this.birthDate = contact.birthDate;
        this.age = contact.age;
    }

    private int toAge(String birthDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthLocalDate = LocalDate.parse(this.birthDate, dateTimeFormatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthLocalDate, currentDate).getYears();
    }

    public int getAge() {
        return this.age;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        this.age = toAge(this.birthDate);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Contact: " + getName() + " is " + getAge() + " years old";  
    }
}
