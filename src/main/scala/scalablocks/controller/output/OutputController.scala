package scalablocks.controller.output

import scalablocks.controller.ScalaBlockController
import scalablocks.model.environment.output.Output

abstract class OutputController(val output: Output) extends ScalaBlockController {
  def getCode: String = output.getCode
  def setCode(code: String) = output.setCode(code)
}
