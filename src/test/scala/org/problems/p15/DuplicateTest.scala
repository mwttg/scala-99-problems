package org.problems.p15

import org.scalatest.{ Matchers, WordSpec }

class DuplicateTest extends WordSpec with Matchers {

  "P14 - #Duplicate" should {
    "should duplicate each element of a list by n" in {
      val actual = Duplicate.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      actual shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
  }
}