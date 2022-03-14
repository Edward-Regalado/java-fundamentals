package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {

    @DisplayName("instantiate an empty theater")
    @Test public void createEmptyTheater(){
        Theater max = new Theater();
        assertEquals(max.getClass(), Theater.class);
    }

    @DisplayName("instantiate a new theater")
    @Test public void createTheater(){
        Theater max = new Theater("IMax", 20);
        assertEquals(max.name + " " + max.price, "IMax 20");
    }

    @DisplayName("add new theater review without movie")
    @Test public void addTheaterReviewWithoutMovie(){
        Theater max = new Theater("IMax", 20);
        Review myReview = new Review("great seats!", "John Smith", 4, max);
        max.addReview(myReview);
        System.out.println(myReview);
        assertEquals("Review- Body: great seats!', Author: 'John Smith', Stars: 4.0, Business: 'IMax', Movie: 'null'", myReview.toString());
    }

    @DisplayName("add new theater review with movie")
    @Test public void addTheaterReviewWithMovie(){
        Theater max = new Theater("IMax", 20);
        Review myReview = new Review("it's a great place!", "Tony Regalado", 3, max, "matrix");
        max.addReview(myReview);
        System.out.println(myReview);
        assertEquals("Review- Body: it's a great place!', Author: 'Tony Regalado', Stars: 3.0, Business: 'IMax', Movie: 'matrix'", myReview.toString());
    }

    @DisplayName("add movies to movie list")
    @Test public void addTheaterMovie(){
        Theater max = new Theater("IMax", 20);
        max.addMovie("The Matrix");
        max.addMovie("Spider-man");
        assertEquals("[The Matrix, Spider-man]", max.movieList.toString());
    }

    @DisplayName("add and remove movies")
    @Test public void addAndRemoveMovies(){
        Theater max = new Theater("Imax", 20);
        max.addMovie("The Matrix");
        max.addMovie("Spider-man");
        max.addMovie("Lord Of The Rings");
        max.removeMovie("Spider-man");
        assertEquals("[The Matrix, Lord Of The Rings]", max.movieList.toString());
    }

    @DisplayName("add review and movies")
    @Test public void addReviewAndShowMovieList(){
        Theater max = new Theater("Imax", 20);
        Review myReview = new Review("great screen!", "John Smith", 5, max, "The Matrix");
        Review myReview2 = new Review("great screen!", "John Smith", 1, max, "Spider-man");
        max.addReview(myReview);
        max.addReview(myReview2);
        max.addMovie("The Matrix");
        max.addMovie("Spider-man");
        max.addMovie("Lord Of The Rings");
        System.out.println(max);
        assertEquals("[The Matrix, Spider-man, Lord Of The Rings]", max.movieList.toString());
        assertEquals("Review- Body: great screen!', Author: 'John Smith', Stars: 5.0, Business: 'Imax', Movie: 'The Matrix'", myReview.toString());
    }
}