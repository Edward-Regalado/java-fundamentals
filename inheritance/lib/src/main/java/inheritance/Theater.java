package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Business {

    List<String> movieList = new ArrayList<>();

    public Theater(String name, int price) {
        super(name, price);

    }

    public Theater(){
        //// DEFAULT CONSTRUCTOR
    }

    public String addMovie(String movie){
        movieList.add(movie);
        return movie;
    }

    public void removeMovie(String movie){
        movieList.remove(movie);
    }

    @Override
    public String toString() {
        return "Review- " +
                "Name: '" + name + '\'' +
                ", Price: " + price +
                ", Stars: " + star +
                ", averageStarRating: " + averageStarRating +
                ", totalBusinessReviews: " + totalBusinessReviews +
                ", reviewList: " + reviewList +
                ", movieList: " + movieList;
    }
}
