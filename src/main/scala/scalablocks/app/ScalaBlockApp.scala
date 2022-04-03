package scalablocks.app

import scalablocks.controller.output.OutputController
import scalablocks.controller.toolbox.ToolboxController
import scalablocks.controller.workspace.WorkspaceController

trait ScalaBlockApp extends App {

  type _OutputController <: OutputController
  type _WorkspaceController <: WorkspaceController
  type _ToolboxController <: ToolboxController

  def outputController: OutputController = new _OutputController

  def workspaceController: WorkspaceController = new _WorkspaceController

  def toolboxController: ToolboxController = new _ToolboxController

  def initialize(): Unit

  def run(): Unit

  initialize()
  run()

}
