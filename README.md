# Cinema Ticket Booking System

A console-based Java academic group project demonstrating object-oriented programming through a cinema booking workflow.

## Features
- Register customers and browse a catalog of movies and live shows
- Search catalog items by ID and sort items by ID
- Book available items, generate tickets, and cancel a booking during confirmation
- Handle unavailable or missing items with a custom exception
- Demonstrate customer cloning and Java collections

## Technologies
Java, object-oriented programming, `ArrayList`, `TreeSet`, interfaces, inheritance, and exception handling.

## Run
Requires a Java JDK. From the repository root:

```bash
javac -d out src/cinema/*.java
java -cp out cinema.CinemaMain
```

On Windows PowerShell, the same commands work if `javac` and `java` are on your PATH.

## Project structure
Java source files are in `src/cinema/`. The entry point is `CinemaMain.java`.

## My contribution
This was a group assignment. My primary responsibility was customer and ticket management, including customer records, ticket associations, and cloning behavior.

## Notes
This is an educational console application, not a production booking platform. Booking days are demonstration values, and ticket pricing is fixed in the sample code.
