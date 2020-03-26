# java-code-assignment
## Setup and Run
### Prerequisites
* JDK
* Maven
### Run
Run with maven command:

    mvn test
  
  
## Questions
### A. Let’s start with the basics
#### 1. Can you implement the sing() method for the bird?
Singing is a behaviour of the bird so it should be a method in Bird class (not Animal because not all Animal can sing).
We have 2 possible ways to implement sing method: instance method in Bird class or separate Interface.
For now, we just have only Animal and Bird, to keep everything simple, we go with instance method in Bird class.
##### a. How did you unit test it?
We create Bird instance of Bird class, then we test its behaviour: walk, fly and sing.
##### b. How did you optimize the code for maintainability?
We follow some simple rules:
* Named things clearly and consistently. The more clearly your names convey what a thing is and what it does, the easier the code is to read.
* Write unit tests. Unit tests not only test the code, but they also document what it’s expected to do.
* Leverage external tools: turn on compiler warnings, use on-the-fly/before-commit code analysis feature in IDE.

#### 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
##### a. A duck says: “Quack, quack”
##### b. A duck can swim
##### c. A chicken says: “Cluck, cluck”
##### d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
Now we have 2 more class: Duck and Chicken. Because they are still Bird so they should be extended from Bird class. And it's time to move sing behaviour to separated Interface and create a new Interface for swim behavior. Duck and Chicken will provide their own "sing" behaviour.

#### 3. Now how would you model a rooster?
The rooster is a male chicken, it's still a chicken so we create a new Rooster class and it should be extended from Chicken class.
##### a. A rooster says: “Cock-a-doodle-doo”
Rooster class will implement its own sing behaviour.
##### b. How is the rooster related to the chicken?
Since rooster is a chicken, their relationship should be modeled using class inheritance.
##### c. Can you think of other ways to model a rooster without using inheritance?
No, it's better to go with class inheritance.

#### 4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
Since a parrot is a tropical bird, their relationship should be modeled using class inheritance. We create Parrot class which is extended from Bird class.
##### a. A parrot living with dogs says: “Woof, woof”
##### b. A parrot living with cats says: “Meow”
##### c. A parrot living near the rooster says: “Cock-a-doodle-doo”
##### d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?
Since parrot has a special ability: parrot could "copy" the sing behaviour of "singable" objects, we use Decorator pattern which allows adding new behaviors to objects dynamically by placing them inside special wrapper objects. And a parrot is still a bird, in the case that parrot does not live near any singable animals, parrot still could sing from bird instinct.

### B. Model fish as well as other swimming animals

#### 1. In addition to the birds, can you model a fish?
##### a. Fishes don’t sing
##### b. Fishes don’t walk
##### c. Fishes can swim
Fish does not relate to Bird, but Fish is a kind of Animal so Fish should be extended from Animal, and Fish should implement its behaviour interfaces.

#### 2. Can you specialize the fish as a Shark and as a Clownfish?
##### a. Sharks are large and grey
##### b. Clownfish are small and colourful (orange)
##### c. Clownfish make jokes
##### d. Sharks eat other fish
Shark and Clownfish are 2 different kinds of Fish so they are 2 new classes which are extended from Fish class. They share the same properties: Size and Color, so we create 2 new instance variables for these properties in Fish class then we create constructors in Shark and Clownfish to set correct defaults value for them. Making jokes and eating other fish are 2 behaviour and they should be modeled as Interfaces.

#### 3. Dolphins are not exactly fish, yet, they are good swimmers
##### a. Can you model a dolphin that swims without inheriting from a fish class?
Yes, in reality, dolphin is a sea animal, not fish. So Dolphin class should be extended from Animal class and implement behaviour Interface to gain swim ability.
##### b. How do you avoid duplicating code or introducing unneeded overhead?
We always follow DRY (Don't Repeat Yourself) and KISS (Keep It Simple, Stupid).

### D. Model animals that change their behaviour over time
#### 1. Can you model a butterfly?
##### a. A butterfly can fly
##### b. A butterfly does not make a sound
Butterfly is an animal so we create new Butterfly class which is extended from Animal. Butterfly class should implement behaviour Interfaces.
#### 2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
##### a. A caterpillar cannot fly
##### b. A caterpillar can walk (crawl)
Since butterfly object can change its behaviour when its internal state change (from caterpillar to butterfly), we use State pattern to implement Butterfly model.

### E. Counting animals
The code to count animals by behaviours was put in Animal class and we could see it in action by run AnimalTest class.

## Class Diagram
In the end, we have the class diagram likes following:
![Alt text](externalFiles/ClassDiagram.png?raw=true "Class Diagram")