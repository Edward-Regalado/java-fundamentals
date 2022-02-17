# Lab: 03 - Maps, File I/O, and Testing

## Setup

- For the first two methods in today’s lab, continue working in your `basiclibrary` directory.

- For the JS linter, create a new Java application inside of `java-fundamentals` by creating a new directory called linter, cding into it, and running `gradle init --type java-application`. Download the gates.js file, and save it in the `resources` directory within `linter`.

### Feature Tasks

#### Maps

// Daily average temperatures for Seattle, October 1-28 2017
int[][] weeklyMonthTemperatures = {
  {66, 64, 58, 65, 71, 57, 60},
  {57, 65, 65, 70, 72, 65, 51},
  {55, 54, 60, 53, 59, 57, 61},
  {65, 56, 55, 52, 55, 62, 57}
};

#### Analyzing Weather Data

- Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a `HashSet` of type `Integer` to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

#### Expected output:

High: 72
Low: 51
Never saw temperature: 63
Never saw temperature: 67
Never saw temperature: 68
Never saw temperature: 69
Write testing code for this method, and ensure that it passes.

#### Tallying Election

- Write a function called `tally` that accepts a List of Strings representing votes and returns one string to show what got the most votes.

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
Wrrite testing code for this method, and ensure that it passes.

#### File I/O

- Note the setup directions at the top of the assignment for this portion of the lab.

#### JavaScript Linter

- Write a method that reads a JavaScript file with a given `Path`, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

Don’t show an error if the line is empty.
Don’t show an error if the line ends with an opening curly brace {
Don’t show an error if the line ends with an closing curly brace }
Don’t show an error if the line contains if or else
Call that method in your main method on the file gates.js, and print out the resulting error message.

#### Testing

- Write unit tests for the map methods.
- Use JUnit to write a test for the linter.
You’ll need to create a JS file that will test each of these things!

- Test the linter on a file that contains no errors.
- Test the linter on a file that contains one error.
- Test the linter on a file that contains few errors.
- Test the linter on a file that contains many errors.
- Test the linter on an empty file.


#### Stretch Goals

- Implement another simple lint rule to the linter. (For example, make sure that the file uses only single quotes, not double quotes.)
- Allow the user to specify the file to lint from the command line when they run the application. (Gradle allows passing command line args through to the app with a flag.)
