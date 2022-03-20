package objects.introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("bevásárlás", "kenyeret venni");
        System.out.println("Feladat címe: " + task.getTitle());
        System.out.println("Feladat leírása: " + task.getDescription());

        task.setDuration(60);
        System.out.println("A feladat időtartama: " + task.getDuration() + " perc");
        task.start();
        System.out.println("A feladat kezdete: " + task.getStartDateTime());
    }
}
