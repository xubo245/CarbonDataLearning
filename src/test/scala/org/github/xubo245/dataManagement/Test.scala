package carbonDataLearning.dataManagement

/**
  * Created by root on 8/11/17.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=10.00001

    assert(Math.abs(a-b)<0.00002)
    println(Math.abs(a-b))
  }

}
