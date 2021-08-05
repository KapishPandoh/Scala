// lazy keyword changes the val to get lazily initialized. 
// Lazy initialization means that whenever an object creation seems expensive, 
// the lazy keyword can be stick before val. 

// This gives it the advantage to get initialized in the first use 
// i.e. the expression inbound is not evaluated immediately but once on the first access.

object lazy_val 
{
   def main(args :Array[String])
   {
      lazy val value = {
                          println("Initialization")
                          100
                       }
      
      println("1st time : ")
      println(value)
      
      println("\n\n2nd time : ")
      println(value)
   }
}