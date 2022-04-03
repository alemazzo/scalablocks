package scalablocks.controller.workspace

import scalablocks.controller.ScalaBlockController
import scalablocks.model.workspace.Workspace

abstract class WorkspaceController(val workspace: Workspace) extends ScalaBlockController {
  def onWorkspaceChange(): Unit
}
