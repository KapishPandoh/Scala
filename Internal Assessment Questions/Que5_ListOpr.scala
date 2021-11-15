object Que5_ListOpr 
{
   def main(args:Array[String]) 
   { 
      println("Name           : Kapish Pandoh")
      println("Section        : DS")
      println("Class Roll No. : 76")
      println("Uni. Roll No.  : 2014702\n\n")
      
      val nameList = List("Rohan", "Andreas", "Rob", "John") 
      
      println("List : " + nameList)
      
      println("\nList Head : " + nameList.head)
      println("List Tail : " + nameList.tail)
      println("List Init : " + nameList.init)
      println("List Last : " + nameList.last)
      
      println("\nList Reverse : " + nameList.reverse)
      println("List isEmpty : " + nameList.isEmpty)
   }  
}