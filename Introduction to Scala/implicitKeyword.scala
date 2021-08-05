// if no value or parameter is passed to a method or function, 
// then the compiler will look for implicit value and pass it further as the parameter.

object implicitKeyword 
{
    def main(args : Array[String])
    {
        val s1:String = "Hello "
        implicit val s2:String = ",world !"
        
        def display(implicit str:String) = s1+str
        
        println("With Implicit parameter")
        println(display)
        
        println("\n\nWithout Implicit parameter")
        println(display("Everyone"))
    }
}