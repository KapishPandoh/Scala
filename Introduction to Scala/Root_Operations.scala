// Que4. Write a scala program that reads a number(dynamic) and display its square, cube, and fourth power.
object Root_Operations 
{
    def main(args:Array[String])
    {
       print("Enter number: ")
       var n = scala.io.StdIn.readInt()
       
       println("Square of "+n+" : "+n*n);
       println("Cube of "+n+" : "+n*n*n);
       println("Fourth power of "+n+" : "+n*n*n*n);
       
    }
}