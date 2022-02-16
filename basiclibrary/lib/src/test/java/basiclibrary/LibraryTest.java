package basiclibrary;
import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class LibraryTest {

    @Test void rollMyDice(){
        Library sut = new Library();
        int[] diceArray = sut.roll(5);
        System.out.println("Rolling Dice: " + Arrays.toString(diceArray));
   }

   @Test void arrayContainsDuplicates(){
        Library sut = new Library();
        int[] myArray = new int[]{1, 2, 3, 4, 5, 3};
        boolean duplicates = sut.containsDuplicate(myArray);
        System.out.println("Does array contain duplicates? " + duplicates);
   }

   @Test void calculateAverageOfArrayValues(){
       Library sut = new Library();
       int[] testArray = {33, 45, 72, 90, 44, 20, 65, 58};
       int averageValue = sut.averageArrayValues(testArray);
       System.out.println("Average Value: " + averageValue);
   }

}
