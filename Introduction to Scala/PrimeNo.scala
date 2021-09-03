// Que2. Write a scala program to check the given number is a prime number or not. 
// (Number can be static or dynamic)

import scala.math.sqrt
object PrimeNo 
{
    def isPrime(n:Int) :Boolean =
    {
        if(n<2)
          return false
        
        if(n==2)
          return true
        
        else
        {
           var i = 0
           for(i <-2 to scala.math.sqrt(n).toInt )
           {
              if(n%i==0)
                return false
           }
        }
       return true
    }
    
    def main(args :Array[String])
    {
        val n = scala.io.StdIn.readInt()
        
        if(isPrime(n))
          printf("%d is Prime",n)
        else
          printf("%d is not Prime",n)
    }
}


