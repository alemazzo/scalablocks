package scalablocks.controller.workspace

import scalablocks.controller.ScalaBlockController
import scalablocks.model.environment.workspace.Workspace

trait WorkspaceController extends ScalaBlockController {
  private var workspace: Workspace = null
  def setWorkspace(workspace: Workspace): Unit = this.workspace = workspace

  def onWorkspaceChange(): Unit
}
