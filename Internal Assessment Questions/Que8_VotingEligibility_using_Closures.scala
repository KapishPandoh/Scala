object Que8_VotingEligibility_using_Closures 
{
    val ageLimit = 18
    
    val isEligible = (age:Int) => {
                                   if(age<ageLimit) "Eligible"
                                   else "Not Eligible"
                                  }
    
    def main(args:Array[String]) 
    { 
      println("Name           : Kapish Pandoh")
      println("Section        : DS")
      println("Class Roll No. : 76")
      println("Uni. Roll No.  : 2014702\n\n")
      
      printf("Age : 16 , %s " , isEligible(16))
      printf("\nAge : 48 , %s " , isEligible(48))
    }  
}