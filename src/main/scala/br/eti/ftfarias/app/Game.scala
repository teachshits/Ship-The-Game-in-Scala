package br.eti.ftfarias.app

import br.eti.ftfarias.domain._

class Game {

  println("Creating Universe... ")
  setupUniverse
  println("Creating Player and Ships... ")
  createPlayerAndShips
  println("Starting game timer ...")
  startTimer

  def setupUniverse = {
    val universe = new Universe;
  }

  def createPlayerAndShips = {

  }

  def startTimer = {
    
  }

  def exit = {
    println("Exiting game. Thanks for playing!");
    System.exit(0);
  }
}
