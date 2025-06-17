package stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}

class StepDefinitions extends ScalaDsl with EN {

  Given("""the user is on Login Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }
}