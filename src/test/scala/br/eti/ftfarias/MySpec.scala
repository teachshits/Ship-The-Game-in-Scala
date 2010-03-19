package br.eti.ftfarias

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}


class MySpecTest extends JUnit4(helloWorld)
//class MySpecSuite extends ScalaTestSuite(MySpec)
//object MySpecRunner extends ConsoleRunner(helloWorld)
/*
object MySpec extends Specification {
  "This wonderful system" should {
    "save the world" in {
      val list = Nil
      list must beEmpty
    }
  }
}
*/

object helloWorld extends Specification {
	"This wonderful system" should {
  "'hello world' has 11 characters" in {
     "hello world".size must_== 11
  }
  "'hello world' matches 'h.* w.*'" in {
     "hello world" must be matching("h.* w.*")
  }
	}
}