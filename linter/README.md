# Lab: 03 - Maps, File I/O, and Testing

### Feature Tasks

### File I/O

- Note the setup directions at the top of the assignment for this portion of the lab.

#### JavaScript Linter

- Write a method that reads a JavaScript file with a given `Path`, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

- Don’t show an error if the line is `empty`.
- Don’t show an error if the line ends with an opening curly brace `{`
- Don’t show an error if the line ends with a closing curly brace `}`
- Don’t show an error if the line contains `if` or `else`
- Call that method in your main method on the file `gates.js`, and print out the resulting error message.

#### Testing

- Write unit tests for the map methods.
- Use JUnit to write a test for the linter.
You’ll need to create a JS file that will test each of these things!

- Test the linter on a file that contains `no errors`.
- Test the linter on a file that contains `one error`.
- Test the linter on a file that contains `few errors`.
- Test the linter on a file that contains `many errors`.
- Test the linter on an `empty` file.

### Collaborations & Credit

- Hambalieu Jallow and Joshua McCluskey