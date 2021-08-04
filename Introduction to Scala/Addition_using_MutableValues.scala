

object Addition_using_MutableValues 
{
  
   def addition(n1:Int ,n2:Int) :Int=
   {
     var sum:Int = 0
     sum = n1+n2
     return sum
     
     //return n1+n2
   }
   
   def main(args :Array[String])
   {
      print("Enter n1 : ")
      var n1:Int = scala.io.StdIn.readInt()
      print("Enter n2 : ")
      var n2:Int = scala.io.StdIn.readInt()
      
      println("\nSum : "+addition(n1,n2))
   }

}