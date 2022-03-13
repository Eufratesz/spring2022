package trainerapp;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", 1980);
        Trainer anotherTrainer = new Trainer("John Doe", 1980);


        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getYearOfBirth());

        anotherTrainer.changeName("Joe Doe");
        System.out.println(anotherTrainer.getName());



    }
}
