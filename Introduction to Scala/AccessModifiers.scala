class Private_Protected_Public
{
   private var a:Int = 10
   protected var b:Int = 20
   var c:Int = 30
   
   def showPrivate()
   {
     println("In Private_Access_Modifier : "+a)
   }
   
   
   def showPublic()
   {
      println("In Public_Access_Modifier : "+c)
   }
}

class SubClass extends Private_Protected_Public
{
   def showProtected()
   {
     println("In Protected_Access_Modifier : "+b)
   }
}

object AccessModifiers 
{
    def main(args:Array[String])
    {
       var obj1 = new Private_Protected_Public()
       // obj1.a = 12       ------>  Error
       obj1.showPrivate()
       
       var obj2 = new SubClass()
       obj2.showProtected()
       
       
       obj1.showPublic()
       
    }
}