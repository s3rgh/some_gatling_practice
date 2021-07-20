package learn_gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.scenario.Simulation
import learn_gatling.config.Config.httpConfig
import learn_gatling.requests.Requests.computersList
import learn_gatling.scenarios.Scenarios.{scn1, scn2}

import scala.concurrent.duration.DurationInt

class LoadTests extends Simulation {

  setUp(scn1.inject(constantUsersPerSec(10) during (15 seconds)), scn2.inject(constantUsersPerSec(5) during (5 seconds)))
    .protocols(httpConfig)

}
