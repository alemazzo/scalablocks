package scalablocks.model.environment.output.console

import scalablocks.model.environment.output.Output

class ConsoleOutput extends Output {

  private var code: String = ""

  override def getCode: String = code

  override def setCode(code: String): Unit = {
    this.code = code
    println(code)
  }

}
