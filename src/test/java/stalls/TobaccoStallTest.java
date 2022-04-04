package stalls;

import attractions.Attraction;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        visitor = new Visitor(18, 182, 20, visitedAttractions);
        visitor2 = new Visitor(15, 156, 15, visitedAttractions);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckAgeTrue(){
        assertEquals(true, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void canCheckAgeFalse(){
        assertEquals(false, tobaccoStall.isAllowed(visitor2));
    }
}
