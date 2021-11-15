object Que6_Operation_on_List 
{
    def main(args:Array[String]) 
   { 
      println("Name           : Kapish Pandoh")
      println("Section        : DS")
      println("Class Roll No. : 76")
      println("Uni. Roll No.  : 2014702\n\n")
      
      val numList = List(1,2,1,4,2,5,2,3,6,2)
      println("Original List : " + numList)
      
      val l1 = numList.distinct
      println("\nList with Distinct element: " + l1)
      
      println("\nIndex of first occurence of 2 after 3 index: "+ numList.indexOf(2,3))
      
      println("\nLength of list: " + numList.length)
      
      println("\nSorting list in descending order: "+ numList.sorted(Ordering.Int.reverse))
      
      println("\nSum of list elements: "+numList.sum)
      
      println("\nList to string: "+numList.toString) 
      
      println("\nmax,min element: "+numList.max+" "+numList.min)
      
      println("\nIndex of last occurence of 2 after index 6: "+numList.lastIndexOf(2,6))
      
      println("\nList to map: "+numList.map(x=>x*2)); 
   }    
}