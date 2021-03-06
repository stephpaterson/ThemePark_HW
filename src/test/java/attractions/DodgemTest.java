package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(10, 150, 6, visitedAttractions);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeVisitor(){
        dodgems.chargeVisitor(visitor);
        assertEquals(3.75, visitor.getMoney(), 0.1);
    }
}
