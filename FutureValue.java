import java.util.Scanner;

public class FutureValue {
    public static void main(String []args){

    Scanner keyboard = new Scanner(System.in);
    double presentValue;
    double interestRate;
    int months;
    double finalValue;

    System.out.print("What is the present value of the account ==> ");
    presentValue = keyboard.nextDouble();
    
    System.out.print("What is the monthly interest rate (Enter as decimal) ==> ");
    interestRate = keyboard.nextDouble();

    System.out.print("How many months will the money be left in the account ==> ");
    months = keyboard.nextInt();
    
    finalValue = futureValue(presentValue, interestRate, months);
    
    System.out.println();
    System.out.print("The future value of an account that has a starting principal of $" + presentValue +
     "\nwith a monthly interest rate of " + interestRate + " over " + months + " months ");
     System.out.printf("is %.2f", finalValue);

keyboard.close();
}//end of main method

//return method for calculating future value of account
public static double futureValue(double presentValue, double interestRate, int months){
    return presentValue * Math.pow((1 + interestRate), months);
}

}//end of public class
