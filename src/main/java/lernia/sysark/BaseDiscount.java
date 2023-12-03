package lernia.sysark;

public abstract class BaseDiscount implements Discount{

    protected final Discount nextDiscount;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }
    protected abstract boolean isApplicable(Product product);
    protected abstract double calculateDiscount(Product product);

    @Override
    public double apply(Product product) {
        double totalDiscount = 0;

        if (isApplicable(product)) {
            totalDiscount = calculateDiscount(product);
        }

        return nextDiscount == null ? totalDiscount : totalDiscount + nextDiscount.apply(product);
    }

    @Override
    public String getDescription(Product product){

        return nextDiscount.getDescription(product);
    }
}
