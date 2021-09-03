// Que2. Implement Built in operations of scala list by entering student details.


object BuiltInOperations 
{
    def main(args :Array[String])
    {
        val myList = List("Rohan", "Andreas", "Rob", "John")
       
        //head: returns first element in the list.
        println("Head of List  : " + myList.head)
        
        //tail: returns all the elements except the first element in the list.
        println("Tail of List  : " + myList.tail)
        
        //isEmpty: returns true if the list is empty.
        println("Is List Empty : " + myList.isEmpty)
        
        //reversing a list
        println("Original list : " + myList)
        println("Reverse list : " + myList.reverse)
        
        
        val age = Nil
        println("Is AGE Empty : " + age.isEmpty)  
    }
}
