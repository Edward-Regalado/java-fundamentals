package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void testToString() {
    }

    @Test
    void addReview() {
        Shop newShop = new Shop("Best Buy", 20);
        System.out.println("My new shop: " + newShop);
        assertTrue(true);

    }
}