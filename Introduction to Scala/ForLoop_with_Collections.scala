

object ForLoop_with_Collections 
{
   def main(args:Array[String])
   {
      var a=0
      val numList = List(1,2,3,4,5,6,7,8)
      for(a<-numList)
        print(a+" ")
      
      println()
      val b=0
      for(b<-numList)
        print(b+" ")
   }
}