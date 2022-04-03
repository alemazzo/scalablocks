package scalablocks.model.environment

import org.scalatest.flatspec.AnyFlatSpec
import scalablocks.model.block.Block
import scalablocks.model.environment.output.console.ConsoleOutput
import scalablocks.model.environment.toolbox.Toolbox
import scalablocks.model.environment.toolbox.category.Category
import scalablocks.model.environment.toolbox.console.ConsoleToolbox
import scalablocks.model.environment.workspace.Workspace
import scalablocks.model.environment.workspace.console.ConsoleWorkspace

final class EnvironmentTest extends AnyFlatSpec {

  val workspace = new ConsoleWorkspace(Seq())
  val toolbox = new ConsoleToolbox(Seq())
  val output = new ConsoleOutput

  "An Environment" should "be created" in {
    val env = new Environment(workspace, toolbox, output)
    assert(env.isInstanceOf[Environment[workspace.type, toolbox.type, output.type]])
  }

  it should "have a workspace" in {
    val env = new Environment(workspace, toolbox, output)
    assert(env.workspace == workspace)
  }

  it should "have a toolbox" in {
    val env = new Environment(workspace, toolbox, output)
    assert(env.toolbox == toolbox)
  }

  it should "have an output" in {
    val env = new Environment(workspace, toolbox, output)
    assert(env.output == output)
  }

}
