Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

---
### Components of Memento Design Pattern
#### Originator:
The state of an object is established and maintained by this component.
It can create Memento objects to store its state and has methods to set and retrieve the object’s state.
The Originator communicates directly with the Memento to create snapshots of its state and to restore its state from a snapshot.
##### Memento:
The Memento is an object that stores the state of the Originator at a particular point in time.
It only provides a way to retrieve the state, without allowing direct modification. This ensures that the state remains
#### Caretaker:
The Caretaker is responsible for keeping track of Memento objects.
It doesn’t know the details of the state stored in the Memento but can request Mementos from the Originator to save or restore the object’s state.
##### Client:
Typically represented as the part of the application or system that interacts with the Originator and Caretaker to achieve specific functionality.
The client initiates requests to save or restore the state of the Originator through the Caretaker.