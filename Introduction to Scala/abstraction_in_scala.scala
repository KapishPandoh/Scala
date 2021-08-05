abstract class College
{
   final def myMethod()
   {
     println("Kapish Pandoh")
   }
   
   def details()
}


class Student extends College
{
   def details()
   {
     println("Subject : CSE")
     println("Age     : 19")
   }
}


object abstraction_in_scala 
{
    def main(args :Array[String])
    {
      var obj = new Student()
      obj.myMethod()
      obj.details()
    }
}