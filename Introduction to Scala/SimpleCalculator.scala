// Que1. Develop a calculator for two numbers(user defined using console for input)using Scala
// Anonymous(Inline) function with following capability :
// a. Divide
// b. Multiply
// c. Subtract
// d. Addition


object SimpleCalculator 
{
    def main(args :Array[String])
    {
       print("Enter n1 : ")
       val n1 = scala.io.StdIn.readInt()
       print("Enter n2 : ")
       val n2 = scala.io.StdIn.readInt()
       
       val add = (n1:Int ,n2:Int)=> n1+n2
       printf("\nAddition , %d + %d = %d\n" ,n1,n2,add(n1,n2) )
       
       val sub = (n1:Int ,n2:Int)=> n1-n2
       printf("\nSubtract , %d - %d = %d\n" ,n1,n2,sub(n1,n2) )
       
       val mult = (n1:Int ,n2:Int)=> n1*n2
       printf("\nMultiply , %d * %d = %d\n" ,n1,n2,mult(n1,n2) )
       
       
       if(n2!=0)
       {
         val div = (n1:Int ,n2:Int)=> n1/n2
         printf("\nDivide , %d / %d = %d\n" ,n1,n2,div(n1,n2) )
       }
       else
         println("\nDivision not possible")
    }
}