

### 🔹 What is a Constructor?

* A **constructor** is a special method used to **initialize objects**.
* It has the **same name as the class**.
* It **does not have a return type** (not even `void`).

---

### 🔹 Types of Constructors in Java

1. **Default Constructor**

   * Provided by Java if no constructor is defined.
   * Initializes objects with **default values** (e.g., `0`, `null`, `false`).

   ```java
   class Student {
       String name;
       int age;
       // Compiler automatically provides default constructor
   }
   ```

2. **No-Argument Constructor (User-defined default)**

   * Created by the programmer with no parameters.

   ```java
   class Student {
       Student() {
           System.out.println("Constructor called!");
       }
   }
   ```

3. **Parameterized Constructor**

   * Accepts parameters to initialize objects with specific values.

   ```java
   class Student {
       String name;
       int age;
       Student(String n, int a) {
           name = n;
           age = a;
       }
   }
   ```

---

### 🔹 Key Points

* **Constructor name = Class name**.
* **No return type**.
* Called **automatically when object is created**.
* Used to **initialize data members**.
* Can be **overloaded** (multiple constructors in one class with different parameters).
* If any constructor is defined, Java does **not provide a default constructor**.

---

### 🔹 Constructor Overloading Example

```java
class Student {
    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

---

### 🔹 Difference Between Constructor and Method

| Feature     | Constructor                       | Method                |
| ----------- | --------------------------------- | --------------------- |
| Name        | Same as class name                | Any valid name        |
| Return type | No return type                    | Must have return type |
| Called by   | Automatically when object created | Called explicitly     |
| Purpose     | Initialize object                 | Perform operations    |

---

✅ **Interview Tip:**
Often asked:

* *What is a constructor?*
* *Types of constructors?*
* *Difference between constructor and method?*
* *What happens if you don’t write a constructor?* (→ Java provides a default one)
* *Can constructors be inherited?* (→ No, but child class can call parent constructor using `super()`).

