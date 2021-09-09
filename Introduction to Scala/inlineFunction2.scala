

object inlineFunction2 {
  def main(args: Array[String]) 
   {
       var part = (n:Int)=> { 
                              if(n==0) "Yes" 
                              else "No"
                            }
  
       println(part(0))
   
       
      
   }
}