package scalablocks.app

import scalablocks.controller.output.OutputController
import scalablocks.controller.toolbox.ToolboxController
import scalablocks.controller.workspace.WorkspaceController
import scalablocks.model.environment.Environment
import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

trait ScalaBlockApp[W <: Workspace, T <: Toolbox, O <: Output] extends App {

  val environment: Environment[W, T, O] = new Environment[W, T, O]

  val _outputController: OutputController = new OutputController {
    override val output: Output = environment.output
    override def initialize: Unit = {}
  }

  val _workspaceController: WorkspaceController = new WorkspaceController {
    override def workspace: Workspace = environment.workspace
    override def onWorkspaceChange(): Unit = {}
    override def initialize: Unit = {}
  }

  val _toolboxController: ToolboxController = new ToolboxController {
    override def toolbox: Toolbox = environment.toolbox
    override def initialize: Unit = {}
  }


  /**
   * Get the output controller.
   * @return the output controller.
   */
  def outputController: OutputController = _outputController

  /**
   * Get the workspace controller.
   * @return the workspace controller.
   */
  def workspaceController: WorkspaceController = _workspaceController

  /**
   * Get the toolbox controller.
   * @return the toolbox controller.
   */
  def toolboxController: ToolboxController = _toolboxController

  /**
   * Initializes the application.
   */
  def initialize(): Unit

  /**
   * Runs the application.
   */
  def run(): Unit

  //////////////////////////////////////////////////////////////////////////////
  //                                  Main                                    //
  //////////////////////////////////////////////////////////////////////////////

  _outputController.initialize
  _workspaceController.initialize
  _toolboxController.initialize
  initialize()
  run()

}
