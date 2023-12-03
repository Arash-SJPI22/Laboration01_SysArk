package lernia.sysark;

public class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.productName().equals("Milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price() * 0.05;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product))
            return super.getDescription(product) + "5% discount on milk! " ;

        return super.nextDiscount.getDescription(product);
    }
}
