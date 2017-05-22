package com.abtechsoft

import org.apache.logging.log4j.LogManager

/**
  * Created by abdhesh on 22/05/17.
  */
object Log4jMainEntryPoint extends App {
  val logger = LogManager.getLogger(getClass)
  logger.debug("This is a debug message")
  logger.info("This is an info message")
  logger.warn("This is a warn message")
  logger.error("This is an error message", new Exception("this is manually generated exception"))
  logger.fatal("This is a fatal message")
}
