

object Operators 
{
   def main(args :Array[String])
   {
     var a = 10 
     var b = 4 
     var c = true
     var d = false 
     
     var result = 0
     
     // Arithmetic Operators
     println("Addition : "+(a+b))
     println("Subtraction : "+(a-b))
    
     // Relational Operators
     if(a==b)
       println("Equal to operator is True")
     else
       println("Equal to operator is False")
    
       
     // Logical Operator
     println("Logical OR : "+ (c||d) )
     
     // Bitwise AND
     println("Bitwise AND : "+ (a&b) )
     
     result = a&b
     println("Bitwise AND : "+ result )
     
     //Assignment Operator
     a+=b
     println("Addition Assignment Operator : "+ a )
     
   }
}