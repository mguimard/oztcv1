### ✅ Question 1:

**What is the purpose of a sealed class in Java?**

A. To allow any class to inherit from it freely
B. To prevent all forms of inheritance
C. To restrict which classes can inherit or implement it
D. To create immutable objects only

---

### ✅ Question 2:

**Which of the following is a valid modifier for a subclass of a sealed class?**

A. `final`
B. `sealed`
C. `non-sealed`
D. All of the above

---

### ✅ Question 3:

**Given the following code, what will happen?**

```java
public sealed class Animal permits Dog {
    // ...
}

public class Dog extends Animal {
    // ...
}
```

A. Compiles successfully
B. Compilation error: Dog must be declared final, sealed, or non-sealed
C. Compilation error: permits clause is not allowed
D. Runtime exception due to missing modifier in Dog

---

### ✅ Question 4:

**Which of the following statements about `non-sealed` classes is TRUE?**

A. A `non-sealed` class can extend a sealed class and prevent further subclassing
B. A `non-sealed` class must also use a `permits` clause
C. A `non-sealed` class allows unrestricted subclassing
D. A `non-sealed` class must be abstract

---

### ✅ Question 5:

**Choose the correct usage of the `permits` clause:**

A. A sealed class must use `permits`, unless all permitted subclasses are in the same file
B. `permits` is optional if all permitted subclasses are nested
C. A sealed interface can use `permits`
D. All of the above

---

### ✅ Question 6:

**What will be the result of compiling the following code?**

```java
public sealed class Shape permits Circle, Square {}

public final class Circle extends Shape {}

public class Square extends Shape {}
```

A. Compiles successfully
B. Compilation error: `Square` must be `final`, `sealed`, or `non-sealed`
C. Compilation error: `Circle` must not be `final`
D. Runtime error when using `Square`

---

### ✅ Question 7:

**Which line causes a compilation error in the code below?**

```java
public sealed interface Vehicle permits Car, Bike {}

public non-sealed class Car implements Vehicle {}

public class Bike implements Vehicle {}
```

A. Line 1 (interface declaration)
B. Line 2 (Car)
C. Line 3 (Bike)
D. None – it compiles fine

---

### ✅ Question 8:

**How can the following code be fixed to compile successfully?**

```java
public sealed class Animal permits Dog, Cat {}

public final class Dog extends Animal {}

public class Cat extends Animal {}
```

A. Remove `sealed` from `Animal`
B. Make `Cat` `final`, `sealed`, or `non-sealed`
C. Add a `permits` clause to `Cat`
D. Make `Animal` abstract

---

### ✅ Question 9:

**What does the following code demonstrate?**

```java
public sealed class Message permits TextMessage {}

public final class TextMessage extends Message {}

// Later in the code
Message msg = new TextMessage();
if (msg instanceof TextMessage tm) {
    System.out.println("Text: " + tm);
}
```

A. It shows how to use sealed classes with pattern matching
B. It shows an invalid use of pattern matching
C. It demonstrates dynamic sealing at runtime
D. It causes a compilation error because `TextMessage` is `final`

---

### ✅ Question 10:

**What will happen if you try to add a new subclass to this sealed class in a different package?**

```java
// File: shapes/Shape.java
package shapes;

public sealed class Shape permits Circle, Rectangle {}

// File: other/Hexagon.java
package other;

public final class Hexagon extends shapes.Shape {}
```

A. Compiles and runs correctly
B. Compilation error: `Hexagon` not listed in `permits`
C. Compilation error: `Hexagon` not in the same package or module
D. Both B and C
