# Library-Management-System

This is where you can start to get familiar with the problem and what you need to run it. This codebase is used during pairing session for JOI initiative. It's focused on identifying code smells, refactoring and testing legacy codebase while promoting conversations.

## Problem Statement:
We have an existing library management system application, with a small set of books and users details.

### Book Data Table:

| BookId | Title                                |  Author   |  Genre   | Publication Year    | Availability |
|--------|--------------------------------------|-----|-----|-----|--------------|
| 1      | Harry Potter and the Sorcerer's Stone | J.K. Rowling    | Fantasy    | 1997    | 10           |
| 2      | Harry Potter and the Chamber of Secrets |   J.K. Rowling  |  Fantasy   | 1998    | 0            |
| 3      | To Kill a Mockingbird                |  Harper Lee               | Fiction           |    1960     | 8            |
| 4      | The Great Gatsby                     |    F. Scott Fitzgerald             | Classic      |   1925      | 6            |
| 5      | Alice's Adventures in Wonderland     |         Lewis Carroll         |  Fiction         |    1865     | 0            |
| 6      | Pride and Prejudice                                     |     Jane Austen            |     Romance       |  1813       | 4            |
| 7      | The Catcher in the Rye                                  |      J.D. Salinger           |   Coming-of-age         |   1951      | 0            |

## Technology used
* Java
* Gradle - build tool
* JUnit - unit testing framework

## Before the interview
Get familiar with the codebase! Make sure you have the necessary dependencies installed, and that you are able to run the tests.

## What you need to run it
* [Java 1.8](https://adoptopenjdk.net/?variant=openjdk8)

## Build
```console
./gradlew clean build
```

## Run Tests
```console
./gradlew test
```

## Run the Sample Application
To understand how this library would be used you can check the main method in the LibraryManagementSystem class. If you want to see the results, run:
```console
./gradlew run
```
