package demo

import akka.actor.Actor
import akka.actor.Props
import akka.actor.actorRef2Scala

class HelloWorld extends Actor {

  override def preStart(): Unit = {
    // create the greeter actor
  }

  override def receive = {
    case Greeter.Greet => {
      val greeter = context.actorOf(Props[Greeter])
      // tell it to perform the greeting
      greeter ! Greeter.Greet
    }
  }
}
