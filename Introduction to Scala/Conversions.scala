//Que3. Write a scala program to convert :
//      a. temperature from Fahrenheit to Celsius degree
//      b. a number in inches to meters 
//      c. Year to number of days.

object Conversions 
{
    def fahrenheit_to_celsius(temp:Float)=
    {
       var res = ((temp-32)*5)/9
       printf("%f Fahrenheit = %f Celsius" ,temp ,res)
    }
    
    def inches_to_meters(dist:Float)=
    {
       val conv = 39.37
       var res = dist/conv
       printf("%f Inches = %f Meters " ,dist ,res)
    }
    
    def year_to_days(n:Int)=
    {
        var res = n*365
        printf("%d Year = %d number of days" ,n ,res)
    } 
    
    def main(args:Array[String])
    {
       print("Enter temp in Fahrenheit : ")
       val temp_Fahrenheit = scala.io.StdIn.readFloat()
       fahrenheit_to_celsius(temp_Fahrenheit)
       
       print("\n\nEnter dist in inches : ")
       val inches = scala.io.StdIn.readFloat()
       inches_to_meters(inches)
       
       print("\n\nEnter no of years : ")
       val years = scala.io.StdIn.readInt()
       year_to_days(years)
    }
}