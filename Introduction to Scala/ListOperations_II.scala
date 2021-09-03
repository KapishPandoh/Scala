//Que4. Write a program in scala to implement following functions using lists :
//      a. Builds a new list from the list without any duplicate elements.
//      b. Finds index of first occurrence of some value in the list after or at some start index.
//      c. Returns the length of the list.
//      d. Sorts the list 
//      e. Sums up the elements of this collection.
//      f. Converts the list to a string.
//      g. Finds the smallest element.
//      h. Finds the largest element.
//      i. Finds index of last occurrence of some value in the list before or at a given end index.
//      j. Converts this list to a map.

object ListOperations_II 
{
     def main(args :Array[String])
     {
        // a. Builds a new list from the list without any duplicate elements.
        val l1 = List(1, 1, 3, 3, 3, 5, 4, 5, 2)
        val res1 = l1.distinct
        println("Original list : " + l1)
        println("List without any duplicate elements : " + res1)
        
        //b. Find index of first occurrence of some value in the list after or at some start index.
        val l2 = List("Java","C#","Java","Scala","Scala","Java")
        val res2 = l2.indexOf("Java")
        println("\n\nOriginal list : " + l2)
        println("First occurrence of Java : " + res2)
        
        // c. Returns the length of the list.
        val l3 = List(1,2,3,4,5)
        val res3 = l3.length
        println("\n\nOriginal list : " + l3)
        println("Length of list  = " + res3)
        
        // d. Sorts the list 
        val l4 = List(10, 5, 8, 1, 7)
        val res4 = l4.sorted
        println("\n\nOriginal list : " + l4)
        println("Sorted list : " + res4)
        
        // e. Sums up the elements of this collection.
        val l5 = List(10, 5, 8, 1, 7)
        val res5 = l5.sum
        println("\n\nOriginal list : " + l5)
        println("Sum of List : " + res5)
        
        // f. Converts the list to a string.
        val l6 = List(10, 5, 8, 1, 7)
        val res6 = l6.toString
        println("\n\nOriginal list : " + l6)
        println("String List : " + res6)
        
        val l7 = List(10, 5, 8, 1, 7)
        println("\n\nOriginal list : " + l7)
        // g. Finds the smallest element.
        println("Smallest element : " + l7.min)
        // h. Finds the largest element.
        println("Largest element : " + l7.max)
        
        // i. Finds index of last occurrence of some value in the list before or at a given end index.
        val l8 = List(3, 6, 2, 9, 21, 9)
        println("\n\nOriginal list : " + l8)
        val res8 = l8.lastIndexOf(9)
        println("Last occurrence of 9 : " + res8)
        
        // j. Converts  list to a map.
        val l9 = List("C++", "JavaScript" , "Scala" , "Python")
        val l10 = List(1,2,3,4)
        val res9 = (l9 zip l10).toMap
        println("Mapped List : " + res9)
     }
}
