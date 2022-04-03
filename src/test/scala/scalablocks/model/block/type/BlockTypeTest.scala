package scalablocks.model.block.`type`

import org.scalatest.flatspec.AnyFlatSpec
import scalablocks.model.block.generator.order.Orders

class BlockTypeTest extends AnyFlatSpec {

  val blockType: BlockType = EmptyUnitBlockType("test", Orders.NONE)

  "A BlockType" should "have a name" in {
    assert(blockType.name == "test")
  }

  it should "have an order" in {
    assert(blockType.order == Orders.NONE)
  }

}
