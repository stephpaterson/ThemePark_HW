package stalls;

import attractions.Attraction;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor2;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void before(){
        playground = new Playground("Wild West", 4);
        visitor = new Visitor(7, 140, 2, visitedAttractions);
        visitor2 = new Visitor(16, 180, 20, visitedAttractions);
    }

    @Test
    public void checkIsAllowedTrue(){
        assertEquals(true, playground.isAllowed(visitor));
    }

    @Test
    public void checkIsAllowedFalse(){
        assertEquals(false, playground.isAllowed(visitor2));
    }

}
