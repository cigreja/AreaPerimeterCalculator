/*
 * Assignment a2
 * Area and Perimeter Calculator
 * Author:  Carlos Igreja
 * Due date: Tuesday, Sep 18 
*/
public class AreaAndPerimeterCalc 
{
    public static void main(String[] args) 
    {
        // display a welcome message
        System.out.println(
            "Welcome to the Area and Perimeter Calculator");
         System.out.println();  // print a blank line
         
         // calculate the area and perimeter
        double length = 3.25;
        double width = 2.75;
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        
        // format and display the result
        String message = "Length: " +  
            length + "\n" +
            "Width:  " + width + "\n" +
            "Area:    " + area + "\n" +
            "Perimeter:    " + perimeter + "\n";
        System.out.println(message);
    }//main
}//class AreaAndPerimeterCalc
