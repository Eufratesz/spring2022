package typesoperators.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }
}
