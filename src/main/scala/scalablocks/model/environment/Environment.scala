package scalablocks.model.environment

import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

case class Environment[W <: Workspace, T <: Toolbox, O <: Output](
                                                                   workspace: W = new W,
                                                                   toolbox: T = new T,
                                                                   output: O = new O
                                                                 )
