object Que2_calculator_using_InlineFunctions 
{
    def main(args :Array[String])
   {
       println("Name           : Kapish Pandoh")
       println("Section        : DS")
       println("Class Roll No. : 76")
       println("Uni. Roll No.  : 2014702")
       
       var add  = (a:Int,b:Int) => a+b
       var sub  = (a:Int,b:Int) => a-b
       var mult = (a:Int,b:Int) => a*b
       var div  = (a:Int,b:Int) => a/b
       
       print("\n\nEnter num1 : ")
       var n1 = scala.io.StdIn.readInt()
       print("Enter num2 : ")
       var n2 = scala.io.StdIn.readInt()
       
       println("\n1.Add \n2.Substract \n3.Multiply \n4.Division")
       var c = 'y'
       do
       {
          print("Enter Your choice : ")
          var ch = scala.io.StdIn.readInt();
          
          if(ch == 1) 
            println("Addition: "+add(n1,n2)); 

          else if(ch == 2) 
            println("Subtraction: "+sub(n1,n2)); 

          else if(ch == 3) 
            println("Multiplication: "+mult(n1,n2)); 

          else if(ch == 4) 
            println("Division: "+div(n1,n2)); 

          else 
            println("Wrong choice.");
          
          print("Want to do more calculation: (y/n) ")
          c = scala.io.StdIn.readChar();
       
       }while(c=='y');  
   }
}