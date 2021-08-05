

object Exception_Handling 
{
   def func(age:Int)=
   {
      if(age<20)
        throw new Exception("Not Eligible")
      else
        println("Eligible")
        
   }
   
   def main(args :Array[String])
   {
      print("Enter your age : ")
      var age:Int = scala.io.StdIn.readInt()
      try
      {
         func(age)  
      }
      
      catch
      {
        case ex : Exception => println("Exception from main \n" + ex)
      }
      
      finally
      {
        println("Finallyblock : Runs everytime")
      }
      
      println("Out of blocks")
   }
   
}