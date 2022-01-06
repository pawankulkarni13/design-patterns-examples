### Abstract Factory Design Pattern

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct factory.
Then you can make all variants of factory/products follow those interfaces.

Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.

The Abstract Factory provides you with an interface for creating objects from each class of the product family. As long as your code creates objects via this interface, you don’t have to worry about creating the wrong variant of a product which doesn’t match the products already created by your app.

Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that blur its primary responsibility.

In a well-designed program each class is responsible only for one thing. When a class deals with multiple product types, it may be worth extracting its factory methods into a stand-alone factory class or a full-blown Abstract Factory implementation.



Pros
- You can be sure that the products you’re getting from a factory are compatible with each other.
- You avoid tight coupling between concrete products and client code.
- Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
- Open/Closed Principle. You can introduce new variants of products without breaking existing client code.
 
Cons
- The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.


Usage examples: The Abstract Factory pattern is pretty common in Java code. Many frameworks and libraries use it to provide a way to extend and customize their standard components.

Identification: The pattern is easy to recognize by methods, which return a factory object. Then, the factory is used for creating specific sub-components.

