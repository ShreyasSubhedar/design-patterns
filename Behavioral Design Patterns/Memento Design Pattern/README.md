# Memento Design Patterns
> Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
- Memento Design patterns is used to store the state of an object.
- Memento is mainly use for undo mechanisms

## Problem 
- Can you image the code editor that cannot have the feature of undo the written code? **NO, you cant!!**
- early 2000 when developers are slowly shifting from vi to GUI based editors ,these editors add the undo facility: which now a days is also present in the many GUI frameworks such as Android Studio

## Solution
- To implement this undo mechanism the *GOF (Gang of Four)* invent Memento Design Pattern
- The legit UML diagram is as follow: 
 !()[]

- Here Caretaker class is used for storing state of Originator
- Memento is used for maintaining state of originator
- Originator is used for initializing the state variables.

### Isn't this is cliche due to all these namings of classes?

- A simple class diagram which implement editor undo mechanism is as follows:
![]()
- Here `History`-> saving the states `EditorState`-> is maintaining the editor class states and `Editor` is initializing the state variables (i.e String content;)

### Why cant we combine `EditorState` and `Editor` class functionality into a single class?
#### Ans: It violates SOLID Design Principle 'S'(i.e Single responsibility principle).

