package demo

import scala.concurrent.duration.DurationInt
import scala.util.control.NonFatal

import akka.actor.{ ActorSystem, Props, actorRef2Scala }
import kamon.Kamon

object Main extends App {

  Kamon.start()
  val system = ActorSystem("Main")
  val actor = system.actorOf(Props[HelloWorld], "HelloWorld")

  implicit val dispatcher = system.dispatcher

  system.scheduler.schedule(1 second, 5 seconds) {
    actor ! Greeter.Greet
  }

  Thread.sleep(60 * 60 * 1000)

  Kamon.shutdown()
  system.terminate()
  println("Shutdown")
}
