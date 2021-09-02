// Que1. Write a function in scala that takes two numbers as parameters and returns the
// Maximum and Minimum of them. (Use Single Nested Function)

object MinMax_SingleNestedFunction
{
   //Function
   def minAndmax(a:Int ,b:Int)=
   {
        //Nested Function
        def minVal()=
        {
           if(a<b)
             printf("Min : %d\n",a)
           else
             printf("Min : %d\n",b)
        }
        
        //Nested Function
        def maxVal()=
        {
           if(a>b)
             printf("Max : %d\n",a)
           else
             printf("Max : %d\n",b)
        }
        
      minVal()
      maxVal()
   }
   
   def main(args :Array[String])
   {
      val n1:Int = scala.io.StdIn.readInt()
      val n2     = scala.io.StdIn.readInt()
      
      printf("Min and Max from %d and %d\n",n1,n2)
      minAndmax(n1,n2)
   }
} 