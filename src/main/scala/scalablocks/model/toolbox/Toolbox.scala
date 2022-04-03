package scalablocks.model.toolbox

import scalablocks.model.toolbox.category.Category


trait Toolbox {
  def categories: Seq[Category]
}
