# Template Design Pattern

> Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
> Base class declares algorithm 'placeholders', and derived classes implement the placeholders.

- Template design pattern implements perfect example of method overriding and inheritance.

## Problem

- Lets imagine you are developing the backend of Banking sector where you need to consider different tasks and these tasks need to be Audit before execution.
- we can easily use strategy pattern but, stratagy pattern wont help to cover the whole problem.

## Solution

- To implement this undo mechanism the _GOF (Gang of Four)_ invent Template Method Design Pattern
- The legit UML diagram is as follow:
  ![Template Design Pattern]()

- The implementation of template_method() is: call`step_one()`, call `step_two()`, and call `step_three()`. `step_two()` is a "hook" method – a placeholder.
- It is declared in the base class, and then defined in derived classes.
- Frameworks (large scale reuse infrastructures) use Template Method a lot. All reusable code is defined in the framework's base classes, and then clients of the framework are free to define customizations by creating derived classes as needed.

### Simplified version of Template Design Pattern

- A simple class diagram which implement editor undo mechanism is as follows:
  ![Class Diagram of Memento Design Pattern in Editor Undo Fuctionality]()
- Here `History`-> saving the states `EditorState`-> is maintaining the editor class states and `Editor` is initializing the state variables (i.e String content;)

### FAQs

#### Can we make the overriden methods public?

Ans : Yes. The legacy template pattern suggest us to make the overriding methods to be abstract.

#### How we achive the encapsulation where we cant make an abstract method private?

Ans : We use protected access modifier, which hides the method within the class and make it inaccessible outside the package.
