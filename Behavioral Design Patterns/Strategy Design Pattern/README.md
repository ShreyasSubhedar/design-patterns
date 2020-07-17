# Strategy Design Pattern
> Strategy is a behavioral design pattern that lets you change the behavior of class or its algorithm at runtime.
- In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object
## Motivation 
- Lets consider you are developing one module which stores the image apply some effects on it and also uses some compression algorithms to covert the image into various formats such as .jpeg, .png, etc.

## Solution
- To implement this changing behavior we have Strategy Design Pattern
- The legit UML diagram is as follow: 

![Legit Class Diagram of Strategy Pattern](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/Strategy%20Design%20Pattern/strategy_pattern_uml_diagram.jpg)

- Here Strategy is an interface which defines contract
- Add , Subtract, Multiply are the classes which follows the shared contract. 
- Context class change the behavior of Strategy using `executeStrate` method
- Last , Demo class is the client class.

### Implementing the Strategy pattern to develop image storing module

- A simple class diagram which implement this functionality is as follows:

![Class Diagram of Strategy Pattern](https://github.com/ShreyasSubhedar/design-patterns/blob/master/Behavioral%20Design%20Patterns/Strategy%20Design%20Pattern/Class%20Diagram%20Strategy%20Pattern.png)
- Here using the Strategy Pattern we can easily extend our application by injecting different  
but we restrict the modification  which follows the SOLID design principles 'O' (i.e Open for Extension Close for Modification).

## Questions
- **strategy pattern is same as state pattern!?**
    - **Ans: Strategy pattern can be changed by the client by changing the strategy, where state pattern changes the state internally(client will not change the behavior)**
- **How many principles are followed by strategy pattern??**
    - **SO principles**
