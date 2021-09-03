//Que3. Write a program in scala to reverse a list and 
//      for creating uniform list of size 10 using only one element in the list.

object ListOperations 
{
    def main(args :Array[String])
    {
        val myList: List[String] = List("C","C#","Java","Scala","PHP","Ruby")
        
        // reversing a list
        println("Original list : " + myList)
        println("Reverse list  : " + myList.reverse)
        
        
        // Repeats Scala 10 times.
        val lang = List.fill(10)("Scala") 
        println( "\n\nRepeats Scala 10 times : " + lang )
    }
}

