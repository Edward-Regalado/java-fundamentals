/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {
    @Test void createNewBusiness() {
        Business sut = new Business("BestBuy ", 30);
        System.out.println(sut.toString());
        assertTrue(true);
    }
}
