package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    Restaurant Chipotle = new Restaurant("Chipotle", 5, 10);

    @Test void testToString(){
        System.out.println(Chipotle.toString());
    }
}
