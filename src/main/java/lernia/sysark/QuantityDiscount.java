package lernia.sysark;

public class QuantityDiscount extends BaseDiscount {
    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.quantity() >= 5;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.quantity() * 10;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product))
            return super.getDescription(product) + "Buy 5 " + product.productName() + " or more and get a 10 kr discount! ";

        return super.nextDiscount.getDescription(product);
    }
}
