package scalablocks.model.environment

import scalablocks.model.environment.output.Output
import scalablocks.model.environment.toolbox.Toolbox
import scalablocks.model.environment.workspace.Workspace

case class Environment[W <: Workspace, T <: Toolbox, O <: Output]
  (val workspace: W, val toolbox: T, val output: O)
