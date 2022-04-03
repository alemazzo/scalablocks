package scalablocks.model.block.`type`

import scalablocks.model.block.generator.{Generable, Generator}
import scalablocks.model.block.order.Order


trait BlockType extends Generable {

  def name: String

  def order: Order

  def fieldNames: Seq[String]

  def inputNames: Seq[String]

  def statementNames: Seq[String]

  def hasReturn: Boolean

}




