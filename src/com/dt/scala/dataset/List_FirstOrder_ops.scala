package com.dt.scala.dataset

/**
 * Created by HuangYog on 2015/7/9.
 */
object List_FirstOrder_ops {
  def main(args: Array[String]) {

    println(List(1,2,3,4) ::: List(4,5,6,7,8) ::: List(9,10,11));
    println(List(1,2,3,4) ::: (List(4,5,6,7,8) ::: List(9,10,11)));
    println(List(1,2,3,4).length);

    val bigData = List("Hadoop", "Spark", "kaffka");
    println(bigData.last);
    println(bigData.init);
    println(bigData.reverse);
    println(bigData);
    println(bigData take 2);
    println(bigData drop 2);
    println(bigData splitAt 2);
    println(bigData apply 2);
    println(bigData(2));

    val data = List('a','b','c','d','e','f');
    println(data.indices);
    println(data.indices zip data);
    println(data.zipWithIndex);
    println(data.toString());
    println(data.mkString("[",",,","]"));
    println(data.mkString("^^"));
    println(data.mkString);

    val buffer = new StringBuilder();
    data addString(buffer,"<","**",">");
    println(buffer);
    println(data);

    val array = data.toArray
    println(array.toList);

    val newArray = new Array[Char](10);
    data.copyToArray(newArray);
    newArray.foreach( print );
    println();

    val itertor = data.toIterator
    println(itertor.next());
    println(itertor.next());

  }
}