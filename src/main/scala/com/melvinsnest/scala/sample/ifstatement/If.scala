package com.melvinsnest.scala.sample.ifstatement
import scala.util.control.Exception.allCatch
/**
 * IF文の使用例
 */
object If {
  def main(args:Array[String]): Unit ={
    // 三項演算子的な書き方
    // 引数が存在するならIntに変換し、ないなら0をセットする
    val i = if(args.size > 0) args(0) else "0"
    println("入力値:%s".format(i))
    val iOpt = mod2or3Option(i)
    iOpt match {
      case Some(v) => println(v)
      case None => println("Intではありません")
    }
  }

  /**
   * 入力されたテキストをIntに変換してmod2or3を適用する<br>
   * Intにできない場合はNoneを返す
   * @param i 判定するテキスト
   * @return 判定結果
   */
  def mod2or3Option(i: String): Option[String] = {
    val opt = allCatch opt { i.toInt }
    return opt match {
      case Some(v) => Some(mod2or3(v))
      case None => None
    }
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