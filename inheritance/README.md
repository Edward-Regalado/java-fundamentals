# Composition and Inheritance, Part 1

## Overview

In today’s lab, you’ll create classes to represent reviews of restaurants.

### Setup

Within the `java-fundamentals` repo, create a directory named `inheritance`. `cd`into that directory, and `run gradle init --type java-library`.

## Feature Tasks

1. Create a class to represent a `Restaurant`. Each ``Restaurant should have a name, a number of stars between 0 and 5, and a price category (i.e. number of dollar signs).
  - Implement a Restaurant constructor.
  - Test that your `Restaurant` constructor is behaving reasonably.
  - Implement a reasonable `toString` method for `Restaurants`.
  - Write a test to create an instance of `Restaurant` and ensure that its `toString` is working properly. 

2. Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
  - Write a Review constructor.
  - Test that your constructor is working reasonably.
  Implement a reasonable toString method for Reviews.
  Write a test to create an instance of Review and ensure that its toString is working properly.