object Que10_Convert_UpperCase 
{
   def convert(str:String) :String=
   {
       str.take(str.length()-4) + str.drop(str.length()-4).toUpperCase()
   }
   
   def main(args:Array[String]) 
    { 
       println("Name           : Kapish Pandoh")
       println("Section        : DS")
       println("Class Roll No. : 76")
       println("Uni. Roll No.  : 2014702\n\n")
      
       println("Result: " + convert("scala"))
       println("Result: " + convert("cpp"))
    }
}