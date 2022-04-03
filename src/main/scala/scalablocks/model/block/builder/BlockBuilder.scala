package scalablocks.model.block.builder

import scalablocks.model.block.{BlockField, BlockImpl, InputBlock, StatementBlock}
import scalablocks.model.Block
import scalablocks.model.block.`type`.BlockType

class BlockBuilder {

  private var blockType: BlockType = null
  private var fields: Seq[BlockField] = Seq()
  private var inputs: Seq[InputBlock] = Seq()
  private var statements: Seq[StatementBlock] = Seq()


  def withType(blockType: BlockType): BlockBuilder = {
    this.blockType = blockType
    this
  }

  def withFields(fields: Seq[BlockField]): BlockBuilder = {
    this.fields = fields
    this
  }

  def withInputs(inputs: Seq[InputBlock]): BlockBuilder = {
    this.inputs = inputs
    this
  }

  def withStatements(statements: Seq[StatementBlock]): BlockBuilder = {
    this.statements = statements
    this
  }

  def build(): Block = {
    new BlockImpl(blockType, fields, inputs, statements)
  }

}
