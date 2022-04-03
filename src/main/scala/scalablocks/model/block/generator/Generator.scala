package scalablocks.model.block.generator

import scalablocks.model.Block

trait Generator {
  def generate(block: Block): String
}
