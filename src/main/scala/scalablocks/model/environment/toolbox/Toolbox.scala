package scalablocks.model.environment.toolbox

import scalablocks.model.environment.toolbox.category.Category



trait Toolbox {
  def categories: Seq[Category]
}
