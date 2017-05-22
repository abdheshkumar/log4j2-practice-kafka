package com.abtechsoft

import akka.actor.{Actor, ActorLogging, Props}

/**
  * Created by abdhesh on 22/05/17.
  */
class MyActor extends Actor with ActorLogging {

  override def receive: Receive = {
    case message: String => log.info(s"Message from Akka application:$message")
    case ex: MyException => log.error(ex.ex, "exception should log into kakfa")
  }
}

object MyActor {
  def props: Props = Props[MyActor]

  def name: String = "my-actor"
}