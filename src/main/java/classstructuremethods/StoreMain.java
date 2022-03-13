package classstructuremethods;

public class StoreMain {

    public static void main(String[] args) {

        Store firstStore = new Store("banana");
        Store secondStore = new Store("orange");

        System.out.println(firstStore.getProduct() + ": " + firstStore.getStock());
        firstStore.store(1000);
        System.out.println(firstStore.getProduct() + ": " + firstStore.getStock());
        firstStore.dispatch(100);
        System.out.println(firstStore.getProduct() + ": " + firstStore.getStock());

        System.out.println(secondStore.getProduct() + ": "+ secondStore.getStock());
        secondStore.store(2000);
        System.out.println(secondStore.getStock());
        secondStore.dispatch(3);
        System.out.println(secondStore.getProduct() + ": "+ secondStore.getStock());


    }
}
