package trainerapp;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.yearOfBirth = 1980;
        System.out.println(trainer.name);
        System.out.println(trainer.yearOfBirth);

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jane Doe";
        anotherTrainer.yearOfBirth = 1981;
        System.out.println(anotherTrainer.name);
        System.out.println(anotherTrainer.yearOfBirth);
    }
}
