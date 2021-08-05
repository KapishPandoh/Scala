class CSE
{
   def read()
   {
     println("I was reading")
   }
}

class Scala extends CSE
{
   var name:String = ""
   def this(name:String)
   {
      this()
      this.name = name
   }
   
   def show()
   {
     println("Your are : "+name)  
   }
   
   override def read()
   {
     println("I am reading")
   }
   
   def scalaReadMethod()
   {
     super.read
   }
}

object Super_override_this_keyword
{
    def main(args :Array[String])
    {
       var obj = new Scala("Kapish Pandoh")
       obj.show()
       obj.read()
       obj.scalaReadMethod()
    }
}