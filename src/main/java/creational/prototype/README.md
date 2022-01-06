### Prototype Design Patterns

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
Also know as Clone Pattern

Real-life Problem : Imagine a Robot trying to create its own specimen copy of itself.

Solution : Create a clone and copy the object/products.

Simple ? Here's the catch - some fields in objects cannot be copied due to private or not being visible from outside of object.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.
Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

The implementation of the clone method is very similar in all classes. The method creates an object of the current class and carries over all of the field values of the old object into the new one. You can even copy private fields because most programming languages let objects access private fields of other objects that belong to the same class.

An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible configurations, cloning them might serve as an alternative to subclassing.

Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.

This happens a lot when your code works with objects passed to you from 3rd-party code via some interface. The concrete classes of these objects are unknown, and you couldn’t depend on them even if you wanted to.
The Prototype pattern provides the client code with a general interface for working with all objects that support cloning. This interface makes the client code independent from the concrete classes of objects that it clones.

Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects. Somebody could have created these subclasses to be able to create objects with a specific configuration.

The Prototype pattern lets you use a set of pre-built objects, configured in various ways, as prototypes.
Instead of instantiating a subclass that matches some configuration, the client can simply look for an appropriate prototype and clone it.

Pros
- You can clone objects without coupling to their concrete classes.
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- You can produce complex objects more conveniently.
- You get an alternative to inheritance when dealing with configuration presets for complex objects.

Cons
-  Cloning complex objects that have circular references might be very tricky.

Prototype isn’t based on inheritance, so it doesn’t have its drawbacks. On the other hand, Prototype requires a complicated initialization of the cloned object. Factory Method is based on inheritance but doesn’t require an initialization step.

Prototype can help when you need to save copies of Commands into history.
Sometimes Prototype can be a simpler alternative to Memento. This works if the object, the state of which you want to store in the history, is fairly straightforward and doesn’t have links to external resources, or the links are easy to re-establish.

    Usage examples: The Prototype pattern is available in Java out of the box with a Cloneable interface.
                    java.lang.Object#clone() (class should implement the java.lang.Cloneable interface)
                    Any class can implement this interface to become cloneable.
    
    Identification: The prototype can be easily recognized by a clone or copy methods, etc.


When we're trying to clone, we should decide between making a shallow or a deep copy. Eventually, it boils down to the requirements.
For example, if the class contains only primitive and immutable fields, we may use a shallow copy.
If it contains references to mutable fields, we should go for a deep copy. We might do that with copy constructors or serialization and deserialization.


