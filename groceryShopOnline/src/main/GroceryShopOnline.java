import java.util.Date;

public class GroceryShopOnline {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Delivery nextDelivery = new Delivery();
        nextDelivery.setDeliveryDate(new Date());
        nextDelivery.setDeliveryPrice(199.99f);

        Supplier deliverySupplier = new Supplier();
        deliverySupplier.setAddress("ul. Kwiatowa 5");
        deliverySupplier.setCompanyName("Mleczarnia Szczesliwa Krowa");
        deliverySupplier.setTaxID(2234567879l);
        nextDelivery.setSupplier(deliverySupplier);

        Product product0 = generateProduct("Mleko", "Karton",
                5, 2.50f);
        Product product1 = generateProduct("Ser", "Gram",
                350, 22.40f);
        Product product2 = generateProduct("Pomidor", "Kilogram",
                60, 7.03f);
        Product product3 = generateProduct("Cebula", "Kilogram",
                40, 2.70f);
        Product[] products = new Product[4];
        products[0] = product0;
        products[1] = product1;
        products[2] = product2;
        products[3] = product3;

        nextDelivery.setDeliveredProducts(products);
        warehouse.setNextDelivery(nextDelivery);
    }

    private static Product generateProduct(String name,
                                           String unit,
                                           int amount,
                                           float price) {
        Product product = new Product();
        product.setAmount(amount);
        product.setName(name);
        product.setUnit(unit);
        product.setPrice(price);
        return product;
    }
}
