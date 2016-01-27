import akka.actor.Actor

import scala.util.Random

/**
  * Created by tkujawa on 2016-01-27.
  */

case class ChangeMsg(msg: String)
case class SendMsg(email: String)
case class Confirm(elapsed: String)

class MailSender extends Actor {
  var msg = "BLA BLA BLA"

  def receive = {
    case ChangeMsg(message) => msg = message
    case SendMsg(email) => {
      println("attempting to send msg")
      val random = Random.nextInt(10000)
      Thread.sleep(random)
      println(s"send TO: $email, MSG: <<$msg>> , after $random")
      sender ! Confirm(random.toString)}
  }
}
