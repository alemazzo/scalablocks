package scalablocks.app

import scalablocks.controller.output.OutputController
import scalablocks.controller.toolbox.ToolboxController
import scalablocks.controller.workspace.WorkspaceController

trait ScalaBlockApp extends App {

  type _OutputController <: OutputController
  type _WorkspaceController <: WorkspaceController
  type _ToolboxController <: ToolboxController

  val _outputController: OutputController = new _OutputController
  val _workspaceController: WorkspaceController = new _WorkspaceController
  val _toolboxController: ToolboxController = new _ToolboxController

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

  initialize()
  run()

}
