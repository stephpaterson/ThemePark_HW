import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

//    private ArrayList<Attraction> attractionList;
//    private ArrayList<Stall> stallList;
    private ArrayList<IReviewed> parkPlaces;

//    public ThemePark(ArrayList<Attraction> attractionList, ArrayList<Stall> stallList) {
//        this.attractionList = attractionList;
//        this.stallList = stallList;
//    }
//
//
//    public int getNumberOfAttractions() {
//        return this.attractionList.size();
//    }

    public ThemePark(ArrayList<IReviewed> parkPlaces){
        this.parkPlaces = parkPlaces;
    }

    public ArrayList<Integer> getReviews() {
        ArrayList<Integer> reviews = new ArrayList<>();
        for (IReviewed place : this.parkPlaces){
            reviews.add(place.getRating());
        }
        return reviews;
    }
}
