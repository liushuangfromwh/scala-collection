package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/26
  */
object IsEmptyDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable.empty
    println(t.isEmpty)
    println(t.nonEmpty)
    println(!t.isEmpty)
    println(t.size != 0) // O(n) 不推荐

    val t1 = Traversable.empty
    val t2 = Traversable()
    val t3 = Nil
    println(t1 == t2) //true
    println(t2 == t3) //true
    println(t1 == t3) //true


  }
}
