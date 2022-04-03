package scalablocks.model.block

import scalablocks.model.block.`type`.BlockType

class BlockImpl(
                          val blockType: BlockType,
                          override val fields: Seq[BlockField],
                          override val inputs: Seq[InputBlock],
                          override val statements: Seq[StatementBlock]
                        ) extends Block {

}