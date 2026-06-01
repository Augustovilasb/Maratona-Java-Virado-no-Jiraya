# Maratona Java Virado no Jiraya

Java code I write while following the **Maratona Java Virado no Jiraya**, a free Java course by DevDojo (William Suane). The course runs from the language fundamentals up to object oriented programming, and this repository is my hands on practice for it, one folder per topic.

This study is still in progress, so the structure below grows over time and does not yet cover the full curriculum.

## What I've learned so far

**Fundamentals**

Primitive types, operators, conditional statements, loops, arrays and multidimensional arrays.

**Object oriented programming**

* Classes and objects
* Methods and method overloading
* Constructors and initialization blocks
* The static modifier
* Association between classes
* Inheritance and method overriding
* The final modifier
* Enums
* Abstract classes
* Interfaces
* Polymorphism

## Project layout

```
src/academy/devdojo/maratonajava/
  introducao/   fundamentals, one class per lesson
  javacore/     object oriented topics, grouped by subject
```

Most Java Core topics split into `dominio` (domain classes) and `test` (runnable examples), mirroring how the lessons are organized.

## How to run

Java 21 project built in IntelliJ IDEA. Open any class with a `main()` method and run it from the IDE, or use the command line:

```bash
javac -d out src/<path>/<Class>.java
java -cp out <package>.<Class>
```
