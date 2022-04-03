package scalablocks.model.block.`type`

import scalablocks.model.block.generator.Generator
import scalablocks.model.block.generator.order.Orders.Order

final case class EmptyValueBlockType(name: String, order: Order) extends ValueBlockType {
  override def fieldsNames: Seq[String] = Seq()

  override def inputsNames: Seq[String] = Seq()

  override def statementNames: Seq[String] = Seq()

  override def generator: Generator = (block) => ("", this.order)
}
