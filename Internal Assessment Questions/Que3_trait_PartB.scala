trait car1
{
   def c1  
}

trait car2
{
   def c2 
}

class Cars extends car1 with car2
{
   def c1()
   {
      println("Trait1 - Car1")
   }
   
   def c2()
   {
      println("Trait2 - Car2")
   }
}

object Que3_trait_PartB 
{
    def main(args :Array[String])
   {
       println("Name           : Kapish Pandoh")
       println("Section        : DS")
       println("Class Roll No. : 76")
       println("Uni. Roll No.  : 2014702\n\n")
       
       val obj = new Cars()
       obj.c1
       obj.c2
   }
}