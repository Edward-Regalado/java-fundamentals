# java-fundamentals

## Lab: 01 - Java primitives and control flow

### Feature Tasks

#### **Pluralize**

- Write a function called `pluralize` that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

#### **Flipping Coin**

- Write a function called `flipNHeads` that accepts an integer `n` and flips coins until `n` heads are flipped in a row. Simulate coin flipping by choosing a random number between `0` and `1`. Numbers below `.5` are considered tails. Numbers at and above `.5` are considered heads. Print out `heads` or `tails` on one line for each flip. Print `It took FLIPS flips to flip N heads in a row.` once `n` heads have been in a row.

#### **Command Line Clock**

- Write a method `clock` that uses Java’s built-in `LocalDateTime` object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with `CTRL-C` or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

Note that you should include the call to this method last in your main method, or else you’ll never see the results from testing your other methods.

#### To run your code

- As you finish each problem, add at least one call to that function to your `main` method. Use `javac Main.java` and `java Main` to run your code and confirm that it works.