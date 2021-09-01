object ForLoop_MultipleRange 
{
    def main(args : Array[String])
    {
       var a=0
       var b=0
       
       for(a<-1 to 3 ; b<-11 to 13)
       {
         println("a : " + a)
         println("b : "+b)
       }
    }
}