package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {


        Prefix prefix = new Prefix("Dr");
        FirstName firstName = new FirstName("Anne");
        LastName lastName = new LastName("Smith");
        

        System.out.println(prefix.getPrefix() +" " + firstName.getFirst()+ " " + lastName.getLast());


    }
}
