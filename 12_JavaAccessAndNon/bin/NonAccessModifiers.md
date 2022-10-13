Java provides a number of `non-access modifiers` to achieve many other functionalities.

- The static modifier for creating class methods and variables.

- The final modifier for finalizing the implementations of classes, methods, and variables.

- The abstract modifier for creating abstract classes and methods.

# The Static Modifier

### Static Variables
The static keyword is used to create variables that will exist independently of any instances created for the class. Only one copy of the static variable exists regardless of the number of instances of the class.

Static variables are also known as class variables. Local variables cannot be declared static.

### Static Methods
The static keyword is used to create methods that will exist independently of any instances created for the class.

Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all the data from parameters and compute something from those parameters, with no reference to variables.

Class variables and methods can be accessed using the class name followed by a dot and the name of the variable or method.

When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. For example, in the below java program, we are accessing static method m1() without creating any object of the Test class. 
```
class Test { 
    // static method 
    static void m1(){ 
        System.out.println("from m1"); 
    } 
  
    public static void main(String[] args){ 
          // calling m1 without creating 
          // any object of class Test 
           m1(); 
    } 
} 
```

```
class Test { 
    // static variable 
    static int a = 10; 
    static int b; 
      
    // static block 
    static { 
        System.out.println("Static block initialized."); 
        b = a * 4; 
    } 
  
    public static void main(String[] args){ 
       System.out.println("from main"); 
       System.out.println("Value of a : "+a); 
       System.out.println("Value of b : "+b); 
    } 
} 

Output

Static block initialized.
from main
Value of a : 10
Value of b : 40
```

# The Final Modifier
### Final Variables
A final variable can be explicitly initialized only once. A reference variable declared final can never be reassigned to refer to an different object.

However, the data within the object can be changed. So, the state of the object can be changed but not the reference.

With variables, the final modifier often is used with static to make the constant a class variable.

```
public class Test {
   final int value = 10;

   // The following are examples of declaring constants:
   public static final int BOXWIDTH = 6;
   static final String TITLE = "Manager";

   public void changeValue() {
      value = 12;   // will give an error
   }
}
```

### Final Methods
A final method cannot be overridden by any subclasses. As mentioned previously, the final modifier prevents a method from being modified in a subclass.

The main intention of making a method final would be that the content of the method should not be changed by any outsider.

```
public class Test {
   public final void changeName() {
      // body of method
   }
}
```

### Final Classes
The main purpose of using a class being declared as final is to prevent the class from being subclassed. If a class is marked as final then no class can inherit any feature from the final class.

```
public final class Test {
   // body of class
}
```

# The abstract Modifier
### Abstract Class
An abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class to be extended.

A class cannot be both abstract and final (since a final class cannot be extended). If a class contains abstract methods then the class should be declared abstract. Otherwise, a compile error will be thrown.

An abstract class may contain both abstract methods as well normal methods.

```
abstract class Caravan {
   private double price;
   private String model;
   private String year;
   public abstract void goFast();   // an abstract method
   public abstract void changeColor();
}
```

### Abstract Methods
An abstract method is a method declared without any implementation. The methods body (implementation) is provided by the subclass. Abstract methods can never be final or strict.

Any class that extends an abstract class must implement all the abstract methods of the super class, unless the subclass is also an abstract class.

If a class contains one or more abstract methods, then the class must be declared abstract. An abstract class does not need to contain abstract methods.

The abstract method ends with a semicolon. Example: public abstract sample();

```
public abstract class SuperClass {
   abstract void m();   // abstract method
}

class SubClass extends SuperClass {
   // implements the abstract method
   void m() {
      .........
   }
}
```