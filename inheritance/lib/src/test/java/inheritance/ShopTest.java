package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @DisplayName("instantiate an empty shop")
    @Test public void createEmptyShop(){
        Shop shop = new Shop();
        assertEquals(shop.getClass(), Shop.class);
    }

    @DisplayName("instantiate a new shop")
    @Test public void createShop(){
        Shop shop = new Shop("Etsy", 20);
        assertEquals("Etsy 20", shop.name + " " + shop.price);
    }

    @DisplayName("add single shop review")
    @Test public void addSingleShopReview(){
        Shop shop = new Shop("Etsy", 20);
        Review myReview = new Review("it's a great place!", "John Smith", 4, shop);
        shop.reviewList.add(myReview);
        assertEquals("[Review- Body: it's a great place!', Author: 'John Smith', Stars: 4.0, Business: 'Etsy', Movie: 'null']", shop.reviewList.toString());
    }

    @DisplayName("add multiple shop reviews")
    @Test public void addMultipleShopReviews(){
        Shop shop = new Shop("Corner Store", 10);
        Review myReview = new Review("cheap prices!", "John Smith", 5, shop);
        Review myReview2 = new Review("great selection!", "Tony Regalado", 4, shop);
        Review myReview3 = new Review("friendly staff!", "Arthur Lozano", 5, shop);
        shop.addReview(myReview);
        shop.addReview(myReview2);
        shop.addReview(myReview3);
        System.out.println(shop);
        System.out.println(shop.getAverageStarRating());
        assertEquals(4.666666507720947, shop.getAverageStarRating());
    }
}