package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @DisplayName("instantiate an empty review")
    @Test void testInstantiateEmptyReview(){
        Review myReview = new Review();
        assertEquals(myReview.getClass(), Review.class);
    }


    @DisplayName("instantiate a new review")
    @Test void testReview(){
        Business amc = new Business("amc", 5);
        Review myReview = new Review("great movie! ", "Tony ", 5, amc, "the matrix");
        System.out.println(myReview);
        assertEquals("Review- Body: great movie! ', Author: 'Tony ', Stars: 5.0, Business: 'amc', Movie: 'the matrix'", myReview.toString());
    }

    @Test
    void addMovies(){
        Theater theater = new Theater("amc", 10);
        theater.addMovie("the matrix");
        theater.addMovie("spider-man");
        System.out.println(theater.movieList);
        assertEquals("[the matrix, spider-man]", theater.movieList.toString());
    }


}