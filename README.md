# JavaDesignPatterns
Simple implementations of some java design patterns

## So Far implemented
The <a href="https://en.wikipedia.org/wiki/Adapter_pattern">adapter pattern</a>
converts the interface of one class into the interface expected by the clients. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/adapter" >source code</a>]

The <a href="https://en.wikipedia.org/wiki/Builder_pattern">builder pattern</a> 
is an alternative to the so called
*telescoping anti-pattern*, which occers when a class has an exponential list of constructors, due to numerous constructor 
parameter combinations. This pattern uses a builder object, which receives the initialization parameters one at a time and 
then returns the constructed object. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/builder" > source code</a>]

The <a href="https://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a> 
adds functionality to an existing object by wrapping it. 
Using the decorator pattern allows for creating objects with various behaviours, without having to create special subclasses just
for these behaviours. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/decorator" >source code</a>]

The <a href="https://en.wikipedia.org/wiki/Facade_pattern">facade pattern</a>
provides a simple interface to the client, while hiding the complexities of the larger system. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/facade">source code</a>]

The <a href="https://en.wikipedia.org/wiki/Factory_(object-oriented_programming)">factory pattern</a>
provides a common interface for creating various objects. By doing that it also hides the instantiation logic from the client.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/factory">source code</a>]

The <a href="https://en.wikipedia.org/wiki/Abstract_factory_pattern">abstract factory pattern</a>
abstracts a group of individual factories that have a common theme without specifying their concrete classes.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/abstractFactory">source code</a>]

The <a href="https://en.wikipedia.org/wiki/Observer_pattern">observer pattern</a>
allows an object (called the subject) to maintain a list of its dependents (called observers) and notify them automatically of any state changes.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/observer">source code</a>]

The <a href="http://javapapers.com/design-patterns/state-design-pattern/">state pattern</a>
provides a mechanism to change the behaviour of an object based on it’s state.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/state">source code</a>]

The <a href="https://en.wikipedia.org/wiki/Strategy_pattern">strategy pattern</a>
allows the behaviour of an algorithem to be selected at runtime.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/strategy">source code</a>]

The <a href="https://en.wikipedia.org/wiki/template_pattern">template pattern</a>
defines a structure (or a template) for an algorithem. Subclasses can override various steps of the algorithem, while still
maintaining the predefined structure.
[<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/template">source code</a>]




