package learn_gatling.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Requests {

  val computersList = http("Computers")
    .get("/computers")
    .check(status is 200)

  val createNew = http("Create New Comp")
    .post("/new")
    .formParam("""name""", """Beautiful Computer""") // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
    .formParam("""introduced""", """2012-05-30""")
    .formParam("""discontinued""", """""")
    .formParam("""company""", """37""")

}
