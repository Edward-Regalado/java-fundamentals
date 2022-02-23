package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {

    @Test public void createTheater(){
        Theater newTheater = new Theater("AMC", 10);
        System.out.println(newTheater);
        assertTrue(true);
    }

}