package org.problems.p11

import org.scalatest.{ Matchers, WordSpec }

class RunLengthEncTest extends WordSpec with Matchers {
  "P11" should {
    "Modified run-length encoding" in {
      val actual = RunLengthEnc.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    }
  }
}
