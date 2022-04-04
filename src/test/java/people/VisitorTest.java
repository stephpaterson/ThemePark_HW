package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Attraction rollerCoaster;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Loop de loop", 3);
        visitedAttractions = new ArrayList<>();
        visitor = new Visitor(14, 1.2, 40.0, visitedAttractions);

    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddVisitedAttraction(){
        visitor.addVisitedAttraction(rollerCoaster);
        assertEquals(1, visitor.getNumberOfVisitedAttractions());
    }
}
