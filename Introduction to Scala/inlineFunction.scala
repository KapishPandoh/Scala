// Que5. Practice few inline or first class functions for below scenarios :
//       a. Adding one to an integer value
//       b. Check integer value is 0 or not
//       c. Add two numbers
//       d. Multiply two numbers

// Sample inline function - (x: Int) => x + 1 //adds one to a number

object inlineFunction 
{
   def main(args: Array[String]) 
   {
      // a. Adding one to an integer value
       print("Enter n1 : ")
       var n1 = scala.io.StdIn.readInt()
       var partA = (n:Int)=>n+1
       printf("a. Adding one to %d : %d\n\n",n1 ,partA(n1))
     
      // b. Check integer value is 0 or not
       print("Enter n2 : ")
       var n2 = scala.io.StdIn.readInt()
       var partB = (n:Int)=> if(n==0) 1 else 0
       printf("b. Check %d is 0 or not ,\n",n2)
       if(partB(n2)==1) printf("%d is 0\n\n",n2)
       else printf("%d is not 0\n\n",n2)
       
      // c. Add two numbers
       print("Enter n3 : ")
       var n3 = scala.io.StdIn.readInt()
       print("Enter n4 : ")
       var n4 = scala.io.StdIn.readInt()
       var partC = (a:Int ,b:Int)=>a+b
       printf("c. %d + %d = %d\n\n",n3,n4,partC(n3,n4))
       
      // d. Multiply two numbers
       print("Enter n5 : ")
       var n5 = scala.io.StdIn.readInt()
       print("Enter n6 : ")
       var n6 = scala.io.StdIn.readInt()
       var partD = (a:Int ,b:Int)=>a*b
       printf("d. %d * %d = %d\n\n",n5,n6,partD(n5,n6))
   }
}

