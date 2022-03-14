package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {

    @Test
    @DisplayName("create theater")
    public void createTheater(){
        Theater max = new Theater("IMax", 20);
        assertEquals(max.name + " " + max.price, "IMax 20");
    }

    @Test
    @DisplayName("add new theater review")
    public void addTheaterReview(){
        Theater max = new Theater("IMax", 20);
        Review tony = new Review("it's a great place!", "Tony Regalado", 3, max, "matrix");
        max.addReview(tony);
        System.out.println(tony);
        assertEquals("Review- Body: it's a great place!', Author: 'Tony Regalado', Stars: 3, Business: 'IMax', Movie: 'matrix'", tony.toString());
    }

    @Test
    @DisplayName("add movies")
    public void addTheaterMovie(){
        Theater max = new Theater("IMax", 20);
        max.addMovie("The Matrix");
        max.addMovie("Spider-man");
        assertEquals("[The Matrix, Spider-man]", max.movieList.toString());
    }

    @Test
    @DisplayName("and and remove movies")
    public void addAndRemoveMovies(){
        Theater max = new Theater("Imax", 20);
        max.addMovie("The Matrix");
        max.addMovie("Spider-man");
        max.addMovie("Lord Of The Rings");
        max.removeMovie("Spider-man");
        assertEquals("[The Matrix, Lord Of The Rings]", max.movieList.toString());
    }

//    @Test
//    public void newTheater(){
//        Theater max = new Theater("Imax", 10);
//        Review john =
//    }

}