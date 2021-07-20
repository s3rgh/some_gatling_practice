package learn_gatling.scenarios

import io.gatling.core.Predef.scenario
import learn_gatling.requests.Requests.{computersList, createNew}

object Scenarios {

  val scn1 = scenario("MyStudyScenario1")
    .exec(computersList)

  val scn2 = scenario("MyStudyScenario2")
    .exec(createNew)
}
