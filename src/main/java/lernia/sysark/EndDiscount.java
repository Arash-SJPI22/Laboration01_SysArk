package lernia.sysark;

public class EndDiscount extends BaseDiscount{

    public EndDiscount(){
        super(null);
    };

    @Override
    protected boolean isApplicable(Product product) {
        return false;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 0;
    }

    @Override
    public String getDescription(Product product) {
        return "All your discounts: ";
    }
}
