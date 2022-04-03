package scalablocks

trait ScalaBlockApp extends App {
  
  def initialize(): Unit
  def run(): Unit

  initialize()
  run()

}
