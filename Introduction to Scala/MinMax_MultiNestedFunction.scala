// Que2. Write a function in scala that takes two numbers as parameters and returns the
// Maximum and Minimum of them. (Use Multi Nested Function)

object MinMax_MultiNestedFunction 
{
    def minAndmax(a:Int ,b:Int)=
    {
        //Nested Function - 01
        def findMin()=
        {
            // Nested Function - 02
            def minValue()=
            {
               if(a<b)
                 printf("Min : %d\n",a)
               else
                 printf("Min : %d\n",b)    
            }
            minValue()
        }
        
        
        //Nested Function - 01
        def findMax()=
        {
           // Nested Function - 02
            def maxValue()=
            {
               if(a>b)
                 printf("Max : %d\n",a)
               else
                 printf("Max : %d\n",b)    
            } 
            maxValue()
        } 
        
       findMin();
       findMax();
    }
    
    def main(args :Array[String])
    {
        val n1:Int = scala.io.StdIn.readInt()
        val n2     = scala.io.StdIn.readInt()
      
        printf("Min and Max from %d and %d\n",n1,n2)
        minAndmax(n1,n2)
    }
}
