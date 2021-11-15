import scala.collection.immutable.ListMap

object Que9_SortMap 
{
   def main(args:Array[String]) 
    { 
      println("Name           : Kapish Pandoh")
      println("Section        : DS")
      println("Class Roll No. : 76")
      println("Uni. Roll No.  : 2014702\n\n")
      
      
      val a = Map( 
                   "Bill"   -> 56,  
                   "Jhonny" -> 87, 
                   "Tommy"  -> 11, 
                   "Chenna" -> 13
                 )
                 
      val res = ListMap(a.toSeq.sortWith(_._1 > _._1):_*)
      
      println("Map        : " + a) 
      println("Sorted map : " + res)  
    }  
}