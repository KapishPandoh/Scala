// Que3. Write a program in scala to check the number is even or odd(Single Nested Function)

object EvenOdd_SingleNestedFunction 
{
    def oddAndEven(a:Int ,b:Int)=
    {
        // Nested Func
        def oddValue()=
        {
          if(a%2!=0)
            printf("%d is odd\n" ,a)
          if(b%2!=0)
            printf("%d is odd\n" ,b)  
        }
        
       // Nested Func
       def evenValue()=
       {
          if(a%2==0)
            printf("%d is even\n" ,a)
          if(b%2==0)
            printf("%d is even\n" ,b)  
       }
       
      oddValue() 
      evenValue() 
    }
    
    def main(args :Array[String])
    {
       val n1:Int = scala.io.StdIn.readInt()
       val n2     = scala.io.StdIn.readInt()
       
       oddAndEven(n1,n2)
    }
}
