package classstructuremethods;

public class Store {

    private String product;

    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public String getProduct() {
        return product;

    }

    public int getStock() {
        return stock;
    }

    public void store(int numberOfNewProduct){
        stock = stock + numberOfNewProduct;
    }

    public void dispatch(int minusProduct){
        stock = stock - minusProduct;
    }
}
