package scalablocks.model.output

/**
 * Generic output class.
 */
trait Output {
  def getCode: String
  def setCode(code: String): Unit
}
