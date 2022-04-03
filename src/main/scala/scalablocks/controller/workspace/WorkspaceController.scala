package scalablocks.controller.workspace

import scalablocks.controller.ScalaBlockController
import scalablocks.model.workspace.Workspace

trait WorkspaceController extends ScalaBlockController {
  def workspace: Workspace

  def onWorkspaceChange(): Unit
}
