package scalablocks.model.block.`type`

import org.scalatest.flatspec.AnyFlatSpec
import scalablocks.model.block.generator.order.Orders


class ValueBlockTypeTest extends AnyFlatSpec {

  val valueBlockType: ValueBlockType = EmptyValueBlockType("test", Orders.NONE)

  "A ValueBlockType" should "have a return" in {
    assert(valueBlockType.hasReturn)
  }

}
