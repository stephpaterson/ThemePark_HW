import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractionList;
    private ArrayList<Stall> stallList;

    public ThemePark(ArrayList<Attraction> attractionList, ArrayList<Stall> stallList) {
        this.attractionList = attractionList;
        this.stallList = stallList;
    }


    public int getNumberOfAttractions() {
        return this.attractionList.size();
    }
}
