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