package scalablocks.model.block.`type`

import scalablocks.model.block.generator.Generator
import scalablocks.model.block.order.Order

trait BlockType {

  def name: String

  def order: Order

  def fieldNames: Seq[String]

  def inputNames: Seq[String]

  def statementNames: Seq[String]

  def hasReturn: Boolean

  def generator: Generator

}




