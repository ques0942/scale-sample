package com.melvinsnest.scala.sample.ifstatement

import org.scalatest.FunSpec
import org.scalatest.Matchers

class IfSpec extends FunSpec with Matchers{
  describe("mod2or3") {
    it("入力が0なら「2でも3でも割り切れる」を返さなければならない"){
      assert(If.mod2or3(0) == "2でも3でも割り切れる")
    }
    it("入力が1なら「1」を返さなければならない") {
    assert(If.mod2or3(1) == "1")
    }
    it("入力が2なら「2で割り切れる」を返さなければならない") {
      assert(If.mod2or3(2) == "2で割り切れる")
    }
    it("入力が3なら「3で割り切れる」を返さなければならない") {
      assert(If.mod2or3(3) == "3で割り切れる")
    }
  }
  
  describe("mod2or3Option"){
    it("入力が0なら「2でも3でも割り切れる」を返さなければならない"){
      assert(If.mod2or3Option("0").get == "2でも3でも割り切れる")
    }
    it("入力が1なら「1」を返さなければならない") {
      assert(If.mod2or3Option("1").get == "1")
    }
    it("入力が2なら「2で割り切れる」を返さなければならない") {
      assert(If.mod2or3Option("2").get == "2で割り切れる")
    }
    it("入力が3なら「3で割り切れる」を返さなければならない") {
      assert(If.mod2or3Option("3").get == "3で割り切れる")
    }
    it("入力が「テスト」なら「None」を返さなければならない"){
      assert(If.mod2or3Option("テスト") == None)
    }
  }
}