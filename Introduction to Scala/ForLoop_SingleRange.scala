object ForLoop_SingleRange
{
   def main(args: Array[String])
   {
      var a=0
      print("Using to in for loop 1 to 10 : ")
      for(a <- 1 to 10)
        print(a +" ")
      
      print("\n\nUsing until in for loop 1 until 10 : ")
      for(a <- 1 until 10)
        print(a +" ")
   }
}