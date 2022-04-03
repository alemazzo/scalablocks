package scalablocks.model.environment.workspace

import scalablocks.model.block.Block


trait Workspace {
  def blocks: Seq[Block]
}
