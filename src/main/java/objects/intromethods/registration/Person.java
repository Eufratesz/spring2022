package objects.intromethods.registration;

import java.time.LocalDate;

public class Person {

    public String name;

    public LocalDate dateOfBirth;

    public String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "name: " + name + ", date of birth: " + dateOfBirth + ", email: " + email ;
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }
}
