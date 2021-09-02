// Que4. Write a program in scala to check the number is even or odd(Multiple Nested Function)

object EvenOdd_MultipleNestedFunction 
{
    def oddAndEven(a:Int ,b:Int)=
    {
        // Nested Func - 01
        def findOdd()=
        {
            // Nested Func - 02
           def oddValue()=
            {
              if(a%2!=0)
                printf("%d is odd\n" ,a)
              if(b%2!=0)
               printf("%d is odd\n" ,b)  
            }
           oddValue()
        }
        
       // Nested Func - 01
       def findEven()=
       {
          //Nested Func - 02
          def evenValue()=
           {
             if(a%2==0)
               printf("%d is even\n" ,a)
             if(b%2==0)
               printf("%d is even\n" ,b)  
           }
         evenValue() 
       }
       
      findOdd 
      findEven() 
    }
    
    def main(args :Array[String])
    {
       val n1:Int = scala.io.StdIn.readInt()
       val n2     = scala.io.StdIn.readInt()
       
       oddAndEven(n1,n2)
    }  
}

