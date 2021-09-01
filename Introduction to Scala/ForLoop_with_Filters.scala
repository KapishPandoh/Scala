

object ForLoop_with_Filters {
  def main(args:Array[String])
  {
     var a = 0
     val numList = List(1,2,3,4,5,6,7,8,9,10,11,12)
     
     for( a<-numList
          if a!=3 ; if a<8)
     {
        print(a + " ");
     }
  }
} 