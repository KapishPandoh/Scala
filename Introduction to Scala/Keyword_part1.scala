// 20 keywords used 

class Practice
{
   val name:String = "Kapish"
   var age:Int = 19
   
   def display()
   {
      printf("Name : %s\n",name)
      printf("Age  : %d\n",age)
      
      if(age<=18)
        printf("Sorry you are Minor\n")
      
      else
        printf("Welcome\n\n")
   }
   
   
   def add(n1:Int ,n2:Int):Int=
   {
      var sum = 0
      
      for(i <- n1 to n2)
        sum+=i
        
      return sum;
   }
   
   
   def using_yield()
   {
      val arr = Array( 8, 3, 1, 6, 4, 5)
      var value = for( ele<-arr  if ele>4) yield ele
      
      println("\n\nYield : ")
      for(i<-value)
        println(i)
   }
}

object Keyword_part1 
{
   def main(args :Array[String])
   {
      var obj = new Practice()
      obj.display()
      
      print("Enter n1 : ")
      var n1:Int = scala.io.StdIn.readInt()
      print("Enter n2 : ")
      var n2:Int = scala.io.StdIn.readInt()
      printf("Sum of no. between %d and  %d (including) = %d\n",n1,n2,obj.add(n1,n2))
      
      obj.using_yield()
      
      
      println("\n\nWhile loop :")
      var a = 5
      while(a>0)
      {
        println("a : "+a)
        a-=1
      }
      
      println("\n\nDo While loop :")
      var b = 1
      do
      {
        println("b : "+b)
        b+=1
      }while(b<=5)
      
      
      // anonymous function 
      println("\n\nAnonymous Function")
      val addOne = (x:Int) => x+1
      println(addOne(2))
      
      val getTheAnswer = () => 42
      println(getTheAnswer())
      
      
      var bool1:Boolean = false
      var bool2:Boolean = true
      if(bool1 && bool2)
        println("\n\nBoolean value is true")
      else
        println("\n\nBoolean value is false")
      
   }
}