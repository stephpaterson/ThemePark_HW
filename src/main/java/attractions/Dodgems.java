package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return visitor.getAge() < 12 ? defaultPrice()/2 : defaultPrice();
    }

    public void chargeVisitor(Visitor visitor) {
        double price = priceForVisitor(visitor);
        double wallet = visitor.getMoney();
        visitor.setMoney(wallet-price);
    }
}
