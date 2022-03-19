package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyTypes {

    public void printStudyGroups(List<String> students) {

        for (String student : students) {
            if (student.length() <= 10) {
                System.out.println(student + ": group one");
            } else {
                System.out.println(student + ": group two");
            }
        }
    }

    public static void main(String[] args) {
        StudyTypes studyTypes = new StudyTypes();

        List<String> students = Arrays.asList("Nagy Péter", "Árokszállási Szimonetta", "Kis Pál",
                "Jósvafalvi Henrietta", "Szentágotai-Kis Józsefné", "Galambvári-Szabó Annamária");


        studyTypes.printStudyGroups(students);
    }
}
