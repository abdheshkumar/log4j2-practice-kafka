package com.abtechsoft

import akka.actor.ActorSystem

/**
  * Created by abdhesh on 22/05/17.
  */
object AkkaEntryPoint extends App {

  val system = ActorSystem("my-actor-system")
  val myActor = system.actorOf(MyActor.props, MyActor.name)
  myActor ! "Test message from akka"
  myActor ! MyException(new Exception("Exception from akka application"))
}

case class MyException(ex: Exception)
