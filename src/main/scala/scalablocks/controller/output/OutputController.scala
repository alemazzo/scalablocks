package scalablocks.controller.output

import scalablocks.controller.ScalaBlockController
import scalablocks.model.output.Output

trait OutputController extends ScalaBlockController{
  def output: Output

  def getCode: String = output.getCode
  def setCode(code: String) = output.setCode(code)
}
