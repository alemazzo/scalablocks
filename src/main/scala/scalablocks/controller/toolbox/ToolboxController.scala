package scalablocks.controller.toolbox

import scalablocks.controller.ScalaBlockController
import scalablocks.model.toolbox.Toolbox

trait ToolboxController extends ScalaBlockController{
  private var toolbox: Toolbox = null
  def setToolbox(toolbox: Toolbox): Unit = this.toolbox = toolbox
}
