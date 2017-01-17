package fpinscala.gettingstarted

object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def main(args: Array[String]): Unit = {
    println("my module running...")
  }
}
