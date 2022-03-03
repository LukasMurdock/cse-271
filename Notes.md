## OOP-advantages
Advantages and disadvantages of OOP

## OOP-tenets
Encapsulation, Abstraction, Inheritance, and Polymorphism

## copy

## class
A derived class cannot make the access modifier to be more restrictive than that defined by the parent class.

The data type of the parameter must be the same as the data of the parameter defined in the base class.

## vs-public-private

## vs-interfaces-abstract
Abstract:
- Class is defined using the abstract keyword
- Can contain non-static instance variables and final methods

Interface:
- Class is defined using the interface keyword
- Cannot contain non-static instance variables and final methods


## vs-getclass-instanceof
Most of the time you should use instanceof. You should only use getClass when you want to know if two classes are exactly the same, e.g., an equals method. In all other cases instanceof is the better option.

## vs-clone-cloneable

## UML
(+) public
(-) private
(#) protected
(italic) abstract
(underline) final

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
