

object readLineDemo 
{
   def main(args :Array[String])
   {
      while(true)
      {
        val result = scala.io.StdIn.readLine()
        printf("\nUser have entered : %s",result)
      }
   }
}