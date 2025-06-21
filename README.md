# Java Questions and Answers

## About this Repository

This repository collects important Java questions and answers for revision and practice.

## 1. What is an Immutable Class in Java and How to Implement One?

An immutable class in Java is a class whose objects cannot be modified after creation. Once an object is created, its state (i.e., field values) cannot be changed.

To make a class immutable:
- Declare class as `final` so it cannot be subclassed
- Make all fields `private` so they cannot be modified
- Don't provide setters - only getters
- Initialize all fields through constructor
- If any field is mutable (e.g., a List or custom object), return a deep copy to prevent external modification

## 2. Why Use Immutable Classes in Java?

1. **Thread Safety Without Synchronization**: You can safely share immutable objects between multiple threads without worrying about race conditions
2. **Safe Caching and Hashing**: Immutable objects can be safely cached (like in `HashMap` or `HashSet`) because their `hashCode()` and `equals()` don't change over time

## 3. What Classes are Immutable in Java?

- `String`
- All wrapper classes for primitives (`Integer`, `Double`, `Float`, etc.)
- All date/time classes introduced in Java 8 (`java.time` package classes)

## 4. What is the Use of Serialization in Java?

Serialization in Java is the process of converting Java objects into streams of bytes. This enables:
- Transfer over networks
- Storage in databases
- Saving to files
- Communication between different JVMs

## 5. How to Make a POJO Serializable?

We can make a Java class serializable by implementing the `Serializable` interface. It's a marker interface (no methods or fields) that signals the class is ready for serialization.

> **Reference**: [Java Serialization and Deserialization](https://www.geeksforgeeks.org/java/serialization-and-deserialization-in-java)

## 6. What Challenges Arise When Sending Java Objects Over a Network?

### Serialization Compatibility
**Problem**: Version mismatch between systems can break deserialization  
**Solutions**:
- Use consistent `serialVersionUID`
- Ensure compatible class versions across systems
- Design with backward/forward compatibility

### Class Not Found Issues
**Problem**: Receiver missing class definition  
**Solutions**:
- Ensure class is on receiver's classpath
- Use shared libraries or JARs across services

### Security Risks
**Problem**: Deserialization vulnerabilities  
**Solutions**:
- Never deserialize untrusted input
- Use `ObjectInputFilter` (Java 9+) to whitelist expected classes

### Performance Overhead
**Problem**: Slow serialization for large objects/high-throughput systems  
**Solutions**:
- Use alternative serialization frameworks:
  - Kryo
  - Protocol Buffers (Google)
  - Apache Avro
  - Jackson (JSON)
- Keep objects lightweight
- Consider compression (e.g., GZIP)

## 7. What is singleton pattern in java?
Singleton pattern is one of the design pattern in jav where we allow class to create only one instance of it in the application and providing global access to it.
 * How to implement singleton pattern in java?
We can create singleton pattern by making private constructor,static instace fields and creating public method to return the instance.
 * uses : 
    its used in logging,caching and configuration management
## 8. How to make singleton a thread safe?
We use syncronized in method to make singleton to accessible for one thread.
We can use double checked locking to reduce synchronization overhead
We use Enum singleton also that ensures thread safety efficiently.

## 9. What is hashcode equals contract? Why its important?
If two object are equal they must have same hashcode.It ensures correct behaviour in hashmap,hashset and hashtable.And improves performance in hash based collections.

## 10. Fail-Fast and Fail-Safe iterator: 
While you iterating over the collection when you try to add some element to it that will throw concurrent modification exception.that is called fail-fast iterator.
Eg: ArrayList,List,Hashmap.
while iterating when you try to add new data it will add to the collection without any error but it will not iterate through newly added data.
Eg : ConcurrentHashMap,CopyOnWriteArrayList.

## 11.How do you handle global exception in spring boot application?
@ControllerAdvice → Tells Spring this class handles exceptions globally for all controllers.
@ExceptionHandler → Marks which exception to handle.
@RestControllerAdvice is a specialized version of @ControllerAdvice that combines:
@ControllerAdvice (for global exception handling)
and
@ResponseBody (to automatically return JSON or other REST-compatible responses)

## 12.what is the difference between arraylist and linkedlist when would you use over the other?
when i want to add element at end and need quick access for elemnent using index and dont want to do more insertion and deletion especially in middle or start means i will go with arraylist.
if i want to insert/delete effectively without bothering about accessing it i will go with linkedlist.

## 13.if you need to implement a queue that frequently adds and removes element from both side which list you will use?
LinkedList- because it implements deque interface which supports addfirst ,addlast,removefirst,removelast with o(1) time complexity.
## 14.No unique bean definition exception
## 15.@Qualifier annotaitons use case:
it uses when multiple implementation of same class is there but there is no implementation for parent class. 

