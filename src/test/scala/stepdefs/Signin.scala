package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
//import support.DriverManager

import java.time.Duration

class Signin extends ScalaDsl with EN {

//  val driver = DriverManager.driver // Use driver from Hooks DriverManager
  val driver: WebDriver = new ChromeDriver()

  Given("""the user is on Login Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://parabank.parasoft.com/parabank/index.htm")
  }
  When("""the user enters valid username and password""") { () =>
    // Write code here
    driver.findElement(By.name("username")).sendKeys("john")
    driver.findElement(By.name("password")).sendKeys("demo")
  }
  And("""the user clicks login""") { () =>
    // Write code here
    driver.findElement(By.cssSelector("input[value='Log In']")).click()
  }
  Then("""the user should be logged in successfully""") { () =>
      // Write code here
      val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5))
      val header: WebElement = explicitWait.until(
        ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))
      )
      val actualHeader: String = header.getText
      val expectedHeader: String = "Accounts Overview"
      if (actualHeader == expectedHeader) {
        println("Login successful")
      }
    driver.quit()
  }
}