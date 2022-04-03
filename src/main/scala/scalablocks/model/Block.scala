package scalablocks.model

import scalablocks.model.block.`type`.BlockType
import scalablocks.model.block.builder.BlockBuilder
import scalablocks.model.block.{BlockField, InputBlock, StatementBlock}

/**
 * Definition of a block.
 */
trait Block {

  //////////////////////////////////////////////////////////////////////////////
  // Core
  //////////////////////////////////////////////////////////////////////////////

  /**
   * The type of the block.
   */
  def blockType: BlockType

  /**
   * The fields of the block.
   */
  def fields: Seq[BlockField]

  /**
   * The inputs of the block.
   */
  def inputs: Seq[InputBlock]

  /**
   * The statements of the block.
   */
  def statements: Seq[StatementBlock]


  ///////////////////////////////////////////////////////////////////////////
  // Derived
  ///////////////////////////////////////////////////////////////////////////

  /**
   * The next block in the block chain.
   * @return An option containing the next block in the block chain.
   */
  def nextBlock: Option[Block]

  /**
   * The previous block in the block chain.
   * @return An option containing the previous block in the block chain.
   */
  def previousBlock: Option[Block]

}

object Block {

  /**
   * Get a Block builder.
   * @return A Block builder.
   */
  def builder: BlockBuilder = new BlockBuilder
}


