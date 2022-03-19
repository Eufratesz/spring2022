package array.languageschool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Anne");
        Student student2 = new Student("Brian");
        Student student3 = new Student("Carla");
        Student student4 = new Student("Daniel");
        Student student5 = new Student("Eve");
        Student student6 = new Student("Fred");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println(students.size());


        student2.setActive(false);
        student4.setActive(false);
        student6.setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for(Student student : students){
            if(!student.isActive()){
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);


        System.out.println("Number of not active students: " + studentsToRemove.size());
        System.out.println("Number of active students: " + students.size());

    }
}
