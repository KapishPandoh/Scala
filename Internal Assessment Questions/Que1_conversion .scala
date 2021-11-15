object Que1_conversion  
{
   def main(args :Array[String])
   {
       println("Name           : Kapish Pandoh")
       println("Section        : DS")
       println("Class Roll No. : 76")
       println("Uni. Roll No.  : 2014702")
       
       var fahren_to_cel = (temp:Double) => ((temp-32)*5)/9
       var inch_to_meter = (dist:Double) => dist*0.0254
       var year_to_days  = (n:Int) => n*365
       
       
       print("\n\nEnter Temp in Fahrenheit : ")
       var temp =  scala.io.StdIn.readDouble()
       printf("%.2f Fahrenheit =  %.2f Celsius \n\n" ,temp ,fahren_to_cel(temp))
       
       print("Enter Distance in Inches : ")
       var inc =  scala.io.StdIn.readDouble()
       printf("%.2f Inches =  %.2f Meters \n\n" ,inc ,inch_to_meter(inc))
       
       print("Enter no. of Years : ")
       var yr =  scala.io.StdIn.readInt()
       printf("%d Year =  %d Days \n\n" ,yr ,year_to_days(yr))
       
   }
}