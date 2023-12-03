package lernia.sysark;

public class Shop {
    public static void main(String[] args) {

        Product malk = new Product("Milk", 10, 5);
        Product goats = new Product("Goat", 2000, 10);
        Product baz = new Product("Guitarr", 50, 1);

        BaseDiscount discount = new FridayDiscount(new QuantityDiscount(new MilkDiscount((new EndDiscount()))));

        System.out.println("Product: " + malk.productName());
        System.out.println("Total amount of discount: " + discount.apply(malk) + " kr");
        System.out.println(discount.getDescription(malk));
        System.out.println();
        System.out.println("Product: " + goats.productName());
        System.out.println("Total amount of discount: " + discount.apply(goats) + " kr");
        System.out.println(discount.getDescription(goats));
        System.out.println();
        System.out.println("Product: " + baz.productName());
        System.out.println("Total amount of discount: " + discount.apply(baz) + " kr");
        System.out.println(discount.getDescription(baz));
    }
}
