

object patternMatching 
{
   // def matchTest(n: Int): String = n match
   def matchTest(n:Int)= n match
   {
     case 1 => "one"
     case 2 => "two"
     case _ => "many"
   }
   
   def main(args : Array[String])
   {
     println(matchTest(1))
     println(matchTest(3))
     println(matchTest(10))
   }
}