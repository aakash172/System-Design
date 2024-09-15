# Singleton Class With Enum

* In Java, enum types are classes that export one instance for each enumeration constant via a public static final field.

#### Code:
```java
package SingletonEnum;

public enum SingletonEnum {
    Instance;
    int i=0;
    public  void doSomething() {
        // do something
        System.out.println(i);
        i++;
    }
}

```