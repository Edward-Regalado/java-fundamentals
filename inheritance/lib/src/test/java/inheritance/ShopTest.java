package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test public void createShop(){
        Shop shop = new Shop("Etsy", 20);
        assertEquals("Etsy 20", shop.name + " " + shop.price);
    }

    @Test public void addShopReview(){
        Shop shop = new Shop("Etsy", 20);
        Review myReview = new Review("it's a great place!", "John Smith", 4, shop);
        shop.reviewList.add(myReview);
        assertEquals("[Review- Body: it's a great place!', Author: 'John Smith', Stars: 4, Business: 'Etsy', Movie: 'null']", shop.reviewList.toString());
    }
}