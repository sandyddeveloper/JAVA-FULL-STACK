# Data Types

In Java, **data types** are divided into two main categories:

---

## 🔹 1. **Primitive Data Types**

Java has 8 built-in (primitive) data types:

| Type      | Size    | Description                          | Example             |
| --------- | ------- | ------------------------------------ | ------------------- |
| `byte`    | 1 byte  | Small integer (-128 to 127)          | `byte b = 10;`      |
| `short`   | 2 bytes | Larger than byte (-32,768 to 32,767) | `short s = 1000;`   |
| `int`     | 4 bytes | Default integer (-2B to 2B)          | `int i = 12345;`    |
| `long`    | 8 bytes | Very large integers                  | `long l = 123456L;` |
| `float`   | 4 bytes | Decimal numbers (single precision)   | `float f = 5.5f;`   |
| `double`  | 8 bytes | Decimal numbers (double precision)   | `double d = 10.99;` |
| `char`    | 2 bytes | Single character (Unicode)           | `char c = 'A';`     |
| `boolean` | 1 bit   | True or false                        | `boolean b = true;` |

---

## 🔹 2. **Non-Primitive (Reference) Data Types**

These are built-in classes or user-defined objects.

| Type       | Description                          | Example                        |
| ---------- | ------------------------------------ | ------------------------------ |
| `String`   | Sequence of characters               | `String name = "Java";`        |
| Arrays     | Collection of fixed-size elements    | `int[] arr = {1, 2, 3};`       |
| Classes    | Custom types with methods/variables  | `MyClass obj = new MyClass();` |
| Interfaces | Abstract type with method signatures | `Runnable r = new Task();`     |

---

### ✅ Summary Table

| Category      | Types                                                                |
| ------------- | -------------------------------------------------------------------- |
| Primitive     | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| Non-Primitive | `String`, `Array`, `Class`, `Interface`, etc.                        |

## for saving integer
byte ---------> 1
short---------> 2
int-----------> 4
long----------> 8

## for saving floating points
float---------> 4   **for this you want to give suffix like 5.5f**
double(default)-> 8 **for this there is no need for anything like float**

char---------->
boolean------->