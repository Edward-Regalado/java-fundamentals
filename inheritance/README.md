# Lab 6: Composition and Inheritance, Part 1

## Overview

This project is similar to Yelp and creates reviews for Businesses. The subclasses of `Business` include `Restaurant`, `Shop` and `Theater`. Initially, you create an instance of each subclass with arguments `name` and `price`. You can then instantiate a new `Review` and pass in that `Business` instance object. 

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

3. A Review should be about a single `Restaurant`. Choose an implementation for this, and implement it. Some considerations:
  - Should a Review know which Restaurant it is about?
  - Should a `Restaurant` know which Reviews are about it?
  - Is a `Restaurant` a special type of `Review`? Is a `Review` a special type of `Restaurant`? Is there common functionality that unites them?
  - Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.

## Classes and Methods

**Business (Superclass)**

- `addReview` - takes in a `Review` object and updates the `reviewList`, `totalBusinessReviews` and calculates the `averageStarRating` for each subclass instance object.
- `toString` - prints out all the property fields for each `Business` object

**Review (class)**

- standard constructor
- `toString` - prints out all the property fields for each `Review` object.

**Restaurant (extends Business)**

- `toString` - inherits from `Business` superclass
- `addReview` - inherits form `Business` superclass

# Composition and Inheritance, Part 2

## Overview

Add new `Business` subclass -- `Shop` and `Theater` that have the same basic functionality as the `Restaurant` subclass. `Reviews` should be unique and specific to each `Business` object. `Theaters` have an optional parameter of the name of the movie the reviewer watched as well as an `array` of movies that have been added to the `Theater` instance object.

## Feature Tasks

1. The users want shops! Create a `Shop` class; a `Shop` should have a name, description, and number of dollar signs.
  - Implement a constructor for a Shop.
  - Implement a reasonable toString method for Shops.
  - Add tests for the basics of your Shop class.
2. The users also want to review shops!
  - It would be great if a `Review` could be about either a `Shop` or a `Restaurant`. Choose an implementation, and make this possible.
  - Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.
  - Write tests for this functionality.
3. The users want theaters! Create a `Theater` class; a `Theater` should have a name and list of movies currently showing there. (Strings are fine for the movies; no need to create another class.)
  - Implement a constructor for a Theater.
  - Write `addMovie` and `removeMovie` instance methods that allow the theater to update which movies are being shown.
  - Implement a reasonable toString method for Theaters.
  - Test your Theater functionality.
4. Review all the things!
  - Ensure that your `Theater` is just as reviewable as your `Restaurant` and your `Shop`.
  - Test this functionality.
5. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a `Theater`, they also want to specify which movie they saw.
  - Some reviews should now have a `String movie` instance variable, to hold which movie that reviewer is referencing.
  - Make sure that someone reviewing a `Restaurant` or a `Shop` does not have to include which movie they saw!
  - It’s also okay if someone does not want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn).
  - Add testing for any new functionality you’ve created.

## Classes and Methods

**Review(class)**

- **Updated**: implemented constructor overloading to add optional movie review for each `Theater` review instance.
  - users now can choose to add which movie they saw or leave blank.
- `toString` - prints out all the property fields for each `Review` object.

**Shop (extends Business)**

- `toString` - inherits from `Business` superclass
- `addReview`- inherits from `Business` superclass

**Theater (extends Business)**

- `addMovie` - takes a String and adds to movie list.  
- `removeMovie` - takes a String and removes that movie from the movie list array. 
- `toString` - `@Override` the `Business` super class `toString` method and returns a `String` of all `Business` fields including the movie list array.