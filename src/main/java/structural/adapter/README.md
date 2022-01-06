
#### Adapter Design Pattern
Also known as Wrapper Pattern.
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

_**Real life-Problem**_ : Chargers across USA/Europe/India have a different dimension. Normal charger in any of the origin countries would not work in other regions.

_**Solution**_ : Adapter can be used with original charger in any of cross regions.

An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes. The wrapped object isn’t even aware of the adapter. For example, you can wrap an object that operates in meters and kilometers with an adapter that converts all of the data to imperial units such as feet and miles.
Adapters can not only convert data into various formats but can also help objects with different interfaces collaborate. Here’s how it works:

The adapter gets an interface, compatible with one of the existing objects.
Using this interface, the existing object can safely call the adapter’s methods.
Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.
Sometimes it’s even possible to create a two-way adapter that can convert the calls in both directions.

Now, we know this pattern allows us to use a client with an incompatible interface by creating an Adapter that does the conversion. This acts to decouple the client from the implemented interface, and if we expect the interface to change over time, the adapter encapsulates that change so that the client doesn’t have to be modified each time it needs to operate against a different interface.

Here’s how the Client uses the Adapter

① The client makes a request to the adapter by calling a method on it using the target interface.

② The adapter translates the request into one or more calls on the adaptee using the adaptee interface.

③ The client receives the results of the call and never knows there is an adapter doing the translation.

There are actually two kinds of adapters: object adapters and class adapters.

The Duck/Turkey implementation is the typical of Object Adapter Design Pattern. Refer Adapter-Object.jpg 
For Class adapter, you need multiple inheritance to implement it, which isn’t possible in Java. But, that doesn’t mean you might not encounter a need for class adapters down the road when using your favorite multiple inheritance language!
Refer 

The only difference is that with class adapter we subclass the Target and the Adaptee, while with object adapter we use composition to pass requests to an Adaptee.

Object adapters and class adapters use two different means of adapting the adaptee (composition versus inheritance).

Object adapter
This implementation uses the object composition principle: the adapter implements the interface of one object and wraps the other one. It can be implemented in all popular programming languages.

Class adapter
This implementation uses inheritance: the adapter inherits interfaces from both objects at the same time. Note that this approach can only be implemented in programming languages that support multiple inheritance, such as C++.

How do you identify Adapter pattern ?
Identification: Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type. When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.


Pros
- Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
- Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

Cons
- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.