# 🟡 Java Basics for Beginners

## ☕ What is Java?

- Java is an **advanced Object-Oriented Programming Language (OOP)**.
- It's designed to be simple, secure, and robust.
- In Java, **everything revolves around objects** — unlike C/C++ where we use pointers.

---

## 🔰 First Simple Java Program

```java
class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### 📝 Key Points:

- Every Java program **must be inside a class**.
- `main()` is the **starting point** of a Java program.
- `System.out.println()` prints output to the console.

---

## 🌐 Why Java is Platform-Independent?

- When we compile a Java program, it gets converted into **bytecode** (a `.class` file).
- This bytecode can **run on any machine** that has a **Java Virtual Machine (JVM)**.
- This is what makes Java **platform-independent** — write once, run anywhere.

---

## 🛠️ How Java Works?

### 🔹 Compilation Process:

1. Write your code in a file: `MyProgram.java`
2. Compile it using:

   ```
   javac MyProgram.java
   ```

   This generates a file: `MyProgram.class` (bytecode).

3. Run the program using:

   ```
   java MyProgram
   ```

### 💡 Bytecode:

- The compiled `.class` file contains **bytecode** (e.g., `10101010...`)
- This bytecode is executed by the **JVM (Java Virtual Machine)**.

---

## 🧩 Java Architecture Neutral

- In C, the size of data types like `int` can vary (2 bytes, 4 bytes).
- In Java, data types have **fixed sizes**:

  - Example: `int` is always **4 bytes**, no matter the machine.

---

## 🧰 Java Development Tools

### 🔸 JDK (Java Development Kit):

- Software used to **write and compile Java programs**.
- Contains:

  - **Javac** (Java Compiler)
  - **JRE** (Java Runtime Environment)

### 🔸 JRE (Java Runtime Environment):

- Used to **run** Java programs.
- Contains:

  - Libraries
  - JVM (Java Virtual Machine)

---

## 🖥️ Ways to Write Java Code

### 1. **Text Editor (e.g., Notepad)** + Command Prompt:

```bash
javac MyProgram.java
java MyProgram
```

### 2. **IDE (e.g., IntelliJ, Eclipse, NetBeans):**

- Easier and more productive for larger projects.
- Built-in tools like autocompletion and debugging.

---

## ✅ Advantages of Java

- ✅ 99.99% Pure **Object-Oriented Programming**
- ✅ **Multithreading** support
- ✅ **Exception Handling**
- ✅ **Portable** – bytecode can run on any OS
- ✅ Strong **security** and **memory management**
