package scalablocks.model.environment

import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

trait Environment {
  def workspace: Workspace
  def toolbox: Toolbox
  def output: Output
}
