package lernia.sysark;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FridayDiscount extends BaseDiscount {
    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
        //return true;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price() * 0.1;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product))
            return super.getDescription(product) + "Friday discount of 10%! ";

        return super.getDescription(product);
    }
}
