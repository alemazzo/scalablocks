package scalablocks.model.block.`type`

import scalablocks.model.block.generator.Generator
import scalablocks.model.block.generator.order.Orders
import scalablocks.model.block.generator.order.Orders.Order




case class EmptyUnitBlockType(name: String, order: Order) extends UnitBlockType {
  override def fieldsNames: Seq[String] = Seq()

  override def inputsNames: Seq[String] = Seq()

  override def statementNames: Seq[String] = Seq()

  override def generator: Generator = (block) => ("", this.order)
}
