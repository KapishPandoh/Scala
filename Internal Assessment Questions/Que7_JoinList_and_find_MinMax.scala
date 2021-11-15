object Que7_JoinList_and_find_MinMax 
{
   def main(args:Array[String]) 
   { 
      println("Name           : Kapish Pandoh")
      println("Section        : DS")
      println("Class Roll No. : 76")
      println("Uni. Roll No.  : 2014702\n\n")
      
      val l1 = List(99.5,100.0,50.0,55.0,70.0,100.0,-1.0) 
      val l2 = List(10.0,20.0,30.0,40.0,50.0)  
      val l3 = l1:::l2
      
      println("List1       : " + l1)
      println("List2       : " + l2)
      println("Joined List : " + l3)
      println("Min Literal : " + l3.min) 
      println("Max Literal : " + l3.max) 
   }      
}