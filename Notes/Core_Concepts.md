
#  Java OOPs and Core Concepts – Notes by Santhosh Raj

*A complete, easy-to-understand textbook-style guide covering Object Class, Strings, Collections, Wrapper Classes, Boxing, Unboxing, and more.*

---

##  Object Class

###  Explanation:

The **Object class** is the **root (parent)** class of all Java classes.
Every class in Java automatically extends the Object class, meaning all classes can use its methods.

###  Important Methods:

| Method       | Purpose                                                   |
| ------------ | --------------------------------------------------------- |
| `toString()` | Returns a string representation of an object              |
| `equals()`   | Compares two objects for equality                         |
| `hashCode()` | Returns a unique hash value of the object                 |
| `clone()`    | Creates a copy (duplicate) of the object                  |
| `getClass()` | Returns the runtime class of the object                   |
| `finalize()` | Called before an object is destroyed by Garbage Collector |

###  Example:

```java
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Santhosh");
        System.out.println(s); // prints Santhosh
    }
}
```

---

##  String

###  Explanation:

A **String** in Java is a sequence of characters enclosed in double quotes.
Strings are **immutable**, meaning once created, they **cannot be changed**.

###  Example:

```java
String s1 = "Hello";
String s2 = new String("World");
```

###  Common String Methods:

| Method          | Description                | Example                     |
| --------------- | -------------------------- | --------------------------- |
| `length()`      | Returns string length      | `"hello".length()` → `5`    |
| `toUpperCase()` | Converts to uppercase      | `"hi".toUpperCase()` → `HI` |
| `toLowerCase()` | Converts to lowercase      | `"HI".toLowerCase()` → `hi` |
| `charAt()`      | Returns character at index | `"abc".charAt(0)` → `a`     |
| `concat()`      | Joins two strings          | `"a".concat("b")` → `ab`    |

---

##  StringBuffer

###  Explanation:

`StringBuffer` is used to create **mutable (changeable)** strings.
It is **thread-safe**, meaning it can be used safely in multithreaded programs, but it’s a bit slower.

###  Example:

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

---

##  StringBuilder

###  Explanation:

`StringBuilder` is similar to `StringBuffer`, but it is **not synchronized** (not thread-safe).
It is **faster** and suitable for **single-threaded** environments.

###  Example:

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Rocks!");
System.out.println(sb); // Java Rocks!
```

###  Comparison Table:

| Type          | Mutable | Thread Safe | Speed  |
| ------------- | ------- | ----------- | ------ |
| String        | ❌ No    | ✅ Yes       | Slow   |
| StringBuffer  | ✅ Yes   | ✅ Yes       | Medium |
| StringBuilder | ✅ Yes   | ❌ No        | Fast   |

---

##  Collections Framework

###  Explanation:

The **Collections Framework** in Java provides **ready-made classes and interfaces** for storing and managing groups of objects efficiently.

###  Main Interfaces:

| Interface | Description                | Examples                      |
| --------- | -------------------------- | ----------------------------- |
| `List`    | Ordered, allows duplicates | `ArrayList`, `LinkedList`     |
| `Set`     | Unordered, no duplicates   | `HashSet`, `TreeSet`          |
| `Queue`   | Follows FIFO order         | `LinkedList`, `PriorityQueue` |
| `Map`     | Key-value pairs            | `HashMap`, `TreeMap`          |

###  Example:

```java
import java.util.*;
class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

---

##  Wrapper Classes

###  Explanation:

Wrapper classes are used to **convert primitive data types into objects**.
They are helpful in **Collections**, because Collections can only store **objects**, not primitives.

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |

###  Example:

```java
int a = 10;
Integer obj = Integer.valueOf(a);
```

---

## Boxing and 8️ Unboxing

###  Boxing:

Converting **primitive type → object** manually.

```java
int a = 5;
Integer b = Integer.valueOf(a); // Boxing
```

###  Unboxing:

Converting **object → primitive** manually.

```java
Integer c = new Integer(10);
int d = c.intValue(); // Unboxing
```

---

##  Auto Boxing & Auto Unboxing

Java automatically converts between **primitives and wrapper objects**.

###  Example:

```java
int x = 10;
Integer y = x; // Auto Boxing

Integer z = 20;
int w = z; // Auto Unboxing
```

---

##  Parsing

### Explanation:

**Parsing** means converting **String data into primitive data types**.

###  Example:

```java
String s = "123";
int num = Integer.parseInt(s);
System.out.println(num + 10); // 133
```

---

##  Summary Page

| Concept       | Description              | Example                  |
| ------------- | ------------------------ | ------------------------ |
| Object Class  | Parent of all classes    | `toString(), equals()`   |
| String        | Immutable text data      | `"Hello"`                |
| StringBuffer  | Mutable & Thread-safe    | `append(), delete()`     |
| StringBuilder | Mutable & Fast           | `append(), insert()`     |
| Collections   | Manage groups of objects | `ArrayList, HashSet`     |
| Wrapper Class | Primitive ↔ Object       | `int ↔ Integer`          |
| Boxing        | Primitive → Object       | `Integer.valueOf(5)`     |
| Unboxing      | Object → Primitive       | `obj.intValue()`         |
| Auto Boxing   | Automatic wrapping       | `Integer i = 10;`        |
| Auto Unboxing | Automatic unwrapping     | `int a = i;`             |
| Parsing       | String → Primitive       | `Integer.parseInt("10")` |

---

Would you like me to include **diagrams** (like OOP hierarchy, String memory model, or Collection architecture) and regenerate the PDF with them for a **more textbook-style visual version**?
