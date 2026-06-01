<h1 align="center">Maratona Java Virado no Jiraya</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-2b2b2b?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/course-DevDojo-555555?style=flat-square" alt="DevDojo" />
  <img src="https://img.shields.io/badge/status-in%20progress-808080?style=flat-square" alt="in progress" />
</p>

## About

This repository holds the Java code I write while following the **Maratona Java Virado no Jiraya**, a free Java course by **DevDojo** (William Suane). The course goes from the language fundamentals up to object oriented programming, and this repo is my hands on notebook for it: one folder per topic, each with the classes and small programs I built to practice the concept.

The study is **still in progress**. New topics are added as I move through the course, so the structure below grows over time and does not yet cover the full curriculum.

## What the course covers

The material is split into two main tracks.

**Fundamentals (introducao)**

Primitive types, operators, conditional statements, loops, arrays and multidimensional arrays. The groundwork before any object oriented work.

**Java Core (javacore)**

The object oriented part of the language, studied step by step:

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

Standard package structure used by the course:

```
src/academy/devdojo/maratonajava/
  introducao/   fundamentals, one class per lesson
  javacore/     object oriented topics, grouped by subject
```

Most Java Core topics follow a `dominio` (domain classes) and `test` (runnable examples) split, mirroring how the lessons are organized.

## How to run

Java 21 project built in IntelliJ IDEA. Open any class that has a `main()` method and run it from the IDE, or use the command line:

```bash
javac -d out src/<path>/<Class>.java
java -cp out <package>.<Class>
```
