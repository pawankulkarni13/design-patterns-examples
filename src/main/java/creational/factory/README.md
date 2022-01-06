### Factory Design Pattern

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

Factory Method defines a method, which should be used for creating objects instead of direct constructor call (new operator). Subclasses can override this method to change the class of objects that will be created.


By this time once you go thru the abstract factory design pattern, you should be easily relate how useful is Factory Pattern.

Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.

Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.

Inheritance is probably the easiest way to extend the default behavior of a library or framework. But how would the framework recognize that your subclass should be used instead of a standard component?
The solution is to reduce the code that constructs components across the framework into a single factory method and let anyone override this method in addition to extending the component itself.

Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

Pros
- You avoid tight coupling between the creator and the concrete products.
- Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
- Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

Cons
- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

Usage examples: The Factory Method pattern is widely used in Java code. It’s very useful when you need to provide a high level of flexibility for your code.

Identification: Factory methods can be recognized by creation methods, which create objects from concrete classes, but return them as objects of abstract type or interface.

Example : if we corelate the example on abstract design pattern, if we have single unit production factories like just the Mobile Phones. 
Then the high level factory would be just the MacOSFactory or AndroidOSFactory. Similarly for laptop product creation.
