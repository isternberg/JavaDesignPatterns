# JavaDesignPatterns
Simple implementations of some java design patterns

## So Far implemented
The <a href="https://en.wikipedia.org/wiki/Adapter_pattern" target="_blank">adapter pattern</a>
converts the interface of one class into the interface expected by the clients. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/adapter" 
target="_blank">source code</a>]

The <a href=https://en.wikipedia.org/wiki/Builder_pattern" target="_blank">builder pattern</a> 
is an alternative to the so called
*telescoping anti-pattern*, which occers when a class has an exponential list of constructors, due to numerous constructor 
parameter combinations. This pattern uses a builder object, which receives the initialization parameters one at a time and 
then returns the constructed object. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/builder" 
target="_blank">source code</a>]

The <a href=https://en.wikipedia.org/wiki/Decorator_pattern" target="_blank">decorator pattern</a> 
adds functionality to an existing class by wrapping it. This way the original class doesn't have to change.
Using the decorator pattern allows for modifiying the behaviour a single object, without having to create a special subclass just
for it. [<a href="https://github.com/isternberg/JavaDesignPatterns/tree/master/src/decorator" 
target="_blank">source code</a>]

