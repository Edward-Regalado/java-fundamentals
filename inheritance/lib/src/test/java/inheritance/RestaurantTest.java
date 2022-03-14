package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @DisplayName("instantiate an empty restaurant")
    @Test void createNewRestaurant() {
        Restaurant restaurant = new Restaurant();
        assertEquals(restaurant.getClass(), Restaurant.class);
    }

    @Test
    @DisplayName("instantiate a restaurant")
    void testRestaurantInstantiation(){
    Restaurant chipotle = new Restaurant("Chipotle", 10);
    assertEquals("Chipotle 10", chipotle.name + " " + chipotle.price);
    }

    @Test
    @DisplayName("add restaurant review")
    public void addRestaurantReview(){
        Restaurant chipotle = new Restaurant("Chipotle", 20);
        Review tom = new Review("great place!", "Tom Smith", 3, chipotle);
        chipotle.addReview(tom);
        assertEquals("Business- Name: 'Chipotle', Price: $20, Average Star Rating: 3.0, Total Business Reviews: 1, Reviews: [Review- Body: great place!', Author: 'Tom Smith', Stars: 3.0, Business: 'Chipotle', Movie: 'null']", chipotle.toString());
    }

    @Test
    @DisplayName("add multiple reviews")
    public void checkTotalReviews() {
        Restaurant chipotle = new Restaurant("Chipotle", 20);
        Review tom = new Review("great place!", "Tom Smith", 3, chipotle);
        Review tony = new Review("great place!", "Tony", 5, chipotle);
        Review jim = new Review("great place!", "Jim", 1, chipotle);

        chipotle.addReview(tom);
        chipotle.addReview(tony);
        chipotle.addReview(jim);
        assertEquals(3, chipotle.getTotalBusinessReviews());
        assertEquals(3.0, chipotle.getAverageStarRating());
    }

}
