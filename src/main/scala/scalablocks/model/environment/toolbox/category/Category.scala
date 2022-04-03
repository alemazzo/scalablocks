package scalablocks.model.environment.toolbox.category

import scalablocks.model.block.`type`.BlockType

trait Category {
  def name: String
  def blockTypes: Seq[BlockType]
}
