package scalablocks.model.block.generator.order

object Orders extends Enumeration {
  type Order = Value
  val NONE: Order = Value(0)
  val ATOMIC: Order = Value(99)
}
