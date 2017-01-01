package com.melvinsnest.scala.sample.ifstatement
/**
 * IF文の使用例
 */
object If {
  def main(args:Array[String]): Unit ={
    // 三項演算子的な書き方
    // 引数が存在するならIntに変換し、ないなら0をセットする
    val i = if(args.size > 0) args(0).toInt else 0
    println("入力値:%d".format(i))
    println(mod2or3(i))
  }
 
  /**
   * 入力されたIntが<br>
   * 2でも3でも割り切れるなら「2でも3でも割り切れる」<br>
   * 2で割り切れるなら「2で割り切れる」<br>
   * 3で割り切れるなら「3で割り切れる」<br>
   * どれでもないなら入力値を文字列に変換して返す
   * @param i 判定する数値
   * @return 判定結果
   */
  def mod2or3(i: Int): String = {
    // if文は値を返すので返り値をreturnできる
    return if(i%2 == 0 && i%3 == 0){
      "2でも3でも割り切れる"
    } else if (i%2 == 0){
      "2で割り切れる"
    } else if (i%3 == 0){
      "3で割り切れる"
    } else {
      i.toString
    }
  }
}