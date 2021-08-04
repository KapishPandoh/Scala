

object Addition_using_ImmutableValues 
{
   def addition(n1:Int ,n2:Int) :Int=
   {
     val sum:Int = n1+n2
     return sum
     
     //return n1+n2
   }
   
   def main(args :Array[String])
   {
      print("Enter n1 : ")
      val n1:Int = scala.io.StdIn.readInt()
      print("Enter n2 : ")
      val n2:Int = scala.io.StdIn.readInt()
      
      println("\nSum : "+addition(n1,n2))
   }  
}