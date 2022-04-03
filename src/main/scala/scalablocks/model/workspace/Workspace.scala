package scalablocks.model.workspace

import scalablocks.model.block.Block

trait Workspace {
  def blocks: Seq[Block]
}
