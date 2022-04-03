package scalablocks.controller.workspace

import scalablocks.controller.ScalaBlockController
import scalablocks.model.environment.workspace.Workspace

trait WorkspaceController(val workspace: Workspace) extends ScalaBlockController {
  def onWorkspaceChange(): Unit
}
