/**
  * Created by tkujawa on 2016-01-27.
  */
import akka.actor.{ ActorRef, ActorSystem, Props, Inbox }



class SendMailAkkaScala extends App {
  println("test")
  val system = ActorSystem("mailsender")

  val sender = system.actorOf(Props[MailSender], "sender")

  val inbox = Inbox.create(system)

  sender.tell(SendMsg("sample@example.com"), ActorRef.noSender)
}
