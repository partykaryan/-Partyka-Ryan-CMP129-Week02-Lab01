import java.util.Scanner;

public class CelsiusTable {
  public static void main(String []args){

    Scanner keyboard = new Scanner(System.in);
    
  for (int i = 0; i<21; i++){
    double convertedTemp = celsius(i);
    System.out.print("The Temperature when it is " + i + " degrees Faranheit "); 
    System.out.printf("is %.2f" ,convertedTemp);
    System.out.print(" degrees Celsius");
    System.out.println();
   }//end of for loop

keyboard.close();
}//end of main method
 
//return method for converting celcius to faranheit
public static double celsius(double f){
    
    return (5.0/9.0) * (f - 32.0);
}
}//end of public class