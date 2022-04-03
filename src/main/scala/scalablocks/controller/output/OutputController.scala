package scalablocks.controller.output

import scalablocks.controller.ScalaBlockController
import scalablocks.model.environment.output.Output

trait OutputController extends ScalaBlockController {
  private var output: Output = null
  def setOutput(output: Output): Unit = this.output = output

  def getCode: String = output.getCode
  def setCode(code: String) = output.setCode(code)
}
