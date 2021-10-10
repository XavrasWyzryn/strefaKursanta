public class Product {
    private String name;
    private String unit;
    private float price;
    private int amount;

    public Product(String name, String unit, float price, int amount) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
