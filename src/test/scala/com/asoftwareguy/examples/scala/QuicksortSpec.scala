package com.asoftwareguy.examples.scala

import org.scalatest._

class QuicksortSpec extends FlatSpec with Matchers {

  "Quicksort" should "sort values" in {
    val startArray = Array(6, 2, 5, 9, 1, 3)
    val expectedArray = Array(1, 2, 3, 5, 6, 9)
    val sortedArray = new Quicksort().sort(startArray)
    assert (sortedArray.deep == expectedArray.deep)
  }
}