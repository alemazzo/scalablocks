package scalablocks.app

import scalablocks.controller.output.OutputController
import scalablocks.controller.toolbox.ToolboxController
import scalablocks.controller.workspace.WorkspaceController
import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

abstract class BasicScalaBlockApp[W <: Workspace, T <: Toolbox, O <: Output](override val outputController: OutputController,
                                                                             override val toolboxController: ToolboxController,
                                                                             override val workspaceController: WorkspaceController)
  extends ScalaBlockApp[W, T, O]{

  outputController.setOutput(environment.output)
  toolboxController.setToolbox(environment.toolbox)
  workspaceController.setWorkspace(environment.workspace)
}

