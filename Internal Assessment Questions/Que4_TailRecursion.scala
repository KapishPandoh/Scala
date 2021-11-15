import scala.annotation.tailrec;

object Que4_TailRecursion 
{
    @tailrec 
    def fact(ans:Int ,n:Int) :Int =
    {
       if(n==1) ans
       else fact(n*ans ,n-1)
    }
    
    @tailrec
    def gcd(a:Int ,b:Int) :Int = 
    {
       if(b==0) a
       else gcd(b ,a%b)
    }
    
    
    def main(args :Array[String])
    {
        println("Name           : Kapish Pandoh")
        println("Section        : DS")
        println("Class Roll No. : 76")
        println("Uni. Roll No.  : 2014702\n\n")
        
        println("Factorial of 6 : " + fact(1,6))
        println("GCD of 78,24   : " + gcd(78,24))
    }
}