# State Design Patterns
> State is a behavioral design pattern that lets you alter the object behaviour when its internal state changes. The object well appear to change its class
- State Design patterns is alter state of an object when its internal state changes.

## Motivation 
- Lets consider a simple canvas/painting application with GUI which handles the mouse events such as:
- *If mouse key down* -> *shows the  icon*
- *If mouse key up* -> *Draw the disired Output*
- Here is an example where we can easily understand the drag and drop the functionality

![Drag Drop Feature with mouse click events](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/State%20Design%20Pattern/canvas.gif)


## Solution
- To implement this state changing behavior we have State Design Pattern
- The legit UML diagram is as follow: 

![Legit Class Diagram of State Pattern](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/State%20Design%20Pattern/Screenshot%20from%202020-07-12%2020-15-18.png)

- Here State is an abstract class or interface with handle() method
- ConcreteStateA, ConcreteStateB,ConcreteStateN... are implementing/extending the State
- Context is used for initializing the state variables.

### Implementing the State pattern to develop canvas like functionality?

- A simple class diagram which implement this functionality is as follows:

![Class Diagram of State Pattern](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/State%20Design%20Pattern/Class%20Diagram.png)
- Here using the State Pattern we can easily modify our application by adding differnt functionalities 
but we restrict the modification  which follows the SOLID design principles 'O' (i.e Open for Extension Close for Modification).

### Why cant we simply use switch case / if-else ladder rather than state pattern?
#### Ans: In real world software development, large conditional statements are undesirable. Ex:-
```Java
public void mouseDown(){
if(tool=='SELECTION')
{
System.out.println("Selection icon");
}
else if(tool=='ERASER')
{
System.out.println("Eraser icon");
}
else if(tool=='BRUSH')
{
System.out.println("Brush icon");
}
}
..
.
.
.
.

```
#### which make our design non-extensible and hard coded.. Hence we use State design pattern.



