package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Jack Sparrow");
        System.out.println("Name: " + client.getName());
        client.setYear(1989);
        System.out.println("Year of birth: " + client.getYear());
        client.setAddress("New York");
        System.out.println("Address: " + client.getAddress());

        client.migrate("London");
        System.out.println("New address: " + client.getAddress());
    }


}
