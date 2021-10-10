import java.util.Date;

public class GroceryShopOnline {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Delivery nextDelivery = new Delivery();
        nextDelivery.setDeliveryDate(new Date());
        nextDelivery.setDeliveryPrice(199.99f);

        Supplier nonEditableSupplier = new Supplier(
                "You can't edit me",
                "ul. Kwiatowa 6",
                3456789098l);
        nonEditableSupplier.getCompanyName();
        nonEditableSupplier.getTaxID();
        System.out.println(nonEditableSupplier);
        Supplier deliverySupplier = new Supplier(
                "Mleczarnia Szczesliwa Krowa",
                "ul. Kwiatowa 5",
                2234567879l);
        Supplier anotherSupplier = new Supplier(
                "Serowarnia Naturalna",
                "ul. Miodowa 14",
                3456677654l);
        nextDelivery.setSupplier(deliverySupplier);

        Product product0 = new Product("Mleko", "Karton",
                2.50f, 5);
        System.out.println(product0);
        Product product1 = new Product("Ser", "Gram",
                22.40f, 22);
        Product product2 = new Product("Pomidor", "Kilogram",
                7.03f, 60);
        Product product3 = new Product("Cebula", "Kilogram",
                2.70f, 40);
        Product[] products = new Product[4];
        products[0] = product0;
        products[1] = product1;
        products[2] = product2;
        products[3] = product3;

        nextDelivery.setDeliveredProducts(products);
        warehouse.setNextDelivery(nextDelivery);
    }
}
