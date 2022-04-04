package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(10, 150, 2);
        visitor2 = new Visitor(16, 180, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkAgeAndHeightTrue(){
        assertEquals(true, rollerCoaster.isAllowed(visitor2));
    }

    @Test
    public void checkAgeAndHeightFalse(){
        assertEquals(false, rollerCoaster.isAllowed(visitor));
    }
}
