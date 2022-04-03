package scalablocks.model.output.console

import scalablocks.model.output.Output

class ConsoleOutput extends Output {

  private var code: String = ""

  override def getCode: String = code

  override def setCode(code: String): Unit = {
    this.code = code
    println(code)
  }

}
