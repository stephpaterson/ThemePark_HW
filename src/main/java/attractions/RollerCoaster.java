package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        return visitor.getAge()>12 && visitor.getHeight()>145 ;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return visitor.getHeight() > 200 ? defaultPrice()*2 : defaultPrice();
    }

    public void chargeVisitor(Visitor visitor) {
        double price = priceForVisitor(visitor);
        double wallet = visitor.getMoney();
        visitor.setMoney(wallet-price);
    }

}
