trait Car
{
    val model :String
    val price :Float
    
    def speed
    def engine
}


class TataMotors extends Car
{
    val model = "Nano"
    val price = 2.85f
    
    def speed()
    {
      println("Spped : 120 to 150 kmph")
    }
    
    def engine()
    {
       println("Engine : 1995 to 1998 cc")
    }
}

object Que3_trait_PartA
{
   def main(args :Array[String])
   {
       println("Name           : Kapish Pandoh")
       println("Section        : DS")
       println("Class Roll No. : 76")
       println("Uni. Roll No.  : 2014702")
       
       val obj = new TataMotors()
       println("\n\nModel Name : " + obj.model)
       println("Model Price :" + obj.price + " Lakhs")
       obj.speed()
       obj.engine
   }
}