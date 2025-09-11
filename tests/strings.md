### **1. What is the output of the following code?**

```java
public class Test1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hel" + "lo";
        String s3 = "Hel";
        String s4 = s3 + "lo";
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
    }
}
```

A.

```
true  
true
```

B.

```
true  
false
```

C.

```
false  
true
```

D.

```
false  
false
```

---

### **2. What will this program output?**

```java
public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("21");
        sb.insert(4, "-Version ");
        sb.delete(0, 4);
        System.out.println(sb.toString());
    }
}
```

A. `21-Version `
B. `Java-Version 21`
C. `-Version 21`
D. `Version 21`

---

### **3. What does this code print?**

```java
public class Test3 {
    public static void main(String[] args) {
        String str = "   Java 21   ";
        String trimmed = str.strip();
        System.out.println(trimmed.length());
    }
}
```

A. `9`
B. `11`
C. `10`
D. `13`

---

### **4. What's the result of this code?**

```java
public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = sb.toString();
        sb.append("def");
        System.out.println(s);
    }
}
```

A. `abcdef`
B. `abc`
C. Compilation error
D. Runtime exception

---

### **5. What does this output?**

```java
public class Test5 {
    public static void main(String[] args) {
        String s = "Java";
        s.toUpperCase();
        System.out.println(s);
    }
}
```

A. `JAVA`
B. `java`
C. `Java`
D. Compilation error

---

### **6. What's the output here?**

```java
public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        for (int i = 0; i < 3; i++) {
            sb.append(i);
        }
        sb.reverse();
        System.out.println(sb);
    }
}
```

A. `start012`
B. `210trats`
C. `012trats`
D. `start210`

---

### **7. What will this program print?**

```java
public class Test7 {
    public static void main(String[] args) {
        String a = "abc";
        String b = a.replace('b', 'x');
        a = a.replace('a', 'y');
        System.out.println(a + " " + b);
    }
}
```

A. `ybc axc`
B. `abc axc`
C. `abc abc`
D. `ybc abc`

---

### **8. What will this code print?**

```java
public class Test8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Line 1\n")
          .append("Line 2\n")
          .append("Line 3");
        System.out.println(sb.length());
    }
}
```

A. `21`
B. `20`
C. `22`
D. `19`

---

### **9. What will this code output?**

```java
public class Test9 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = s1;
        s1 = s1.toUpperCase();
        System.out.println(s1 + " " + s2);
    }
}
```

A. `JAVA java`
B. `JAVA JAVA`
C. `java java`
D. Compilation error

---

### **10. What is printed by this code?**

```java
public class Test10 {
    public static void main(String[] args) {
        String json = """
            {
                "name": "Alice",
                "age": 30
            }
            """;
        System.out.println(json.strip().length());
    }
}
```

A. `38`
B. `36`
C. `40`
D. `39`

