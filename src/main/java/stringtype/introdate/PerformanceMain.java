package stringtype.introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceMain {

    public static void main(String[] args) {

        Performance performance = new Performance(LocalDate.of(2022,3,14), "Bon Jovi",
                LocalTime.of(10,20), LocalTime.of(14,30));

        System.out.println(performance.getInfo());
    }
}
