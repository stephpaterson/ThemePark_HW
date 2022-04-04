import attractions.Attraction;
import attractions.RollerCoaster;
import attractions.RollercoasterTest;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractionList;
    ArrayList<Stall> stallList;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Big Dipper", 5);
        attractionList = new ArrayList<>();
        attractionList.add(rollerCoaster);
        iceCreamStall = new IceCreamStall("Scoops", "Mr Freeze", ParkingSpot.A1, 4);
        stallList = new ArrayList<>();
        stallList.add(iceCreamStall);
        themePark = new ThemePark(attractionList, stallList);
    }

    @Test
    public void hasAttractions(){
        assertEquals(1, themePark.getNumberOfAttractions());
    }

}
