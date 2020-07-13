# Iterator Design Pattern
> Iterator is a behavioral design pattern that provide a way to access the elements of an aggregate object sequentially without exposing its underlying
representation.
- Iterator Design pattern iterate objects.

## Motivation 
- Lets assume we are developing a web browser like chrome and we need to add the feature of web-history:
- Web history will store the urls visited by the client likewise
![Web History]()
- And we need to iterate through all the urls stored in the browser history.

## Solution
- To implement this iterating behavior we have Iterator Design Pattern
- The legit UML diagram is as follow: 

![Legit Class Diagram of Iterator Pattern]()

- Here Collection is an  interface with createTraversalObject() method
- ListCollection, MapCollection,...... are implementing the Collection Interface
- Client is dependent on Collection interface.
- **This UML diagram is hard to understand due to jargons lets make it simple :-**  
## Implementing the Iterator pattern to develop browse history feature?

- A simple class diagram which implement this functionality is as follows:

![Class Diagram of Iterator Pattern]()
- Here using the Iterator Pattern we can easily modify our application by adding different Iterators such as List, Map, Array ... etc without disturbing the client implementation.
- `BrowseHistory` => Store the List of URLs with push | pop methods
- `Interface Iterator` => A contract with all the necessary methods such as nextItem, currentItem and next ...
- `ArrayIterator, ListIterator & MapIterator` are implementing this contract. 

### Why cant we add Iterator methods into BrowseHistory class?
#### Ans : Violation of Single Responsibility Principle

### Does this pattern follows the Open/Close SOLID principle?
#### Ans : Yes, implementation of new types of collections and iterators without breaking anything.

### Exactly what we are achieving using Iterator Pattern?
#### Ans : By implementing iterator pattern we are avoiding coupled code in our project , if in future we want store in Array / Map rather than list then we can easily implement various iterators.





