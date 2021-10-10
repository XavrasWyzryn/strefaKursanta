public class Warehouse {
    private Product[] products = new Product[1000];
    private Delivery nextDelivery;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Delivery getNextDelivery() {
        return nextDelivery;
    }

    public void setNextDelivery(Delivery nextDelivery) {
        this.nextDelivery = nextDelivery;
    }
}
