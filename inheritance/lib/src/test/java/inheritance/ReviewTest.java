package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {
    Review myReview = new Review("Yummy! ", "Tony Regalado ", 5);

    @Test void testPrintOut(){
        System.out.println(myReview.toString());
    }
}