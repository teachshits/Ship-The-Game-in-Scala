package br.eti.ftfarias

import scala.swing._

object ShipTheGame extends SimpleGUIApplication {def top = new MainFrame {title = "Second Swing App"val button = new Button {text = "Click me"}val label = new Label {text = "No button clicks registered"}contents = new BoxPanel(Orientation.Vertical) {contents += buttoncontents += labelborder = Swing.EmptyBorder(30, 30, 10, 30)}}



/*
object ShipTheGame {
  def main(args: Array[String]) {    println( "Starting Ship The Game" )
    for (arg <- args)      println(arg)  }
}


class ShipSwingUI extends SimpleGUIApplication {  def top = new MainFrame {    title = "First Swing App"    contents = new Button {      text = "Click me"    }   }}
*/

}