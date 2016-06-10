package Main
import scala.actors._
import scala.actors.Actor._

object FilePrinter extends Actor {
  def act() = {
    loop {
      receive {
        case s:Directory => println(s.toTree())
        case "exit" => println("Exiting..."); exit()
      }
    }
  }
}