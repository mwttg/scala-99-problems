package org.problems.p02

import org.scalatest.{Matchers, WordSpec}

class LastButOneElementOfListTest extends WordSpec with Matchers {

  "P01 - #last" should {
    "return last element of list" in {
      val list   = List(1, 1, 2, 3, 5, 8)
      val actual = LastButOneElementOfList.penultimate(list)
      actual shouldBe 5
    }
  }
}
