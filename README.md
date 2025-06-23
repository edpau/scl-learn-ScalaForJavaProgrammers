# Scala for Java Programmers — Practice Notes

I am learning Scala from the official tutorial:  
📚 https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html

This project contains my hands-on practice code and notes as I work through the tutorial using **Scala 3**, primarily inside **IntelliJ IDEA**.

---

## ✅ Topics Covered So Far

### 1. Hello World
- Used `@main def HelloWorld(args: String*)` instead of `public static void main`
- Learned that `Unit` is Scala's equivalent to `void`
- No need to wrap in a class — Scala 3 supports top-level definitions
- Entry-point `@main` generates a class with static `main` behind the scenes

### 2. Using Java Libraries
- Imported and used Java’s `LocalDate`, `DateTimeFormatter`, and `Locale`
- Interoperability is seamless — can use Java classes directly
- Example: formatted current date in French locale using Java APIs

### 3. Functions Are Objects
- Defined higher-order function `oncePerSecond(callback: () => Unit)`
- Used a lambda to pass behavior to the timer
- Learned that even functions are first-class objects in Scala

### 4. Complex Numbers (Intro to Classes)
- Defined `class Complex(real: Double, imaginary: Double)`
- Two versions:
    - With parentheses: `def im()` — called like a method
    - Without parentheses: `def im` — accessed like a field
- Overrode `toString()` method to customize output

---

## 🧠 Key Learnings So Far
- Scala 3 allows top-level `@main` methods, no class wrapping required
- Functions are objects and can be passed around as values
- Scala has cleaner interop with Java than you might expect
- Parentheses on methods matter — with or without changes call style
- Pattern matching, enums, and ADTs are powerful (up next!)

---

## 📌 Next Up
- Algebraic Data Types (ADT)
- Pattern Matching
- Tree-based expression evaluation and symbolic derivation

---

## 💻 Setup Used
- Scala 3 with `sbt`
- IntelliJ IDEA
- Scala CLI via `coursier`

---

## 🗂 File Overview
- `HelloWorld.scala` — Simple top-level entry point
- `FrenchDate.scala` — Java interop example
- `TimerAnonymous.scala` — Lambda & function object demo
- `Complex.scala` — OOP style classes and methods

---

I’ll return to this and continue the tutorial.