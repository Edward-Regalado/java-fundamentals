# Lab: 02 - Arrays, Loops, Imports and ArrayLists


## Overview

- This lab is dedicated to creating, interacting with and manipulating arrays in Java. 
- Arrays in Java have a fixed size. Arrays are created with a certain size, and they never shrink or grow.
- Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.

## Feature Tasks

#### **Rolling Dice**

- Write a method called `roll` that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

#### **Contains Duplicates**

- Write a method called `containsDuplicates` that returns true or false depending on whether the array contains duplicate values.

#### **Calculating Averages**

- Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

#### **Arrays of Arrays**

- Given an array of arrays, calculate the average value for each array and return the array with the lowest average.

#### **Testing**

- Use JUnit to write at least one test for each of the Feature Tasks.
- Your tests should ensure that each of your methods work correctly.

- [Root Directory](/lib/src/main/java/basiclibrary/Library.java)

## lab 03: Maps, File I/O, and Testing

### Setup

- For the first two methods in today’s lab, continue working in your basiclibrary directory.

- For the JS linter, create a new Java application inside of java-fundamentals by creating a new directory called 
linter, cd into it, and run `gradle init --type java-application`. Download the gates.js file, and save it in the 
`resources` directory within linter.

### Feature Tasks

### Maps

```
// Daily average temperatures for Seattle, October 1-28 2017
int[][] weeklyMonthTemperatures = {
{66, 64, 58, 65, 71, 57, 60},
{57, 65, 65, 70, 72, 65, 51},
{55, 54, 60, 53, 59, 57, 61},
{65, 56, 55, 52, 55, 62, 57}
};
```

### Analyzing Weather Data

- Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a 
`HashSet` of type `Integer` to keep track of all the unique temperatures seen. 
- Finally, iterate from the `min temp` to the `max temp` and create a `String` containing any `temperature` not seen during the month. Return that String.

Expected output:

```
High: 72
Low: 51
Never saw temperature: 63
Never saw temperature: 67
Never saw temperature: 68
Never saw temperature: 69
```


### Tallying Election

- Write a function called tally that accepts a List of Strings representing votes and returns one string to show what 
got the most votes.

```
// within your main method...
List<String> votes = new ArrayList<>();
votes.add("Bush");
votes.add("Bush");
votes.add("Bush");
votes.add("Shrub");
votes.add("Hedge");
votes.add("Shrub");
votes.add("Bush");
votes.add("Hedge");
votes.add("Bush");

String winner = tally(votes);
System.out.println(winner + " received the most votes!");
```