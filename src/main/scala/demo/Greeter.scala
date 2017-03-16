package demo

import akka.actor.Actor

object Greeter {
  case object Greet
}

class Greeter extends Actor {
  override def receive = {
    case Greeter.Greet =>
      println("Hello World!")
      context.stop(self)
  }
}
