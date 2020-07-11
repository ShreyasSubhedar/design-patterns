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
 ![Legacy Memento pattern](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/Memento%20Design%20Pattern/Screenshot%20from%202020-07-11%2023-30-46.png)

- Here Caretaker class is used for storing state of Originator
- Memento is used for maintaining state of originator
- Originator is used for initializing the state variables.

### Isn't this is cliche due to all these namings of classes?

- A simple class diagram which implement editor undo mechanism is as follows:
![Class Diagram of Memento Design Pattern in Editor Undo Fuctionality](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/Memento%20Design%20Pattern/Blank%20Diagram.png)
- Here `History`-> saving the states `EditorState`-> is maintaining the editor class states and `Editor` is initializing the state variables (i.e String content;)

#### Why cant we combine `EditorState` and `Editor` class functionality into a single class?
##### Ans: It violates SOLID Design Principle 'S'(i.e Single responsibility principle).

