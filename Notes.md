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

## method-sorting-swap

static <X extends Comparable<X> >
void swap(X a[], int idx1, int idx2) {
X temp  = a[idx1];
a[idx1] = a[idx2];
a[idx2] = temp;
}

static void swapTest() {
Employee[] roster = new Employee[10];
// Create 10 Employee objects here.
swap(roster, 1, 2);
}

## note-sorting-strategies

Sorting data is accomplished using
- compareTo() method for objects
- standard comparators (<, >, =) for primitive data types
There are different strategies for sorting and they differ in their speed of operation, faster sorting algorithms are a bit more complex (but are clever)
- Selection sort (slow but simple)
- Quick sort (fast, but can degrade to be slow)
- Merge sort (fast)

## note-sorting-jdk
The JDK library includes built in implementations
- Binary search: O(logn): Returns positive if value is found. Otherwise returns negative number indicating index position where value should occur (used to insert value).
-  Sorting: O(n logn): Different algorithms for Arrays versus collections

For arrays of primitive types in Arrays class
- Each primitive type needs its own implementation
- Note: Sorting is done using dual-pivot quicksort

For collections in Collections class
- A collection class must implement the Collection interface (Example classes: ArrayList, Deque (pronounced deck))
- Note: Sorting is done using iterative merge sort

## method-sorting-jdk
static void resort(ArrayList<Integer> list) {
// Change sorting order using custom comparator
// implemented using lambda syntax
Collections.sort(list, (x, y) -> y.compareTo(x));
}

public static boolean isSame(int[] list1, ArrayList<Integer> list2) {
if(list1.length != list2.size()) {
return false; // Different number of elements.
}
Arrays.sort(list1);
Collections.sort(list2);
for(inti = 0; (i < list1.length); i++) {
if(list1[i] != list2.get(i)) {
return false; // At least 1 difference. Not same.
}
}
return true; // Yes! The sorted arrays are the same!
}

// binary search examples

// Returns true if the "key" is found in both sorted lists
boolean inBoth(int[] list1,
ArrayList<Integer> list2, int key) {
int idx1 = Arrays.binarySearch(list1, key);
int idx2 = Collections.binarySearch(list2, key);
return (idx1 >= 0) && (idx2 >= 0);
}

boolean noDupeInsert(ArrayList<Integer> list, int val) {
int idx = Collections.binarySearch(list, val);
if (idx >= 0) {
return false; // value exists
}
// Convert negative index to correct positive one
idx = (idx * -1) - 1;
list.add(idx, val); // Insert to keep list sorted
return true;
}

## method-sorting-selection
static <X extends Comparable<X> >
int findMinIndex(X a[], int start) {int minIdx = start;for (int k = start + 1; (k < a.length); k++) {
if (a[k].compareTo(a[minIdx]) < 0) {minIdx = k;
}}return minIdx;
}

static <X extends Comparable<X> >
void selectionSort(X a[]) {for (int i = 0; (i < a.length); i++) {
int minIdx = findMinIndex(a, i + 1);
swap(a, i, minIdx);
}
}

## method-sorting-quicksort
static <X extends Comparable<X> >
int partition(X data[], int min, int max) {
X pivot = data[min]; // Assume first element as the pivot
// The left and right for partitioning
int left = min, right = max;
while (left < right) { // Outermost while-loop
// Search for element bigger than pivot
while((left < right) && (data[left].compareTo(pivot)<= 0))
left++;
// Search for element smaller than pivot
while (data[right].compareTo(pivot) > 0)
right--;
if (left < right)
swap(data, left, right);
}
// Move partition element to final position.
swap(data, min, right);
return right;
}

static <X extends Comparable<X> >
void swap(X a[], int idx1, int idx2)  {
X temp  = a[idx1];
a[idx1] = a[idx2];
a[idx2] = temp;
}
static <X extends Comparable<X> >
void quickSort(X data[], int min, int max) {
if (min < max) {
int pivot = partition(data, min, max);
quickSort(data, min, pivot-1);
quickSort(data, pivot+1, max);
}
}

## method-sorting-merge
static <X extends Comparable<X> >
void merge(X data[], int first, int mid, int last) {
Object temp[] = new Object[data.length];
int first1 = first, last1 = mid;
int first2 = mid+1, last2 = last;
int index  = first;
// Copy smaller items for each sub-array into temp
while (first1 <= last1 || first2 <= last2) {
if ((first2 > last2) || // second 1/2 is empty
((first1 <= last1) && (data[first1].compareTo(data[first2]) < 0))) {
temp[index] = data[first1++];
} else
temp[index] = data[first2++];
index++;
}
// copy merged data into original array
for(int i = first; (i <= last); i++)
data[i] = (X) temp[i];
}

// merging two sorted lists
static <X extends Comparable<X> >
void mergeSort(X data[], int min, int max) {
if (min < max) {
int mid = (min + max) / 2;
mergeSort(data, min, mid);
mergeSort(data, mid+1, max);
merge(data, min , mid, max);
}
}

## method-sorting-insertion
static <X extends Comparable<X> >
void insertionSort(X data[]) {
for (int i = 1; (i < data.length); i++) {
X key = data[i];
int pos = i;
// Shift larger values to the right
while (pos > 0 &&
data[pos-1].compareTo(key) > 0) {
data[pos] = data[pos-1];
pos--;
}
data[pos] = key;
}
}

## notes-time-complexity
O(1) < O(log n) < O(n) < O(n log n) < O(n2) < O(n3) < O(2n) < O(n!)

Bubble sort, selection sort: O(n^2)
Merge sort, quick sort: O(n log_2 n)

Determine if a number is odd or even.
Determine max (or min) of 2 numbers etc.
O(1) Constant
Sum of n numbers. Find min or max of n
numbers (from a list).
O(n) Linear
String operations: insert character, find
character, remove character
O(n) Linear
Binary search (using a sorted list or binary tree) O(logn) Logarithmic
Quick sort, Heap Sort O(n log n) Log linear
Sequential sort, Bubble sort O(n^2) Quadratic
Matrix multiplication O(n^3)Cubic
