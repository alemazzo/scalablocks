package scalablocks.model.block.generator

import scalablocks.model.block.Block
import scalablocks.model.block.generator.order.Orders.Order


trait Generator {
  type Code = (String, Order)
  def generate(block: Block): Code
}
