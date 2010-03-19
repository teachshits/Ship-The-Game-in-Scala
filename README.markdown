# SHIP THE GAME (in Scala)

Ship the Game is a my fun way to study Design Patterns and DDD programing. The goal here is not making a game or study a 
game framework, but create an application with good programing principles using layers, tests units, real OO, etc

The project was created Netbeans 6.8, using Java 6, but now I started to rewrite in Scala !!!

So far I did:

* The main application (ship.main.ShipApp)
* the bootstrap game class (ship.application.ShipGame)
* Helper classes: Positon, Time, Swing Utils, etc
* The UI uses Swing classes and is 2D. I'm trying to focus in a *TRUE* MVC implementation. Of course I'll love to see 
someone creating a 3D version.
* I'm plaining to create web services to the game, so it can be played anywhere for many people.
* Test units (JUnit an Specs). I'm new in TDD, so be paciente.

## Domain classes so far:
* Ship
* Sensor
* Power Grid
* Power Generator
* Move Behavior
* Battery

Many domain classes can be extended for more realistic implementations and complex behaviors, using the Strategy Design 
Pattern. I'm trying to keep the dependences at mininum level.

## For the future
* weapons and defence systems... FIGHT !!!
* Stelar bases and science outposts
* Some A.I. ships and NPCs
* Asteroids and minning

Please send me any critics, sugestions, ideas, etc. I promise to read and answer asap.

Felipe T. Farias

