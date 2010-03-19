package br.eti.ftfarias

import br.eti.ftfarias.app._

// import scala.swing._

/*
 class ShipTheGame extends SimpleGUIApplication {
 def top = new MainFrame {
 title = "Second Swing App"
 val button = new Button {
 text = "Click me"
 }
 val label = new Label {
 text = "No button clicks registered"
 }
 contents = new BoxPanel(Orientation.Vertical) {
 contents += button
 contents += label
 border = Swing.EmptyBorder(30, 30, 10, 30)
 }
 }

 class ShipSwingUI extends SimpleGUIApplication {
 def top = new MainFrame {
 title = "First Swing App"
 contents = new Button {
 text = "Click me"
 }
 }
 }
 */

object ShipTheGame {
  def main(args: Array[String]) {
    println( "Starting Ship The Game" )
    val game = new Game();
    
    // GameController gameController = new GameControllerImpl(game);
    // MapController mapController = new MapControllerImpl(game.getPlayerShip());
    // new BasicPowerGridController((BasicPowerGrid) game.getPlayerShip().getPowerGrid());
  }
}





