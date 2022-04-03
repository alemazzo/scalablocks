package scalablocks.model.environment

import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

final case class Environment[W <: Workspace, T <: Toolbox, O <: Output]
  (val workspace: W, val toolbox: T, val output: O)
