package basiclibrary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;

class LibraryTest {

    ///////// LAB 02 TESTS ///////////

    //////// DICE ///////////

    @Test
    @DisplayName("roll six dice")
    void rollSixDice() {
        Library sut = new Library();
        int[] diceArray = sut.roll(6);
        System.out.println("Rolling Dice: " + Arrays.toString(diceArray));
        assertEquals(6, diceArray.length);
    }

    @Test
    @DisplayName("roll ten dice")
    void rollTenDice() {
        Library sut = new Library();
        int[] diceArray = sut.roll(10);
        System.out.println("Rolling 10 Dice: " + Arrays.toString(diceArray));
        assertEquals(10, diceArray.length);
    }


    ///////// CONTAINS DUPLICATES /////////////

    @Test
    @DisplayName("contains duplicates")
    void arrayContainsDuplicates() {
        Library sut = new Library();
        int[] myArray = new int[]{1, 2, 3, 4, 5, 3};
        boolean duplicates = sut.containsDuplicate(myArray);
        System.out.println("Contain duplicates? " + duplicates);
        assertTrue(duplicates);
    }

    @Test
    @DisplayName("does not contain duplicates")
    void arrayDoesNotContainDuplicates() {
        Library sut = new Library();
        int[] array = new int[]{1, 2, 3, 4, 5};
        boolean duplicates = sut.containsDuplicate(array);
        System.out.println("Contains duplicates? " + duplicates);
        assertFalse(duplicates);
    }

    @Test
    @DisplayName("contain duplicates IllegalArgumentException")
    void arrayContainsDuplicatesIllegalArgumentException() {
        Library sut = new Library();
        int[] array = new int[]{1};
        assertThrows(IllegalArgumentException.class, () -> sut.containsDuplicate(array));
    }



    ////////// CALCULATING AVERAGES ///////////////

    @Test
    @DisplayName("calculate average value of a single array")
    void calculateArrayAverageValues() {
        Library sut = new Library();
        int[] testArray = {33, 45, 72, 90, 44, 20, 65, 58};
        double avgValue = sut.calculateArrayAverage(testArray);
        System.out.println("average value: " + avgValue);
        assertEquals(53.375, avgValue);
    }

    @Test
    @DisplayName("calculate average value of a single array variation two")
    void calculateArrayAverageValuesSecondMethod() {
        Library sut = new Library();
        int[] testArray = {33, 45, 72, 90, 44, 20, 65, 58};
        double avgValue = sut.findAverage(testArray);
        System.out.println("average value: " + avgValue);
        assertEquals(53.375, avgValue);
    }

    @Test
    @DisplayName("calculate average of a single array with one element")
    void calculateArrayAverageWithOnlyOneElement() {
        Library sut = new Library();
        int[] array = {33, 45, 72, 90, 44, 20, 65, 58};;
        double avg = sut.calculateArrayAverage(array);
        System.out.println("average value: " + avg);
        assertEquals(53.375, avg);
    }

    @Test
    @DisplayName("calculate average of a single array with no elements: throws Illegal Argument exception")
    void calculateArrayAverageWithEmptyArray() {
        Library sut = new Library();
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> sut.calculateArrayAverage(array));
    }

    @Test
    @DisplayName("calculate array average with built-in methods")
    void calculateArrayAverageWithBuiltInMethods(){
        Library sut = new Library();
        int[] array = {33, 45, 72, 90, 44, 20, 65, 58};
        double avg = sut.findAverage(array);
        assertEquals(53.375, avg);

    }


    ////////// ARRAYS OF ARRAYS /////////////

    @Test
    @DisplayName("calculate lowest monthly average of nested arrays")
    void calculateLowestAverageInArraysOfArrays() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] lowestMonthlyTemp = sut.calculateLowestArraysOfArraysAverage(weeklyMonthTemperatures);
        assert (lowestMonthlyTemp == weeklyMonthTemperatures[2]);
    }

    @Test
    @DisplayName("calculate lowest monthly average with different size arrays")
    void calculateLowestAverageOfDifferentSizeArrays() {
        Library sut = new Library();
        int[][] differentSizesArrays = {
                {10, 14, 28, 30},
                {2, 3, 5, 6},
                {10, 1},
                {1}
        };
        int[] low = sut.calculateLowestArraysOfArraysAverage(differentSizesArrays);
        assert (low == differentSizesArrays[3]);
    }

    @Test
    @DisplayName("calculate lowest monthly average: throw illegal argument error")
    void calculateLowAverageArraysOfArraysIllegalArgError() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60}};
        assertThrows(IllegalArgumentException.class, () -> sut.calculateLowestArraysOfArraysAverage(weeklyMonthTemperatures));
    }

    @Test
    @DisplayName("calculate lowest monthly average with POSITIVE INFINITY: throw illegal argument error")
    void calculateLowAverageArraysOfArraysWithPositiveInfinityIllegalArgError() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60}};
        assertThrows(IllegalArgumentException.class, () -> sut.calculateLowestArraysOfArraysAverageWithPositiveInfinity(weeklyMonthTemperatures));
    }

    @Test
    @DisplayName("calculate lowest monthly average with POSITIVE INFINITY")
    void calculateLowAverageArraysOfArraysWithPositiveInfinity() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] low = sut.calculateLowestArraysOfArraysAverageWithPositiveInfinity(weeklyMonthTemperatures);
        assert (low == weeklyMonthTemperatures[2]);
    }

    //////// LAB 03 ////////////////

}
