## note-OOP-advantages
Advantages and disadvantages of OOP

## note-OOP-tenets
Encapsulation: Ability to encapsulate all neccessary variables and functions.

Abstraction: Ability to hide details of how the class operates.

Inheritence: Ability to inherit variables and functions from a parent class.

Polymorphism: Child class can override parent class function.

## note-testing-types

- Unit testing: Test methods and classes.
- Functional testing: Test functionality of features.
- Regression testing: Aims to detect if existing features are broken.
- Integration testing: Tests interoperability between software systems.
- Performance testing: Tests speed, response time, scalability etc.

## note-super
Super enables calling the constructor in a parent class.

## note-copy
Shallow copies reuse the object references.

Deep copies creates new objects and copies the values.

## note-class
A derived class cannot make the access modifier to be more restrictive than that defined by the parent class.

The data type of the parameter must be the same as the data of the parameter defined in the base class.

## vs-public-private
private: Attribute is accessible only within the class (Typically instance variables are made private)

public: Attribute is accessible inside & outside the class

## vs-static
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

## vs-clone-cloneable
Cloneable enables creating a clone in a polymorphic manner. (implements Cloneable, Comparable<Person>)

@Override
public Person clone() {
    return new Person(this);
}


## UML
(+) public
(-) private
(#) protected
(italic) abstract
(underline) final
->: From child to parent (solid line)
-->: From class to interface (dashed line)

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
