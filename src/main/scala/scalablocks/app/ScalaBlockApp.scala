package scalablocks.app

import scalablocks.controller.output.OutputController
import scalablocks.controller.toolbox.ToolboxController
import scalablocks.controller.workspace.WorkspaceController
import scalablocks.model.environment.Environment
import scalablocks.model.output.Output
import scalablocks.model.toolbox.Toolbox
import scalablocks.model.workspace.Workspace

abstract class ScalaBlockApp[W <: Workspace, T <: Toolbox, O <: Output]
  (val environment: Environment[W, T, O]) extends App {

  /**
   * Get the output controller.
   * @return the output controller.
   */
  def outputController: OutputController

  /**
   * Get the workspace controller.
   * @return the workspace controller.
   */
  def workspaceController: WorkspaceController

  /**
   * Get the toolbox controller.
   * @return the toolbox controller.
   */
  def toolboxController: ToolboxController

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

  workspaceController.initialize
  toolboxController.initialize
  outputController.initialize

  initialize()
  run()

}
