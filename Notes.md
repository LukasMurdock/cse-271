## note-OOP-advantages
Advantage:
- Encapsulation provides better organization of data and methods.
- Abstraction (via methods) allows design of effective API for programmers
- Inheritance streamlines software reuse
- Polymorphism enables selective customization of functionality enabling effective use of inheritance
- OOP reduces software development and maintenance costs when use correctly

Disadvantage:
- There is a steeper learning curve
- Troubleshooting issues can be tricky
- Object-oriented programs tend to be a bit larger than procedural solutions

## note-exception
An exception is an object that is handed to the runtime when an error occurs.

When an exception is thrown, the runtime searches for an exception handler block to catch the thrown exception. If the runtime does not find an exception handler for the thrown exception the runtime terminates.

Checked exceptions are checked during compile time and caught; however, unchecked exceptions are thrown during runtime as having to add runtime exceptions in every method declaration would reduce a program's readability. Every exception in Java is a checked exception unless it extends RuntimeException.

RuntimeException and its descendants are unchecked exceptions. All other Throwable and Exception classes and their descendants are checked exceptions and must be included in the throws clause of a method.


## note-OOP-tenets
Encapsulation: Ability to encapsulate all necessary variables and functions.

Abstraction: Ability to hide details of how the class operates.

Inheritance: Ability to inherit variables and functions from a parent class.

Polymorphism: Child class can override parent class function.

## note-testing-types
- Unit testing: Test methods and classes.
- Functional testing: Test functionality of features.
- Regression testing: Aims to detect if existing features are broken.
- Integration testing: Tests interoperability between software systems.
- Performance testing: Tests speed, response time, scalability etc.

## note-super
Super enables calling the constructor in a parent class.

## note-casting
Upcasting is casting to a supertype.

Down-casting is casting to a sub-type. Safe down-casting can be achieved with type checking.

## note-copy
Shallow copies reuse the object references.

Public Student(Student studentToCopy) {
this.scores = studentToCopy.scores;
this.name = studentToCopy.name;
}

Deep copies creates new objects and copies the values.

Public Student(Student studentToCopy) {
This.name = studentToCopy.name;
This.scores = Arrays.copy(studentToCopy.scores);
}

## note-class
A derived class cannot make the access modifier to be more restrictive than that defined by the parent class.

The data type of the parameter must be the same as the data of the parameter defined in the base class.

## vs-public-private
private: Attribute is accessible only within the class (Typically instance variables are made private)

public: Attribute is accessible inside & outside the class

## vs-static
Static instance variables are shared among all instances of a class. Non-static instance variables are specific to that class instance.

If a variable is static, then there is only 1 value and it is the same (or shared) by all instances.

Every non-static method has an implicit local object than can be referred to using the this keyword.

## vs-interfaces-abstract
Abstract:
- Class is defined using the abstract keyword
- Can contain non-static instance variables and final methods
- Use extends keyword to derive from it

Interface:
- Class is defined using the interface keyword
- Cannot contain non-static instance variables and final methods
- Use implements keyword to define methods


## vs-getclass-instanceof
Most of the time you should use instanceof. You should only use getClass when you want to know if two classes are exactly the same, e.g., an equals method. In all other cases instanceof is the better option.

Using instanceof requires knowing the class at compile time. Checking the class checks at runtime.

## vs-clone-cloneable
Cloneable enables creating a clone in a polymorphic manner. (implements Cloneable, Comparable<Person>)

@Override
public Person clone() {
    return new Person(this);
}


## note:UML
(+) public
(-) private
(#) protected
(italic) abstract
(underline) final
->: From child to parent (solid line)
-->: From class to interface (dashed line)

## method-class
public Class Fruit{
    private double cost;
    private double weight;
    private int amount;

    public Fruit(){};
    public Fruit(int amount, double cost, double weight){
        this.cost = cost;
        this.amount = amount;
        this.weight = weight;
    }
}

## method-equals
public class Person {
    private int age;
    private char gender;
    private String name;

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != Person.class)) {
            return false;
            }
            Person p = (Person) o;
            return ((p.age == age)
            && (p.gender == gender)
            && (p.name.equals(name)));
    }
}

## method-largest-arraylist-object
public static Shape getBiggest(final ArrayList<Shape> shapeList) {
    return shapeList.stream()
    .max(Comparator.comparingDouble(shape -> shape.computeArea(shape)))
    .get();
}

## method-largest-arraylist-number
public Integer getLargest(ArrayList<Integer> list) {
    Integer max = list.get(0);
    for (int i=1; i<list.size(); ++i) {
        if (list.get(i)>max) {
            max = list.get(i);
        }
    }
    return max;
}

## method-largest-compareTo
<!-- TODO -->
Find the largest or smallest object of a given class type in a list based on value returned by compareTo method.

## method-largest-array
public static void showHeaviest(Animal[] zoo) {
    Animal heaviest = zoo[0];
    for(int i = 1; (i < zoo.length); i++) {
        if (heaviest.getWeight() < zoo[i].getWeight()) {
            heaviest = zoo[i];
        }
    }
    System.out.println("Heaviest animal: " + heaviest);
}

## method-sort
Find the second largest or smallest object using compareTo method.
// sort array
Arrays.sort(grades);

// sort ArrayList
return ArrayList<Integer> sortedList = list.stream()
.sorted()
.collect(Collectors.toCollection(ArrayList::new));

// custom comparator
Comparator<User> customComparator = new Comparator<User>() {
    @Override public int compare(User o1, User o2) {
        if(o1.getAge() == o2.getAge()) {
            return o1.getName().compareTo(o2.getName());
        } else if(o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}

List<User> sortedList = userList.stream()
.sorted(customComparator)
.collect(Collectors.toList());

## method-duplicate
// uses equals method
return list.stream()
.distinct()
.collect(Collectors.toCollection(ArrayList::new));

---

# Midterm With Above

---

## method-factorial-recursive
// iterative
public int factorial(int n) {
    int product = 1;
    for (int j = 1; j <= n; j++)
        product *= j;
    return product;
}

// recursive
public int factorial(int n) {
    return (n < 2) ? 1 : (n * factorial(n - 1));
}


## method-reverse-recursive
// iterative
public int reverse(int n) {
  int rev = 0;
  for (; (n > 0); n /= 10) {
    rev = (rev * 10) + (n % 10);
  }
  return rev;
}

// recursive
public int reverse(int n) {
    if (n < 10) {
            return n;
    } else {

    }
}

## method-count-char-recursive
// minified
public static int countX(String str) {
    return (str.length() == 0)
        ? 0
        : (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
}

// explained
public int countX(String str) {
    // Base case -- return simple answer
    if (str.length() == 0) {
        return 0;
    }

    // Deal with the very front of the string (index 0) -- count "X" there.
    int count = 0;
    if (str.charAt(0) == 'x') {
        count = 1;
    }

    // Make a recursive call to deal with the rest of string (the part
    // beyond the front).
    // Add count to whatever the recursive call returns to make the final
    // answer.
    // Note that str.substring(1) starts with char 1 and goes to the
    // end of the string.
    return count + countX(str.substring(1));
}

## method-count-number-recursive
public static int array11(final int[] array, int index) {
    return (array.length == index)
        ? 0
        : (array[index] == 11 ? 1 : 0) + array11(array, index + 1);
}

## method-fibonacci-recursive
public static int fibonacci(int n) {
    return (n < 2)
        ? n
        : fibonacci(n - 1) + fibonacci(n - 2);
}

## method-sumdigits-recursive
public int sumDigits(int n) {
    return (n == 0)
        ? n
        : (n % 10 + sumDigits(n / 10));
}
