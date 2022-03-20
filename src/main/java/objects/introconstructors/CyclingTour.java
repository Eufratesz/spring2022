package objects.introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private String description;

    private LocalDate startTime;

    private int numberOfPeople;

    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
        numberOfPeople = 0;
        kms = 0;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person){
        numberOfPeople = numberOfPeople + person;
    }

    public void ride(double km){
        kms =  kms + km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("biciklitúra", LocalDate.of(2022,1,2));

        System.out.println("Túra elején: Túra leírása: " + cyclingTour.getDescription());
        System.out.println("Túra elején: Megtett kilométer: " + cyclingTour.getKms());
        System.out.println("Túra elején: Résztvevők száma: " + cyclingTour.getNumberOfPeople());
        System.out.println("Túra elején: Indulási idő: " + cyclingTour.getStartTime());

        cyclingTour.registerPerson(10);
        System.out.println(cyclingTour.getNumberOfPeople());
        cyclingTour.registerPerson(20);
        System.out.println(cyclingTour.getNumberOfPeople());

        cyclingTour.ride(100.5);
        System.out.println(cyclingTour.getKms());
        cyclingTour.ride(150.2);
        System.out.println(cyclingTour.getKms());cyclingTour.ride(99.4);
        System.out.println(cyclingTour.getKms());

    }
}
