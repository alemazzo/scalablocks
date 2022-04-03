package scalablocks.model.block.`type`

import org.scalatest.flatspec.AnyFlatSpec
import scalablocks.model.block.generator.order.Orders




class UnitBlockTypeTest extends AnyFlatSpec {

  val unitBlockType: UnitBlockType = EmptyUnitBlockType("test", Orders.NONE)

  "A UnitBlockType" should "not have a return" in {
    assert(!unitBlockType.hasReturn)
  }

}
