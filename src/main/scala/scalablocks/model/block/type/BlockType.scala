package scalablocks.model.block.`type`

import scalablocks.model.block.generator.order.Orders
import scalablocks.model.block.generator.order.Orders.Order
import scalablocks.model.block.generator.{Generable, Generator}



trait BlockType extends Generable {

  def name: String

  def order: Order

  def fieldsNames: Seq[String]

  def inputsNames: Seq[String]

  def statementNames: Seq[String]

  def hasReturn: Boolean

}




