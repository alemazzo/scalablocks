package scalablocks.controller.workspace

import scalablocks.controller.ScalaBlockController
import scalablocks.model.environment.workspace.Workspace

abstract class WorkspaceController(val workspace: Workspace) extends ScalaBlockController {
  def onWorkspaceChange(): Unit
}
