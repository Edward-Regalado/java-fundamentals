package basiclibrary;

import java.util.*;


public class Library {


    public int[] roll(int n) {
        Random rand = new Random();
        int[] diceArray = new int[n];
        for (int i = 0; i < n; i++) {
            int diceRoll = rand.nextInt(6) + 1;
            diceArray[i] = diceRoll;
        }
        return diceArray;
    }

    public boolean containsDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int averageArrayValues(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = (int) sum / array.length;
        return average;

    }
}