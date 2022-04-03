package scalablocks.model.block

import scalablocks.model.block.`type`.BlockType
import scalablocks.model.block.builder.BlockBuilder

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


  //////////////////////////////////////////////////////////////////////////////
  // Functionalities
  //////////////////////////////////////////////////////////////////////////////

  /**
   * Get the field with the given name.
   * @param name: the name of the field.
   * @return the field with the given name if it exists.
   */
  def getField(name: String): Option[BlockField] = {
    fields.find(_.name == name)
  }

  /**
   * Get the field with the given index.
   * @param index: the index of the field.
   * @return the field with the given index if it exists.
   */
  def getField(index: Int): Option[BlockField] = {
    fields.lift(index)
  }

  /**
   * Get the input with the given name.
   * @param name: the name of the input.
   * @return the input with the given name if it exists.
   */
  def getInput(name: String): Option[InputBlock] = {
    inputs.find(_.name == name)
  }

  /**
   * Get the input with the given index.
   * @param index: the index of the input.
   * @return the input with the given index if it exists.
   */
  def getInput(index: Int): Option[InputBlock] = {
    inputs.lift(index)
  }

  /**
   * Get the statement with the given name.
   * @param name: the name of the statement.
   * @return the statement with the given name if it exists.
   */
  def getStatement(name: String): Option[StatementBlock] = {
    statements.find(_.name == name)
  }

  /**
   * Get the statement with the given index.
   * @param index: the index of the statement.
   * @return the statement with the given index if it exists.
   */
  def getStatement(index: Int): Option[StatementBlock] = {
    statements.lift(index)
  }

}

object Block {

  /**
   * Get a Block builder.
   * @return A Block builder.
   */
  def builder: BlockBuilder = new BlockBuilder
}


